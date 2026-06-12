package com.yourname.terrain.mobs;

import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class MobData {
    private final EntityType type;
    private final String displayName;
    private final double hp;
    private final double damage;
    private final boolean hasArmor;
    private final ItemStack[] equipment;
    private final PotionEffect[] effects;

    public MobData(EntityType type, String displayName, double hp, 
                   double damage, boolean hasArmor, 
                   ItemStack[] equipment, PotionEffect[] effects) {
        this.type = type;
        this.displayName = displayName;
        this.hp = hp;
        this.damage = damage;
        this.hasArmor = hasArmor;
        this.equipment = equipment;
        this.effects = effects;
    }

    public EntityType getType() { return type; }
    public String getDisplayName() { return displayName; }
    public double getHp() { return hp; }
    public double getDamage() { return damage; }
    public boolean hasArmor() { return hasArmor; }
    public ItemStack[] getEquipment() { return equipment; }
    public PotionEffect[] getEffects() { return effects; }
}