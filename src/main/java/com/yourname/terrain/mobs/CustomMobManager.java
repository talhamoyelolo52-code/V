package com.yourname.terrain.mobs;

import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;

import java.util.HashMap;
import java.util.Map;

public class CustomMobManager {

    private final JavaPlugin plugin;
    private final Map<String, MobData> customMobs = new HashMap<>();

    public CustomMobManager(JavaPlugin plugin) {
        this.plugin = plugin;
        registerMobs();
    }

    private void registerMobs() {
        // FANTASY MOBS
        customMobs.put("Forest Guardian", new MobData(
            EntityType.IRON_GOLEM,
            "\u00a7cForest Guardian",
            100.0, 15.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.DIAMOND_SWORD)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Cherry Spirit", new MobData(
            EntityType.ALLAY,
            "\u00a7dCherry Spirit",
            30.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            }
        ));

        customMobs.put("Swamp Witch", new MobData(
            EntityType.WITCH,
            "\u00a72Swamp Witch",
            50.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1),
                new PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING, 999999, 0)
            }
        ));

        customMobs.put("Crystal Golem", new MobData(
            EntityType.RAVAGER,
            "\u00a7bCrystal Golem",
            150.0, 20.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.DIAMOND_AXE)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SLOWNESS, 999999, 1),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2)
            }
        ));

        customMobs.put("Marsh Wraith", new MobData(
            EntityType.PHANTOM,
            "\u00a78Marsh Wraith",
            40.0, 10.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Scarecrow", new MobData(
            EntityType.ARMOR_STAND,
            "\u00a7eScarecrow",
            20.0, 0.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.LEATHER_HELMET),
                new ItemStack(org.bukkit.Material.HAY_BLOCK)
            },
            new PotionEffect[]{}
        ));

        customMobs.put("Panda King", new MobData(
            EntityType.PANDA,
            "\u00a7aPanda King",
            80.0, 12.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 1)
            }
        ));

        customMobs.put("Fairy", new MobData(
            EntityType.VEX,
            "\u00a7dFairy",
            20.0, 6.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 3),
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            }
        ));

        customMobs.put("Forest Troll", new MobData(
            EntityType.RAVAGER,
            "\u00a76Forest Troll",
            120.0, 18.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.IRON_AXE)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 1),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 1)
            }
        ));

        customMobs.put("Sakura Spirit", new MobData(
            EntityType.ALLAY,
            "\u00a7dSakura Spirit",
            30.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Woodcutter", new MobData(
            EntityType.ZOMBIE,
            "\u00a76Woodcutter",
            40.0, 8.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.IRON_AXE),
                new ItemStack(org.bukkit.Material.LEATHER_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SLOWNESS, 999999, 1)
            }
        ));

        customMobs.put("Cave Dweller", new MobData(
            EntityType.CAVE_SPIDER,
            "\u00a78Cave Dweller",
            30.0, 6.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.POISON, 999999, 1)
            }
        ));

        customMobs.put("Tea Master", new MobData(
            EntityType.VILLAGER,
            "\u00a72Tea Master",
            30.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Field Guardian", new MobData(
            EntityType.IRON_GOLEM,
            "\u00a7eField Guardian",
            100.0, 15.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.GOLDEN_SWORD)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Cloud Giant", new MobData(
            EntityType.GIANT,
            "\u00a7fCloud Giant",
            200.0, 25.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.DIAMOND_SWORD)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SLOWNESS, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2)
            }
        ));

        // DANGEROUS MOBS
        customMobs.put("Blaze Knight", new MobData(
            EntityType.WITHER_SKELETON,
            "\u00a76Blaze Knight",
            80.0, 12.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.NETHERITE_SWORD),
                new ItemStack(org.bukkit.Material.NETHERITE_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 1)
            }
        ));

        customMobs.put("Frost Wraith", new MobData(
            EntityType.STRAY,
            "\u00a7bFrost Wraith",
            60.0, 10.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.BOW)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.JUMP_BOOST, 999999, 1)
            }
        ));

        customMobs.put("Storm Caller", new MobData(
            EntityType.EVOKER,
            "\u00a7eStorm Caller",
            50.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Toxic Slime", new MobData(
            EntityType.SLIME,
            "\u00a72Toxic Slime",
            60.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.POISON, 999999, 2)
            }
        ));

        customMobs.put("Ash Zombie", new MobData(
            EntityType.ZOMBIE,
            "\u00a78Ash Zombie",
            40.0, 8.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.IRON_SWORD),
                new ItemStack(org.bukkit.Material.CHAINMAIL_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE, 999999, 0)
            }
        ));

        customMobs.put("Ash Golem", new MobData(
            EntityType.MAGMA_CUBE,
            "\u00a78Ash Golem",
            80.0, 10.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 1)
            }
        ));

        customMobs.put("Lava Serpent", new MobData(
            EntityType.STRIDER,
            "\u00a7cLava Serpent",
            50.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Sulfur Creeper", new MobData(
            EntityType.CREEPER,
            "\u00a7eSulfur Creeper",
            30.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Bone Dragon", new MobData(
            EntityType.ENDER_DRAGON,
            "\u00a7fBone Dragon",
            300.0, 30.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 2)
            }
        ));

        customMobs.put("Space Invader", new MobData(
            EntityType.ENDERMAN,
            "\u00a75Space Invader",
            60.0, 10.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            }
        ));

        customMobs.put("Electric Eel", new MobData(
            EntityType.GUARDIAN,
            "\u00a76Electric Eel",
            50.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Elemental", new MobData(
            EntityType.BLAZE,
            "\u00a7bElemental",
            70.0, 12.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Desert Bandit", new MobData(
            EntityType.PILLAGER,
            "\u00a76Desert Bandit",
            40.0, 8.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.CROSSBOW),
                new ItemStack(org.bukkit.Material.LEATHER_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 1)
            }
        ));

        // WATER MOBS
        customMobs.put("Sea King", new MobData(
            EntityType.ELDER_GUARDIAN,
            "\u00a7bSea King",
            200.0, 20.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2)
            }
        ));

        customMobs.put("Kelp Monster", new MobData(
            EntityType.DROWNED,
            "\u00a72Kelp Monster",
            50.0, 8.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.TRIDENT)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING, 999999, 0)
            }
        ));

        customMobs.put("Guardian", new MobData(
            EntityType.GUARDIAN,
            "\u00a7bGuardian",
            60.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING, 999999, 0)
            }
        ));

        customMobs.put("Polar Bear Alpha", new MobData(
            EntityType.POLAR_BEAR,
            "\u00a7bPolar Bear Alpha",
            100.0, 15.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 1)
            }
        ));

        customMobs.put("Jellyfish", new MobData(
            EntityType.GLOW_SQUID,
            "\u00a7bJellyfish",
            30.0, 4.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.GLOWING, 999999, 0)
            }
        ));

        customMobs.put("Sea Priest", new MobData(
            EntityType.DROWNED,
            "\u00a7bSea Priest",
            50.0, 8.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.TRIDENT)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Sea Emperor", new MobData(
            EntityType.ELDER_GUARDIAN,
            "\u00a76Sea Emperor",
            250.0, 25.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 2)
            }
        ));

        customMobs.put("Seal", new MobData(
            EntityType.POLAR_BEAR,
            "\u00a7fSeal",
            40.0, 6.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Crocodile", new MobData(
            EntityType.DROWNED,
            "\u00a72Crocodile",
            60.0, 12.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 1)
            }
        ));

        customMobs.put("Mirror Spirit", new MobData(
            EntityType.VEX,
            "\u00a7bMirror Spirit",
            30.0, 6.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        // MYSTICAL MOBS
        customMobs.put("Star Watcher", new MobData(
            EntityType.WANDERING_TRADER,
            "\u00a7eStar Watcher",
            30.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Archmage", new MobData(
            EntityType.EVOKER,
            "\u00a7dArchmage",
            60.0, 10.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Void Walker", new MobData(
            EntityType.ENDERMAN,
            "\u00a78Void Walker",
            70.0, 12.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            }
        ));

        customMobs.put("Rainbow Sprite", new MobData(
            EntityType.ALLAY,
            "\u00a7cRainbow Sprite",
            25.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 3),
                new PotionEffect(org.bukkit.potion.PotionEffectType.GLOWING, 999999, 0)
            }
        ));

        customMobs.put("Aurora Spirit", new MobData(
            EntityType.STRAY,
            "\u00a7bAurora Spirit",
            50.0, 8.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.BOW)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.GLOWING, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Bridge Guardian", new MobData(
            EntityType.IRON_GOLEM,
            "\u00a7eBridge Guardian",
            120.0, 18.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.GOLDEN_SWORD)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 1)
            }
        ));

        customMobs.put("Time Keeper", new MobData(
            EntityType.WANDERING_TRADER,
            "\u00a7aTime Keeper",
            40.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2)
            }
        ));

        customMobs.put("Doppelganger", new MobData(
            EntityType.VEX,
            "\u00a7fDoppelganger",
            40.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Dream Eater", new MobData(
            EntityType.PHANTOM,
            "\u00a7dDream Eater",
            50.0, 10.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Rune Master", new MobData(
            EntityType.EVOKER,
            "\u00a78Rune Master",
            60.0, 10.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 1)
            }
        ));

        customMobs.put("Fairy Queen", new MobData(
            EntityType.VEX,
            "\u00a7dFairy Queen",
            40.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 3),
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2)
            }
        ));

        // LANDFORM MOBS
        customMobs.put("Canyon Bandit", new MobData(
            EntityType.PILLAGER,
            "\u00a76Canyon Bandit",
            40.0, 8.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.CROSSBOW),
                new ItemStack(org.bukkit.Material.LEATHER_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 1)
            }
        ));

        customMobs.put("Sky Pirate", new MobData(
            EntityType.VEX,
            "\u00a7bSky Pirate",
            30.0, 6.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 3),
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            }
        ));

        customMobs.put("Spore Lord", new MobData(
            EntityType.MOOSHROOM,
            "\u00a7dSpore Lord",
            60.0, 10.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2)
            }
        ));

        customMobs.put("Illusionist", new MobData(
            EntityType.ILLUSIONER,
            "\u00a7fIllusionist",
            50.0, 8.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.BOW)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Mountain Goat", new MobData(
            EntityType.GOAT,
            "\u00a78Mountain Goat",
            40.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.JUMP_BOOST, 999999, 3),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Rice Farmer", new MobData(
            EntityType.VILLAGER,
            "\u00a72Rice Farmer",
            30.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Sand Spirit", new MobData(
            EntityType.HUSK,
            "\u00a76Sand Spirit",
            40.0, 8.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.GOLDEN_SWORD),
                new ItemStack(org.bukkit.Material.GOLDEN_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE, 999999, 0)
            }
        ));

        customMobs.put("Viking", new MobData(
            EntityType.PILLAGER,
            "\u00a7bViking",
            50.0, 10.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.IRON_AXE),
                new ItemStack(org.bukkit.Material.IRON_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 1)
            }
        ));

        customMobs.put("Giant Smith", new MobData(
            EntityType.IRON_GOLEM,
            "\u00a78Giant Smith",
            150.0, 20.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.IRON_AXE)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 1)
            }
        ));

        customMobs.put("Salt Miner", new MobData(
            EntityType.ZOMBIE_VILLAGER,
            "\u00a78Salt Miner",
            30.0, 6.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.IRON_PICKAXE),
                new ItemStack(org.bukkit.Material.LEATHER_HELMET)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SLOWNESS, 999999, 1)
            }
        ));

        customMobs.put("Cave King", new MobData(
            EntityType.WARDEN,
            "\u00a78Cave King",
            300.0, 30.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 2)
            }
        ));

        // SEASONAL MOBS
        customMobs.put("Spring Spirit", new MobData(
            EntityType.ALLAY,
            "\u00a7aSpring Spirit",
            25.0, 0.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Surfer", new MobData(
            EntityType.DROWNED,
            "\u00a7eSurfer",
            40.0, 6.0, true,
            new ItemStack[]{new ItemStack(org.bukkit.Material.TRIDENT)},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING, 999999, 0),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2)
            }
        ));

        customMobs.put("Harvest Witch", new MobData(
            EntityType.WITCH,
            "\u00a76Harvest Witch",
            50.0, 8.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 1)
            }
        ));

        customMobs.put("Ice Queen", new MobData(
            EntityType.STRAY,
            "\u00a7bIce Queen",
            100.0, 15.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.BOW),
                new ItemStack(org.bukkit.Material.DIAMOND_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2)
            }
        ));

        customMobs.put("Jungle Chief", new MobData(
            EntityType.PILLAGER,
            "\u00a72Jungle Chief",
            60.0, 12.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.CROSSBOW),
                new ItemStack(org.bukkit.Material.DIAMOND_CHESTPLATE)
            },
            new PotionEffect[]{
                new PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 2),
                new PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 1)
            }
        ));

        plugin.getLogger().info("Registered " + customMobs.size() + " custom mobs!");
    }

    public LivingEntity spawnMob(Location loc, String mobName) {
        MobData data = customMobs.get(mobName);
        if (data == null) return null;

        LivingEntity entity = (LivingEntity) loc.getWorld().spawnEntity(loc, data.getType());

        entity.setCustomName(data.getDisplayName());
        entity.setCustomNameVisible(true);

        entity.getAttribute(Attribute.MAX_HEALTH).setBaseValue(data.getHp());
        entity.setHealth(data.getHp());

        if (data.getDamage() > 0) {
            entity.getAttribute(Attribute.ATTACK_DAMAGE).setBaseValue(data.getDamage());
        }

        if (data.hasArmor() && data.getEquipment() != null) {
            EntityEquipment equip = entity.getEquipment();
            for (ItemStack item : data.getEquipment()) {
                String typeName = item.getType().name();
                if (typeName.contains("HELMET")) equip.setHelmet(item);
                else if (typeName.contains("CHESTPLATE")) equip.setChestplate(item);
                else if (typeName.contains("LEGGINGS")) equip.setLeggings(item);
                else if (typeName.contains("BOOTS")) equip.setBoots(item);
                else equip.setItemInMainHand(item);
            }
        }

        for (PotionEffect effect : data.getEffects()) {
            entity.addPotionEffect(effect);
        }

        return entity;
    }

    public MobData getMobData(String name) {
        return customMobs.get(name);
    }
}