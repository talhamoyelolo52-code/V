package com.yourname.terrain.commands;

import com.yourname.terrain.MyTerrainPlugin;
import com.yourname.terrain.biome.BiomeBase;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TerrainCommand implements CommandExecutor {

    private final MyTerrainPlugin plugin;

    public TerrainCommand(MyTerrainPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("myterrain.admin")) {
            sender.sendMessage(ChatColor.RED + "You don't have permission!");
            return true;
        }

        if (args.length == 0) {
            sender.sendMessage(ChatColor.GOLD + "======== MyTerrainPlugin Commands ========");
            sender.sendMessage(ChatColor.YELLOW + "/terrain reload - Reload plugin");
            sender.sendMessage(ChatColor.YELLOW + "/terrain list - List all biomes");
            sender.sendMessage(ChatColor.YELLOW + "/terrain info <biome> - Biome info");
            sender.sendMessage(ChatColor.YELLOW + "/terrain bosses - List all bosses");
            sender.sendMessage(ChatColor.YELLOW + "/terrain foods - List all custom foods");
            sender.sendMessage(ChatColor.YELLOW + "/terrain rare - List rare/boss biomes");
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "reload":
                plugin.reloadConfig();
                sender.sendMessage(ChatColor.GREEN + "MyTerrainPlugin reloaded!");
                break;

            case "list":
                sender.sendMessage(ChatColor.GOLD + "=== All Biomes (" + 
                    plugin.getBiomeManager().getAllBiomes().size() + ") ===");
                for (BiomeBase biome : plugin.getBiomeManager().getAllBiomes().values()) {
                    String tag = "";
                    if (plugin.getBiomeManager().isBossBiome(biome.getId())) {
                        tag = ChatColor.DARK_RED + " [BOSS]";
                    } else if (plugin.getBiomeManager().isRareBiome(biome.getId())) {
                        tag = ChatColor.GOLD + " [RARE]";
                    }
                    sender.sendMessage(biome.getColor() + biome.getIcon() + " " + biome.getName() + 
                        ChatColor.GRAY + " [" + biome.getId() + "]" + tag);
                }
                break;

            case "info":
                if (args.length < 2) {
                    sender.sendMessage(ChatColor.RED + "Usage: /terrain info <biome_id>");
                    return true;
                }
                BiomeBase biome = plugin.getBiomeManager().getBiomeById(args[1]);
                if (biome == null) {
                    sender.sendMessage(ChatColor.RED + "Biome not found!");
                    return true;
                }
                sender.sendMessage(ChatColor.GOLD + "=== " + biome.getName() + " ===");
                sender.sendMessage(ChatColor.YELLOW + "ID: " + ChatColor.WHITE + biome.getId());
                sender.sendMessage(ChatColor.YELLOW + "Climate: " + ChatColor.WHITE + biome.getClimate());
                sender.sendMessage(ChatColor.YELLOW + "Rarity: " + ChatColor.WHITE + biome.getRarity());
                sender.sendMessage(ChatColor.YELLOW + "Difficulty: " + ChatColor.WHITE + biome.getDifficulty());
                sender.sendMessage(ChatColor.YELLOW + "Structure: " + ChatColor.WHITE + biome.getStructureId());
                sender.sendMessage(ChatColor.YELLOW + "Guardian: " + ChatColor.WHITE + biome.getGuardianMob());
                if (plugin.getBiomeManager().isBossBiome(biome.getId())) {
                    sender.sendMessage(ChatColor.DARK_RED + "BOSS BIOME!");
                }
                break;

            case "bosses":
                sender.sendMessage(ChatColor.DARK_RED + "=== BOSS LIST ===");
                sender.sendMessage(ChatColor.RED + "1. Void Leviathan - Void Tears");
                sender.sendMessage(ChatColor.RED + "2. Obsidian Titan - Obsidian Spires");
                sender.sendMessage(ChatColor.RED + "3. Ender Overlord - Ender City Ruins");
                sender.sendMessage(ChatColor.RED + "4. Crystal Empress - Crystal Caverns");
                sender.sendMessage(ChatColor.RED + "5. Frost King - Frostburn Tundra");
                sender.sendMessage(ChatColor.RED + "6. Meteor Lord - Meteor Crater");
                sender.sendMessage(ChatColor.RED + "7. Dream Eater Prime - Dreamscape");
                sender.sendMessage(ChatColor.RED + "8. Rainbow Dragon - Rainbow Bridge");
                sender.sendMessage(ChatColor.RED + "9. Sea Emperor - Sunken City");
                sender.sendMessage(ChatColor.RED + "10. Mirror God - Mirror Dimension");
                sender.sendMessage(ChatColor.GOLD + "Bosses only spawn in structures in rare biomes!");
                break;

            case "foods":
                sender.sendMessage(ChatColor.GOLD + "=== Custom Foods (" + 
                    plugin.getFoodManager().getFoodCount() + ") ===");
                sender.sendMessage(ChatColor.YELLOW + "Fruits: Cherry Blossom, Scarlet Berry, Sunflower Seed,");
                sender.sendMessage(ChatColor.YELLOW + "  Lavender Honey, Bamboo Shoot, Autumn Apple,");
                sender.sendMessage(ChatColor.YELLOW + "  Wisteria Fruit, Tea Leaf, Poppy Petal, Cloud Berry");
                sender.sendMessage(ChatColor.YELLOW + "Dangerous: Volcanic Pepper, Frost Berry, Toxic Mushroom, Meteor Fruit");
                sender.sendMessage(ChatColor.YELLOW + "Water: Coral Fruit, Sea Grapes, Ice Fish, Bioluminescent Jelly");
                sender.sendMessage(ChatColor.YELLOW + "Mystical: Starlight Fruit, Enchanted Berry, Void Fruit, Rainbow Fruit, Timeless Fig");
                sender.sendMessage(ChatColor.YELLOW + "Landform: Badlands Cactus, Floating Berry, Mushroom Cap, Rice Cake, Salt Crystal");
                sender.sendMessage(ChatColor.YELLOW + "Seasonal: Spring Honey, Coconut, Pumpkin Pie, Winter Berry, Monsoon Mango");
                sender.sendMessage(ChatColor.YELLOW + "End: End Chorus Fruit, Obsidian Apple, Void Pear, Purpur Fruit, Dragon Fruit");
                break;

            case "rare":
                sender.sendMessage(ChatColor.GOLD + "=== RARE/BOSS BIOMES ===");
                sender.sendMessage(ChatColor.DARK_RED + "BOSS Biomes (Guaranteed Boss in Structure):");
                for (String id : plugin.getBiomeManager().getBossBiomes()) {
                    BiomeBase b = plugin.getBiomeManager().getBiomeById(id);
                    if (b != null) sender.sendMessage(ChatColor.RED + "  " + b.getName());
                }
                sender.sendMessage(ChatColor.GOLD + "\nRare Biomes:");
                for (String id : plugin.getBiomeManager().getRareBiomes()) {
                    if (!plugin.getBiomeManager().isBossBiome(id)) {
                        BiomeBase b = plugin.getBiomeManager().getBiomeById(id);
                        if (b != null) sender.sendMessage(ChatColor.YELLOW + "  " + b.getName());
                    }
                }
                break;

            default:
                sender.sendMessage(ChatColor.RED + "Unknown command! Use /terrain for help.");
        }

        return true;
    }
}