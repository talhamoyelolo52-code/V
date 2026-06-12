package com.yourname.terrain.listeners;

import com.yourname.terrain.MyTerrainPlugin;
import com.yourname.terrain.biome.BiomeBase;
import com.yourname.terrain.biome.BiomePopup;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerMoveListener implements Listener {

    private final MyTerrainPlugin plugin;
    private final BiomePopup popup;
    private final Map<UUID, String> playerBiomes = new HashMap<>();

    public PlayerMoveListener(MyTerrainPlugin plugin) {
        this.plugin = plugin;
        this.popup = new BiomePopup();
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        if (event.getFrom().getBlockX() == event.getTo().getBlockX() &&
            event.getFrom().getBlockZ() == event.getTo().getBlockZ()) {
            return;
        }

        Location loc = event.getTo();
        BiomeBase biome = plugin.getBiomeManager().getBiomeAt(loc);

        if (biome == null) return;

        UUID uuid = event.getPlayer().getUniqueId();
        String currentBiome = playerBiomes.get(uuid);

        if (!biome.getId().equals(currentBiome)) {
            if (currentBiome != null) {
                BiomeBase oldBiome = plugin.getBiomeManager().getBiomeById(currentBiome);
                if (oldBiome != null) popup.showBiomeExit(event.getPlayer(), oldBiome);
            }

            popup.showBiomeEnter(event.getPlayer(), biome);
            playerBiomes.put(uuid, biome.getId());
        }
    }
}