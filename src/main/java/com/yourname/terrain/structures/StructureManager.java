package com.yourname.terrain.structures;

import com.yourname.terrain.MyTerrainPlugin;
import com.yourname.terrain.biome.BiomeBase;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.*;

public class StructureManager {

    private final MyTerrainPlugin plugin;
    private final Map<String, StructureData> structures = new HashMap<>();
    private final Random random = new Random();

    public StructureManager(MyTerrainPlugin plugin) {
        this.plugin = plugin;
        registerStructures();
    }

    private void registerStructures() {
        // FANTASY STRUCTURES
        structures.put("ruined_altar", new StructureData(
            "Ruined Altar",
            Arrays.asList(Material.MOSSY_COBBLESTONE, Material.COBBLESTONE, Material.STONE_BRICKS),
            Arrays.asList(
                new LootItem(Material.DIAMOND, 1, 3, 0.3),
                new LootItem(Material.EMERALD, 2, 5, 0.5),
                new LootItem(Material.GOLDEN_APPLE, 1, 1, 0.1),
                new LootItem(Material.ENCHANTED_BOOK, 1, 1, 0.2),
                new LootItem(Material.RED_MUSHROOM, 5, 15, 0.8),
                new LootItem(Material.BROWN_MUSHROOM, 5, 15, 0.8),
                new LootItem(Material.APPLE, 2, 5, 0.7),
                new LootItem(Material.SWEET_BERRIES, 3, 8, 0.6)
            ),
            "Forest Guardian"
        ));

        structures.put("zen_temple", new StructureData(
            "Zen Garden Temple",
            Arrays.asList(Material.PINK_WOOL, Material.CHERRY_PLANKS, Material.WHITE_WOOL),
            Arrays.asList(
                new LootItem(Material.CHERRY_SAPLING, 3, 8, 0.9),
                new LootItem(Material.PINK_DYE, 5, 12, 0.7),
                new LootItem(Material.GOLD_INGOT, 2, 6, 0.4),
                new LootItem(Material.POTION, 1, 2, 0.3),
                new LootItem(Material.BAMBOO, 5, 15, 0.6),
                new LootItem(Material.BOOK, 1, 3, 0.5),
                new LootItem(Material.APPLE, 2, 4, 0.8),
                new LootItem(Material.HONEY_BOTTLE, 1, 2, 0.5)
            ),
            "Cherry Spirit"
        ));

        // BOSS STRUCTURES - End Biomes
        structures.put("end_ruins", new StructureData(
            "End Ruins",
            Arrays.asList(Material.END_STONE, Material.END_STONE_BRICKS, Material.OBSIDIAN),
            Arrays.asList(
                new LootItem(Material.ENDER_PEARL, 5, 15, 0.9),
                new LootItem(Material.CHORUS_FRUIT, 5, 15, 0.8),
                new LootItem(Material.DIAMOND, 2, 5, 0.4),
                new LootItem(Material.OBSIDIAN, 5, 15, 0.7),
                new LootItem(Material.ENDER_EYE, 1, 3, 0.3),
                new LootItem(Material.CHORUS_FRUIT, 3, 8, 0.8)
            ),
            "Ender Knight"
        ));

        structures.put("chorus_spire", new StructureData(
            "Chorus Spire",
            Arrays.asList(Material.PURPUR_BLOCK, Material.PURPUR_PILLAR, Material.END_STONE_BRICKS),
            Arrays.asList(
                new LootItem(Material.CHORUS_FRUIT, 10, 25, 0.9),
                new LootItem(Material.POPPED_CHORUS_FRUIT, 5, 15, 0.8),
                new LootItem(Material.SHULKER_SHELL, 1, 3, 0.3),
                new LootItem(Material.DIAMOND, 1, 3, 0.3),
                new LootItem(Material.ENDER_PEARL, 3, 8, 0.7),
                new LootItem(Material.POPPED_CHORUS_FRUIT, 5, 10, 0.8)
            ),
            "Chorus Guardian"
        ));

        structures.put("obsidian_tower", new StructureData(
            "Obsidian Tower",
            Arrays.asList(Material.OBSIDIAN, Material.CRYING_OBSIDIAN, Material.BLACKSTONE),
            Arrays.asList(
                new LootItem(Material.OBSIDIAN, 10, 30, 0.9),
                new LootItem(Material.CRYING_OBSIDIAN, 5, 15, 0.7),
                new LootItem(Material.NETHERITE_INGOT, 1, 3, 0.2),
                new LootItem(Material.DIAMOND, 2, 5, 0.4),
                new LootItem(Material.ENCHANTED_GOLDEN_APPLE, 1, 1, 0.1),
                new LootItem(Material.ENDER_PEARL, 3, 8, 0.6)
            ),
            "Obsidian Golem"
        ));

        structures.put("ruined_city", new StructureData(
            "Ruined City",
            Arrays.asList(Material.PURPUR_BLOCK, Material.END_STONE_BRICKS, Material.PURPUR_PILLAR),
            Arrays.asList(
                new LootItem(Material.ELYTRA, 1, 1, 0.1),
                new LootItem(Material.SHULKER_SHELL, 2, 5, 0.5),
                new LootItem(Material.DIAMOND, 3, 8, 0.4),
                new LootItem(Material.ENDER_PEARL, 5, 15, 0.8),
                new LootItem(Material.ENCHANTED_BOOK, 1, 2, 0.3),
                new LootItem(Material.POPPED_CHORUS_FRUIT, 5, 10, 0.7),
                new LootItem(Material.GOLDEN_APPLE, 1, 2, 0.2)
            ),
            "Ender Mage"
        ));

        structures.put("tear_shrine", new StructureData(
            "Tear Shrine",
            Arrays.asList(Material.OBSIDIAN, Material.END_STONE, Material.DRAGON_HEAD),
            Arrays.asList(
                new LootItem(Material.DRAGON_BREATH, 5, 15, 0.8),
                new LootItem(Material.END_CRYSTAL, 1, 3, 0.3),
                new LootItem(Material.DIAMOND, 3, 8, 0.5),
                new LootItem(Material.NETHERITE_INGOT, 2, 5, 0.3),
                new LootItem(Material.ELYTRA, 1, 1, 0.15),
                new LootItem(Material.GOLDEN_APPLE, 1, 2, 0.2),
                new LootItem(Material.ENDER_PEARL, 5, 10, 0.9)
            ),
            "Void Leviathan"
        ));

        plugin.getLogger().info("Registered " + structures.size() + " custom structures with loot!");
    }

