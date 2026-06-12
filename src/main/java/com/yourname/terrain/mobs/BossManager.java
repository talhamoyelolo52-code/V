package com.yourname.terrain.mobs;

import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.Particle;
import org.bukkit.Sound;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BossManager {

    private final JavaPlugin plugin;
    private final Map<String, BossData> bosses = new HashMap<>();
    private final Random random = new Random();

    public BossManager(JavaPlugin plugin) {
        this.plugin = plugin;
        registerBosses();
    }

    private void registerBosses() {
        // VOID LEVIATHAN - Void Tears (End Boss)
        bosses.put("Void Leviathan", new BossData(
            EntityType.ENDER_DRAGON,
            "\u00a78\u00a7l\u2620 Void Leviathan \u00a78\u00a7l\u2620",
            500.0, 50.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 3)
            },
            new String[]{"Void Breath", "Teleport Slam", "Darkness Aura"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.DRAGON_HEAD),
                new ItemStack(org.bukkit.Material.DRAGON_BREATH, 16),
                new ItemStack(org.bukkit.Material.END_CRYSTAL, 4),
                new ItemStack(org.bukkit.Material.ELYTRA),
                new ItemStack(org.bukkit.Material.NETHERITE_INGOT, 8)
            },
            1.0
        ));

        // OBSIDIAN TITAN - Obsidian Spires
        bosses.put("Obsidian Titan", new BossData(
            EntityType.IRON_GOLEM,
            "\u00a78\u00a7l\u26a1 Obsidian Titan \u00a78\u00a7l\u26a1",
            400.0, 40.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.NETHERITE_SWORD),
                new ItemStack(org.bukkit.Material.NETHERITE_CHESTPLATE),
                new ItemStack(org.bukkit.Material.NETHERITE_HELMET),
                new ItemStack(org.bukkit.Material.NETHERITE_LEGGINGS),
                new ItemStack(org.bukkit.Material.NETHERITE_BOOTS)
            },
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.FIRE_RESISTANCE, 999999, 0)
            },
            new String[]{"Obsidian Shield", "Lava Wave", "Earthquake"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.OBSIDIAN, 64),
                new ItemStack(org.bukkit.Material.CRYING_OBSIDIAN, 32),
                new ItemStack(org.bukkit.Material.NETHERITE_INGOT, 12),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 2),
                new ItemStack(org.bukkit.Material.DIAMOND_BLOCK, 8)
            },
            1.0
        ));

        // ENDER OVERLORD - Ender City Ruins
        bosses.put("Ender Overlord", new BossData(
            EntityType.EVOKER,
            "\u00a75\u00a7l\u2726 Ender Overlord \u00a75\u00a7l\u2726",
            350.0, 35.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            },
            new String[]{"Ender Fury", "Vex Summon", "Teleport Strike"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.ELYTRA),
                new ItemStack(org.bukkit.Material.SHULKER_SHELL, 8),
                new ItemStack(org.bukkit.Material.CHORUS_FRUIT, 32),
                new ItemStack(org.bukkit.Material.DIAMOND, 16),
                new ItemStack(org.bukkit.Material.ENCHANTED_BOOK, 3)
            },
            1.0
        ));

        // CRYSTAL EMPRESS - Crystal Caverns
        bosses.put("Crystal Empress", new BossData(
            EntityType.RAVAGER,
            "\u00a7b\u00a7l\u2660 Crystal Empress \u00a7b\u00a7l\u2660",
            300.0, 30.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.DIAMOND_AXE),
                new ItemStack(org.bukkit.Material.DIAMOND_CHESTPLATE)
            },
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.GLOWING, 999999, 0)
            },
            new String[]{"Crystal Beam", "Diamond Shield", "Healing Aura"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.DIAMOND_BLOCK, 16),
                new ItemStack(org.bukkit.Material.AMETHYST_BLOCK, 32),
                new ItemStack(org.bukkit.Material.ECHO_SHARD, 8),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 3),
                new ItemStack(org.bukkit.Material.NETHERITE_INGOT, 6)
            },
            1.0
        ));

        // FROST KING - Frostburn Tundra
        bosses.put("Frost King", new BossData(
            EntityType.STRAY,
            "\u00a7b\u00a7l\u2744 Frost King \u00a7b\u00a7l\u2744",
            350.0, 35.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.BOW),
                new ItemStack(org.bukkit.Material.DIAMOND_CHESTPLATE),
                new ItemStack(org.bukkit.Material.DIAMOND_HELMET)
            },
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2)
            },
            new String[]{"Blizzard", "Ice Arrow", "Frost Nova"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.ICE, 64),
                new ItemStack(org.bukkit.Material.PACKED_ICE, 32),
                new ItemStack(org.bukkit.Material.BLUE_ICE, 16),
                new ItemStack(org.bukkit.Material.DIAMOND, 12),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 2)
            },
            1.0
        ));

        // METEOR LORD - Meteor Crater
        bosses.put("Meteor Lord", new BossData(
            EntityType.WITHER,
            "\u00a75\u00a7l\u2604 Meteor Lord \u00a75\u00a7l\u2604",
            450.0, 45.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.STRENGTH, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2)
            },
            new String[]{"Meteor Strike", "Gravity Pull", "Radiation Aura"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.NETHER_STAR),
                new ItemStack(org.bukkit.Material.NETHERITE_INGOT, 16),
                new ItemStack(org.bukkit.Material.DIAMOND_BLOCK, 12),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 5),
                new ItemStack(org.bukkit.Material.BEACON)
            },
            1.0
        ));

        // DREAM EATER PRIME - Dreamscape
        bosses.put("Dream Eater Prime", new BossData(
            EntityType.PHANTOM,
            "\u00a7d\u00a7l\u2605 Dream Eater Prime \u00a7d\u00a7l\u2605",
            300.0, 30.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 4),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            },
            new String[]{"Nightmare", "Sleep Paralysis", "Dream Drain"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.ELYTRA),
                new ItemStack(org.bukkit.Material.PHANTOM_MEMBRANE, 16),
                new ItemStack(org.bukkit.Material.DIAMOND, 10),
                new ItemStack(org.bukkit.Material.POTION, 8),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 2)
            },
            1.0
        ));

        // RAINBOW DRAGON - Rainbow Bridge
        bosses.put("Rainbow Dragon", new BossData(
            EntityType.ENDER_DRAGON,
            "\u00a7c\u00a7l\u2605 Rainbow Dragon \u00a7c\u00a7l\u2605",
            400.0, 40.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2)
            },
            new String[]{"Prismatic Beam", "Color Storm", "Rainbow Shield"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.DRAGON_HEAD),
                new ItemStack(org.bukkit.Material.DRAGON_BREATH, 16),
                new ItemStack(org.bukkit.Material.ELYTRA),
                new ItemStack(org.bukkit.Material.DIAMOND_BLOCK, 16),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 4)
            },
            1.0
        ));

        // SEA EMPEROR - Sunken City
        bosses.put("Sea Emperor", new BossData(
            EntityType.ELDER_GUARDIAN,
            "\u00a7b\u00a7l\u2654 Sea Emperor \u00a7b\u00a7l\u2654",
            400.0, 40.0, false,
            new ItemStack[]{},
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 3),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.RESISTANCE, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.WATER_BREATHING, 999999, 0)
            },
            new String[]{"Tidal Wave", "Ocean's Wrath", "Whirlpool"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.HEART_OF_THE_SEA),
                new ItemStack(org.bukkit.Material.TRIDENT),
                new ItemStack(org.bukkit.Material.PRISMARINE, 64),
                new ItemStack(org.bukkit.Material.DIAMOND_BLOCK, 12),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 3)
            },
            1.0
        ));

        // MIRROR GOD - Mirror Dimension
        bosses.put("Mirror God", new BossData(
            EntityType.ILLUSIONER,
            "\u00a7f\u00a7l\u2605 Mirror God \u00a7f\u00a7l\u2605",
            350.0, 35.0, true,
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.BOW),
                new ItemStack(org.bukkit.Material.DIAMOND_CHESTPLATE)
            },
            new PotionEffect[]{
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 999999, 2),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SPEED, 999999, 4),
                new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.INVISIBILITY, 999999, 0)
            },
            new String[]{"Mirror Clone", "Reflection", "Reality Warp"},
            new ItemStack[]{
                new ItemStack(org.bukkit.Material.GLASS, 64),
                new ItemStack(org.bukkit.Material.DIAMOND, 16),
                new ItemStack(org.bukkit.Material.ENDER_PEARL, 16),
                new ItemStack(org.bukkit.Material.ENCHANTED_BOOK, 5),
                new ItemStack(org.bukkit.Material.ENCHANTED_GOLDEN_APPLE, 2)
            },
            1.0
        ));

        plugin.getLogger().info("Registered " + bosses.size() + " BOSSES!");
    }

    public LivingEntity spawnBoss(Location loc, String bossName) {
        BossData data = bosses.get(bossName);
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

        // Boss spawn effects
        loc.getWorld().strikeLightningEffect(loc);
        loc.getWorld().spawnParticle(Particle.DRAGON_BREATH, loc, 100, 2, 2, 2, 0.1);
        loc.getWorld().playSound(loc, Sound.ENTITY_WITHER_SPAWN, 2.0f, 0.5f);

        // Announce boss spawn
        for (org.bukkit.entity.Player player : loc.getWorld().getPlayers()) {
            if (player.getLocation().distance(loc) < 100) {
                player.sendTitle("\u00a74\u00a7lBOSS SPAWN!", 
                    data.getDisplayName(), 10, 70, 20);
                player.playSound(player.getLocation(), Sound.ENTITY_WITHER_SPAWN, 1.0f, 1.0f);
            }
        }

        return entity;
    }

    public void handleBossDeath(LivingEntity boss, Location loc) {
        BossData data = null;
        for (Map.Entry<String, BossData> entry : bosses.entrySet()) {
            if (entry.getValue().getDisplayName().equals(boss.getCustomName())) {
                data = entry.getValue();
                break;
            }
        }

        if (data == null) return;

        // Death effects
        loc.getWorld().strikeLightningEffect(loc);
        loc.getWorld().spawnParticle(Particle.TOTEM_OF_UNDYING, loc, 200, 3, 3, 3, 0.1);
        loc.getWorld().playSound(loc, Sound.ENTITY_WITHER_DEATH, 2.0f, 1.0f);

        // Drop loot
        for (ItemStack drop : data.getDrops()) {
            if (random.nextDouble() <= data.getDropChance()) {
                loc.getWorld().dropItemNaturally(loc, drop.clone());
            }
        }

        // Announce death
        for (org.bukkit.entity.Player player : loc.getWorld().getPlayers()) {
            if (player.getLocation().distance(loc) < 100) {
                player.sendTitle("\u00a7a\u00a7lBOSS DEFEATED!", 
                    "\u00a7eLoot dropped!", 10, 70, 20);
                player.playSound(player.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.0f);
            }
        }
    }

    public BossData getBossData(String name) {
        return bosses.get(name);
    }

    public Map<String, BossData> getAllBosses() {
        return bosses;
    }
}