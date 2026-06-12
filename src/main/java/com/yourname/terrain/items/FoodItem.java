package com.yourname.terrain.items;

import org.bukkit.Material;
import org.bukkit.potion.PotionEffect;

public class FoodItem {
    private final String id;
    private final String displayName;
    private final Material material;
    private final int hunger;
    private final double saturation;
    private final PotionEffect[] effects;
    private final String lore;

    public FoodItem(String id, String displayName, Material material, 
                    int hunger, double saturation, PotionEffect[] effects, String lore) {
        this.id = id;
        this.displayName = displayName;
        this.material = material;
        this.hunger = hunger;
        this.saturation = saturation;
        this.effects = effects;
        this.lore = lore;
    }

    public String getId() { return id; }
    public String getDisplayName() { return displayName; }
    public Material getMaterial() { return material; }
    public int getHunger() { return hunger; }
    public double getSaturation() { return saturation; }
    public PotionEffect[] getEffects() { return effects; }
    public String getLore() { return lore; }
}