    public void generateStructure(Location loc, String structureId) {
        StructureData data = structures.get(structureId);
        if (data == null) return;

        buildSimpleStructure(loc, data);
        addLootChest(loc.clone().add(0, 1, 0), data);
        spawnGuardian(loc, data);
    }

    public void generateBossStructure(Location loc, BiomeBase biome) {
        StructureData data = structures.get(biome.getStructureId());
        if (data == null) return;

        buildBossStructure(loc, data);
        addBossLootChest(loc.clone().add(0, 1, 0), data);

        String bossName = getBossForBiome(biome.getId());
        if (bossName != null) {
            plugin.getBossManager().spawnBoss(loc.clone().add(0, 2, 0), bossName);
        }
    }

    private String getBossForBiome(String biomeId) {
        switch (biomeId) {
            case "void_tears": return "Void Leviathan";
            case "obsidian_spires": return "Obsidian Titan";
            case "ender_city_ruins": return "Ender Overlord";
            case "crystal_caverns": return "Crystal Empress";
            case "frostburn_tundra": return "Frost King";
            case "meteor_crater": return "Meteor Lord";
            case "dreamscape": return "Dream Eater Prime";
            case "rainbow_bridge": return "Rainbow Dragon";
            case "sunken_city": return "Sea Emperor";
            case "mirror_dimension": return "Mirror God";
            default: return null;
        }
    }

