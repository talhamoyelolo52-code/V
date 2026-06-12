package com.yourname.terrain.generator;

import org.bukkit.block.Biome;
import org.bukkit.generator.WorldInfo;

import java.util.Random;

public class BiomeProvider extends org.bukkit.generator.BiomeProvider {

    private final Random random = new Random();

    @Override
    public Biome getBiome(WorldInfo worldInfo, int x, int y, int z) {
        // Return vanilla biome based on custom logic
        return Biome.PLAINS;
    }

    @Override
    public Biome[] getBiomes(WorldInfo worldInfo) {
        return new Biome[]{
            Biome.PLAINS, Biome.FOREST, Biome.DESERT, Biome.OCEAN,
            Biome.BEACH, Biome.SAVANNA, Biome.JUNGLE, Biome.BIRCH_FOREST
        };
    }
}