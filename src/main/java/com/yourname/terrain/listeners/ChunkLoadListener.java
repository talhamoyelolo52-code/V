package com.yourname.terrain.listeners;

import com.yourname.terrain.MyTerrainPlugin;
import com.yourname.terrain.biome.BiomeBase;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.Random;

public class ChunkLoadListener implements Listener {

    private final MyTerrainPlugin plugin;
    private final Random random = new Random();

    public ChunkLoadListener(MyTerrainPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent event) {
        if (!event.isNewChunk()) return;

        Chunk chunk = event.getChunk();
        Location center = chunk.getBlock(8, 64, 8).getLocation();

        BiomeBase biome = plugin.getBiomeManager().getBiomeAt(center);
        if (biome == null) return;

        // 20% chance to spawn structure in new chunk
        if (random.nextDouble() < 0.2) {
            Location structLoc = center.clone().add(
                random.nextInt(10) - 5, 
                0, 
                random.nextInt(10) - 5
            );
            structLoc.setY(structLoc.getWorld().getHighestBlockYAt(structLoc));

            // Check if this is a BOSS biome (very rare)
            if (plugin.getBiomeManager().isBossBiome(biome.getId())) {
                // 80% chance to spawn BOSS in structure
                if (random.nextDouble() < 0.8) {
                    plugin.getStructureManager().generateBossStructure(structLoc, biome);
                } else {
                    plugin.getStructureManager().generateStructure(structLoc, biome.getStructureId());
                }
            } else {
                plugin.getStructureManager().generateStructure(structLoc, biome.getStructureId());
            }
        }

        // Spawn mobs
        biome.spawnMobs(center.getBlockX(), center.getBlockZ());
    }
}