    private void buildSimpleStructure(Location loc, StructureData data) {
        List<Material> blocks = data.getBlocks();
        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                for (int y = 0; y < 3; y++) {
                    loc.clone().add(x, y, z).getBlock().setType(
                        blocks.get(random.nextInt(blocks.size()))
                    );
                }
            }
        }
    }

    private void buildBossStructure(Location loc, StructureData data) {
        List<Material> blocks = data.getBlocks();
        for (int x = -4; x <= 4; x++) {
            for (int z = -4; z <= 4; z++) {
                for (int y = 0; y < 5; y++) {
                    if (Math.abs(x) == 4 || Math.abs(z) == 4 || y == 0 || y == 4) {
                        loc.clone().add(x, y, z).getBlock().setType(
                            blocks.get(random.nextInt(blocks.size()))
                        );
                    }
                }
            }
        }
    }

    private void addLootChest(Location loc, StructureData data) {
        loc.getBlock().setType(Material.CHEST);
        Chest chest = (Chest) loc.getBlock().getState();

        for (LootItem item : data.getLoot()) {
            if (random.nextDouble() <= item.getChance()) {
                int amount = random.nextInt(item.getMax() - item.getMin() + 1) + item.getMin();
                ItemStack stack = new ItemStack(item.getMaterial(), amount);
                addFoodMeta(stack);
                chest.getInventory().addItem(stack);
            }
        }
    }

    private void addBossLootChest(Location loc, StructureData data) {
        loc.getBlock().setType(Material.CHEST);
        Chest chest = (Chest) loc.getBlock().getState();

        for (LootItem item : data.getLoot()) {
            if (random.nextDouble() <= Math.min(item.getChance() * 2, 1.0)) {
                int amount = random.nextInt(item.getMax() - item.getMin() + 1) + item.getMin();
                ItemStack stack = new ItemStack(item.getMaterial(), amount);
                addFoodMeta(stack);
                chest.getInventory().addItem(stack);
            }
        }

        chest.getInventory().addItem(new ItemStack(Material.DIAMOND, random.nextInt(5) + 3));
        chest.getInventory().addItem(new ItemStack(Material.GOLDEN_APPLE, random.nextInt(2) + 1));
        chest.getInventory().addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, random.nextInt(10) + 5));
    }

    private void addFoodMeta(ItemStack stack) {
        String foodId = null;
        switch (stack.getType()) {
            case APPLE:
                foodId = "cherry_blossom_fruit";
                break;
            case SWEET_BERRIES:
                foodId = "scarlet_berry";
                break;
            case HONEY_BOTTLE:
                foodId = "lavender_honey";
                break;
            case CHORUS_FRUIT:
                foodId = "wisteria_fruit";
                break;
            case GOLDEN_APPLE:
                foodId = "starlight_fruit";
                break;
            case ENCHANTED_GOLDEN_APPLE:
                foodId = "obsidian_apple";
                break;
            case MELON_SLICE:
                foodId = "coconut";
                break;
            case PUMPKIN_PIE:
                foodId = "pumpkin_pie_slice";
                break;
            case BREAD:
                foodId = "rice_cake";
                break;
            case CACTUS:
                foodId = "badlands_cactus";
                break;
            case SUGAR:
                foodId = "salt_crystal";
                break;
            case KELP:
                foodId = "coral_fruit";
                break;
            case SEAGRASS:
                foodId = "sea_grapes";
                break;
            case COD:
                foodId = "ice_fish";
                break;
            case GLOW_INK_SAC:
                foodId = "bioluminescent_jelly";
                break;
            case GLOW_BERRIES:
                foodId = "enchanted_berry";
                break;
            case WHEAT_SEEDS:
                foodId = "sunflower_seed";
                break;
            case BAMBOO:
                foodId = "bamboo_shoot";
                break;
            case POPPY:
                foodId = "poppy_petal";
                break;
            case SNOWBALL:
                foodId = "cloud_berry";
                break;
            case BLAZE_POWDER:
                foodId = "volcanic_pepper";
                break;
            case RED_MUSHROOM:
                foodId = "toxic_mushroom";
                break;
            case ENDER_PEARL:
                foodId = "void_pear";
                break;
            case POPPED_CHORUS_FRUIT:
                foodId = "purpur_fruit";
                break;
        }

        if (foodId != null && plugin.getFoodManager() != null) {
            com.yourname.terrain.items.FoodItem food = plugin.getFoodManager().getFood(foodId);
            if (food != null) {
                ItemMeta meta = stack.getItemMeta();
                if (meta != null) {
                    meta.setDisplayName(food.getDisplayName());
                    if (food.getLore() != null) {
                        meta.setLore(Arrays.asList(food.getLore()));
                    }
                    stack.setItemMeta(meta);
                }
            }
        }
    }

    private void spawnGuardian(Location loc, StructureData data) {
        String mobName = data.getGuardianMob();
        plugin.getMobManager().spawnMob(loc, mobName);
    }

    public StructureData getStructure(String id) {
        return structures.get(id);
    }

    public Map<String, StructureData> getAllStructures() {
        return structures;
    }
}