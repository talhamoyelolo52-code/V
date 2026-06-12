package com.yourname.terrain.commands;

import com.yourname.terrain.MyTerrainPlugin;
import com.yourname.terrain.biome.BiomeBase;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BiomeCommand implements CommandExecutor {

    private final MyTerrainPlugin plugin;

    public BiomeCommand(MyTerrainPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command!");
            return true;
        }

        Player player = (Player) sender;
        BiomeBase biome = plugin.getBiomeManager().getBiomeAt(player.getLocation());

        if (biome == null) {
            player.sendMessage(ChatColor.RED + "You are not in a custom biome!");
            return true;
        }

        player.sendMessage(ChatColor.GOLD + "========== Biome Info ==========");
        player.sendMessage(biome.getColor() + biome.getIcon() + " " + biome.getName());
        player.sendMessage(ChatColor.YELLOW + "Climate: " + ChatColor.WHITE + biome.getClimate());
        player.sendMessage(ChatColor.YELLOW + "Rarity: " + ChatColor.WHITE + biome.getRarity());
        player.sendMessage(ChatColor.YELLOW + "Difficulty: " + ChatColor.WHITE + biome.getDifficulty());
        player.sendMessage(ChatColor.YELLOW + "Description: " + ChatColor.WHITE + biome.getDescription());
        player.sendMessage(ChatColor.YELLOW + "Structure: " + ChatColor.WHITE + biome.getStructureId());
        player.sendMessage(ChatColor.YELLOW + "Guardian: " + ChatColor.WHITE + biome.getGuardianMob());
        player.sendMessage(ChatColor.GOLD + "================================");

        return true;
    }
}