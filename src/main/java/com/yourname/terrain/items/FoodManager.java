package com.yourname.terrain.items;

import org.bukkit.Material;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Map;

public class FoodManager {

    private final Map<String, FoodItem> foods = new HashMap<>();

    public FoodManager() {
        registerFoods();
    }

    private void registerFoods() {
        // ========== FRUITS ==========

        // Cherry Blossom Fruit
        foods.put("cherry_blossom_fruit", new FoodItem(
            "cherry_blossom_fruit",
            "\u00a7dCherry Blossom Fruit",
            Material.APPLE,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 100, 0)
            },
            "\u00a77A delicate pink fruit from the Cherry Blossom Grove"
        ));

        // Scarlet Berry
        foods.put("scarlet_berry", new FoodItem(
            "scarlet_berry",
            "\u00a7cScarlet Berry",
            Material.SWEET_BERRIES,
            2, 1.2,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.STRENGTH, 200, 0)
            },
            "\u00a77A crimson berry from the Scarlet Forest"
        ));

        // Sunflower Seed
        foods.put("sunflower_seed", new FoodItem(
            "sunflower_seed",
            "\u00a7eSunflower Seed",
            Material.WHEAT_SEEDS,
            1, 0.6,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, 100, 0)
            },
            "\u00a77A golden seed from the Sunflower Plains"
        ));

        // Lavender Honey
        foods.put("lavender_honey", new FoodItem(
            "lavender_honey",
            "\u00a75Lavender Honey",
            Material.HONEY_BOTTLE,
            6, 4.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 300, 1)
            },
            "\u00a77Sweet honey infused with lavender from the valleys"
        ));

        // Bamboo Shoot
        foods.put("bamboo_shoot", new FoodItem(
            "bamboo_shoot",
            "\u00a72Bamboo Shoot",
            Material.BAMBOO,
            3, 1.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.JUMP_BOOST, 200, 1)
            },
            "\u00a77A tender shoot from the Bamboo Highlands"
        ));

        // Autumn Apple
        foods.put("autumn_apple", new FoodItem(
            "autumn_apple",
            "\u00a76Autumn Apple",
            Material.APPLE,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.ABSORPTION, 400, 0)
            },
            "\u00a77A crisp apple from the Autumn Woods"
        ));

        // Wisteria Fruit
        foods.put("wisteria_fruit", new FoodItem(
            "wisteria_fruit",
            "\u00a75Wisteria Fruit",
            Material.CHORUS_FRUIT,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.LEVITATION, 100, 0)
            },
            "\u00a77A mysterious fruit from the Wisteria Falls"
        ));

        // Tea Leaf
        foods.put("tea_leaf", new FoodItem(
            "tea_leaf",
            "\u00a72Tea Leaf",
            Material.KELP,
            2, 1.2,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 0)
            },
            "\u00a77A fragrant leaf from the Tea Plantation"
        ));

        // Poppy Petal
        foods.put("poppy_petal", new FoodItem(
            "poppy_petal",
            "\u00a7cPoppy Petal",
            Material.POPPY,
            1, 0.6,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.INSTANT_HEALTH, 1, 0)
            },
            "\u00a77A healing petal from the Poppy Fields"
        ));

        // Cloud Berry
        foods.put("cloud_berry", new FoodItem(
            "cloud_berry",
            "\u00a7fCloud Berry",
            Material.SNOWBALL,
            3, 1.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.SLOW_FALLING, 200, 0)
            },
            "\u00a77A fluffy berry from the Cotton Cloud Valley"
        ));

        // ========== DANGEROUS FOODS ==========

        // Volcanic Pepper
        foods.put("volcanic_pepper", new FoodItem(
            "volcanic_pepper",
            "\u00a7c\u00a7lVolcanic Pepper",
            Material.BLAZE_POWDER,
            2, 1.2,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 0),
                new PotionEffect(PotionEffectType.STRENGTH, 300, 1)
            },
            "\u00a77An extremely hot pepper from the Volcanic Wasteland!"
        ));

        // Frost Berry
        foods.put("frost_berry", new FoodItem(
            "frost_berry",
            "\u00a7bFrost Berry",
            Material.SWEET_BERRIES,
            3, 1.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0),
                new PotionEffect(PotionEffectType.SPEED, 200, 1)
            },
            "\u00a77A frozen berry from the Frozen Tundra"
        ));

        // Toxic Mushroom
        foods.put("toxic_mushroom", new FoodItem(
            "toxic_mushroom",
            "\u00a72\u00a7lToxic Mushroom",
            Material.RED_MUSHROOM,
            1, 0.6,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.POISON, 100, 1),
                new PotionEffect(PotionEffectType.REGENERATION, 200, 2)
            },
            "\u00a7c\u00a7lDANGEROUS! \u00a77Heals but poisons first!"
        ));

        // Meteor Fruit
        foods.put("meteor_fruit", new FoodItem(
            "meteor_fruit",
            "\u00a75\u00a7lMeteor Fruit",
            Material.CHORUS_FRUIT,
            8, 6.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 400, 2),
                new PotionEffect(PotionEffectType.STRENGTH, 300, 2),
                new PotionEffect(PotionEffectType.RESISTANCE, 300, 1)
            },
            "\u00a77A glowing fruit from a fallen meteor!"
        ));

        // ========== WATER FOODS ==========

        // Coral Fruit
        foods.put("coral_fruit", new FoodItem(
            "coral_fruit",
            "\u00a7dCoral Fruit",
            Material.KELP,
            3, 1.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.WATER_BREATHING, 600, 0)
            },
            "\u00a77A colorful fruit from the Coral Kingdom"
        ));

        // Sea Grapes
        foods.put("sea_grapes", new FoodItem(
            "sea_grapes",
            "\u00a7bSea Grapes",
            Material.SEAGRASS,
            2, 1.2,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 300, 0)
            },
            "\u00a77Bubbly grapes from the Kelp Forest"
        ));

        // Ice Fish
        foods.put("ice_fish", new FoodItem(
            "ice_fish",
            "\u00a7bIce Fish",
            Material.COD,
            5, 3.0,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0)
            },
            "\u00a77A frozen fish from the Frozen Ocean"
        ));

        // Bioluminescent Jelly
        foods.put("bioluminescent_jelly", new FoodItem(
            "bioluminescent_jelly",
            "\u00a7bBioluminescent Jelly",
            Material.GLOW_INK_SAC,
            2, 1.2,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.GLOWING, 600, 0),
                new PotionEffect(PotionEffectType.NIGHT_VISION, 600, 0)
            },
            "\u00a77A glowing jelly from the Bioluminescent Bay"
        ));

        // ========== MYSTICAL FOODS ==========

        // Starlight Fruit
        foods.put("starlight_fruit", new FoodItem(
            "starlight_fruit",
            "\u00a7e\u00a7lStarlight Fruit",
            Material.GOLDEN_APPLE,
            6, 4.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 400, 1),
                new PotionEffect(PotionEffectType.ABSORPTION, 1200, 0)
            },
            "\u00a77A golden fruit that glows with starlight"
        ));

        // Enchanted Berry
        foods.put("enchanted_berry", new FoodItem(
            "enchanted_berry",
            "\u00a7dEnchanted Berry",
            Material.GLOW_BERRIES,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 200, 1),
                new PotionEffect(PotionEffectType.SPEED, 200, 1)
            },
            "\u00a77A magical berry from the Enchanted Woods"
        ));

        // Void Fruit
        foods.put("void_fruit", new FoodItem(
            "void_fruit",
            "\u00a78\u00a7lVoid Fruit",
            Material.CHORUS_FRUIT,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.INVISIBILITY, 400, 0),
                new PotionEffect(PotionEffectType.SPEED, 200, 2)
            },
            "\u00a77A dark fruit that makes you vanish..."
        ));

        // Rainbow Fruit
        foods.put("rainbow_fruit", new FoodItem(
            "rainbow_fruit",
            "\u00a7c\u00a7lR\u00a76a\u00a7ei\u00a7an\u00a7bb\u00a7do\u00a75w \u00a7cFruit",
            Material.MELON_SLICE,
            5, 3.0,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, 300, 2),
                new PotionEffect(PotionEffectType.JUMP_BOOST, 300, 2),
                new PotionEffect(PotionEffectType.REGENERATION, 200, 1)
            },
            "\u00a77A prismatic fruit that grants rainbow powers!"
        ));

        // Timeless Fig
        foods.put("timeless_fig", new FoodItem(
            "timeless_fig",
            "\u00a7aTimeless Fig",
            Material.APPLE,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 600, 0),
                new PotionEffect(PotionEffectType.SATURATION, 100, 0)
            },
            "\u00a77A fig that never spoils from the Timeless Garden"
        ));

        // ========== LANDFORM FOODS ==========

        // Badlands Cactus Fruit
        foods.put("badlands_cactus", new FoodItem(
            "badlands_cactus",
            "\u00a76Badlands Cactus Fruit",
            Material.CACTUS,
            2, 1.2,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.RESISTANCE, 300, 0)
            },
            "\u00a77A spiky but sweet fruit from the Badlands Canyon"
        ));

        // Floating Isle Berry
        foods.put("floating_berry", new FoodItem(
            "floating_berry",
            "\u00a7bFloating Isle Berry",
            Material.SWEET_BERRIES,
            3, 1.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.SLOW_FALLING, 400, 0)
            },
            "\u00a77A berry that makes you float!"
        ));

        // Mushroom Cap
        foods.put("mushroom_cap", new FoodItem(
            "mushroom_cap",
            "\u00a7dMushroom Cap",
            Material.RED_MUSHROOM,
            3, 1.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 200, 0)
            },
            "\u00a77A giant cap from the Mushroom Jungle"
        ));

        // Rice Cake
        foods.put("rice_cake", new FoodItem(
            "rice_cake",
            "\u00a7fRice Cake",
            Material.BREAD,
            5, 3.0,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.SATURATION, 200, 0)
            },
            "\u00a77A sticky cake from the Rice Fields"
        ));

        // Salt Crystal
        foods.put("salt_crystal", new FoodItem(
            "salt_crystal",
            "\u00a7fSalt Crystal",
            Material.SUGAR,
            1, 0.6,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, 100, 0)
            },
            "\u00a77A salty crystal from the Salt Flats"
        ));

        // ========== SEASONAL FOODS ==========

        // Spring Honey
        foods.put("spring_honey", new FoodItem(
            "spring_honey",
            "\u00a7aSpring Honey",
            Material.HONEY_BOTTLE,
            6, 4.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 300, 1)
            },
            "\u00a77Fresh honey from the Spring Meadow"
        ));

        // Coconut
        foods.put("coconut", new FoodItem(
            "coconut",
            "\u00a76Coconut",
            Material.MELON_SLICE,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.WATER_BREATHING, 300, 0)
            },
            "\u00a77A tropical coconut from the Summer Beach"
        ));

        // Pumpkin Pie Slice
        foods.put("pumpkin_pie_slice", new FoodItem(
            "pumpkin_pie_slice",
            "\u00a76Pumpkin Pie Slice",
            Material.PUMPKIN_PIE,
            6, 4.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.ABSORPTION, 400, 0)
            },
            "\u00a77A warm slice from the Autumn Maple"
        ));

        // Winter Berry
        foods.put("winter_berry", new FoodItem(
            "winter_berry",
            "\u00a7bWinter Berry",
            Material.SWEET_BERRIES,
            3, 1.8,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300, 0)
            },
            "\u00a77A cold berry from the Winter Wonderland"
        ));

        // Monsoon Mango
        foods.put("monsoon_mango", new FoodItem(
            "monsoon_mango",
            "\u00a72Monsoon Mango",
            Material.APPLE,
            5, 3.0,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, 200, 1),
                new PotionEffect(PotionEffectType.JUMP_BOOST, 200, 1)
            },
            "\u00a77A juicy mango from the Monsoon Jungle"
        ));

        // ========== END FOODS ==========

        // Chorus Fruit (Enhanced)
        foods.put("end_chorus_fruit", new FoodItem(
            "end_chorus_fruit",
            "\u00a75\u00a7lEnd Chorus Fruit",
            Material.CHORUS_FRUIT,
            4, 2.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 200, 1),
                new PotionEffect(PotionEffectType.SPEED, 200, 1)
            },
            "\u00a77An enhanced chorus fruit from the End Wastes"
        ));

        // Obsidian Apple
        foods.put("obsidian_apple", new FoodItem(
            "obsidian_apple",
            "\u00a78\u00a7lObsidian Apple",
            Material.ENCHANTED_GOLDEN_APPLE,
            8, 6.4,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 600, 2),
                new PotionEffect(PotionEffectType.ABSORPTION, 2400, 1),
                new PotionEffect(PotionEffectType.RESISTANCE, 600, 1)
            },
            "\u00a77A dark apple infused with obsidian magic!"
        ));

        // Void Pear
        foods.put("void_pear", new FoodItem(
            "void_pear",
            "\u00a78\u00a7lVoid Pear",
            Material.ENDER_PEARL,
            2, 1.2,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.INVISIBILITY, 200, 0),
                new PotionEffect(PotionEffectType.SPEED, 200, 2)
            },
            "\u00a77A pear that teleports you... to fullness!"
        ));

        // Purpur Fruit
        foods.put("purpur_fruit", new FoodItem(
            "purpur_fruit",
            "\u00a75Purpur Fruit",
            Material.POPPED_CHORUS_FRUIT,
            5, 3.0,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.LEVITATION, 100, 0),
                new PotionEffect(PotionEffectType.REGENERATION, 200, 1)
            },
            "\u00a77A floating fruit from the Ender City Ruins"
        ));

        // Dragon Fruit
        foods.put("dragon_fruit", new FoodItem(
            "dragon_fruit",
            "\u00a7c\u00a7lDragon Fruit",
            Material.GOLDEN_APPLE,
            10, 8.0,
            new PotionEffect[]{
                new PotionEffect(PotionEffectType.REGENERATION, 600, 2),
                new PotionEffect(PotionEffectType.STRENGTH, 300, 2),
                new PotionEffect(PotionEffectType.RESISTANCE, 300, 1),
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 0)
            },
            "\u00a76\u00a7lLEGENDARY! \u00a77A fruit blessed by the Ender Dragon!"
        ));
    }

    public FoodItem getFood(String id) {
        return foods.get(id);
    }

    public Map<String, FoodItem> getAllFoods() {
        return foods;
    }

    public int getFoodCount() {
        return foods.size();
    }
}