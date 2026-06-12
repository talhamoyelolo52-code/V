package com.yourname.terrain.generator;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class CustomChunkGenerator extends ChunkGenerator {

    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        ChunkData chunkData = createChunkData(world);

        // Basic terrain generation - customize with noise
        for (int cx = 0; cx < 16; cx++) {
            for (int cz = 0; cz < 16; cz++) {
                int height = 64 + random.nextInt(20);
                for (int y = 0; y < height; y++) {
                    if (y == 0) chunkData.setBlock(cx, y, cz, org.bukkit.Material.BEDROCK);
                    else if (y < height - 5) chunkData.setBlock(cx, y, cz, org.bukkit.Material.STONE);
                    else if (y < height - 1) chunkData.setBlock(cx, y, cz, org.bukkit.Material.DIRT);
                    else chunkData.setBlock(cx, y, cz, org.bukkit.Material.GRASS_BLOCK);
                }
            }
        }

        return chunkData;
    }
}