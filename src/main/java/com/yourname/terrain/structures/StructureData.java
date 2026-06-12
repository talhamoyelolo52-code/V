package com.yourname.terrain.structures;

import org.bukkit.Material;
import java.util.List;

public class StructureData {
    private final String name;
    private final List<Material> blocks;
    private final List<LootItem> loot;
    private final String guardianMob;

    public StructureData(String name, List<Material> blocks, 
                        List<LootItem> loot, String guardianMob) {
        this.name = name;
        this.blocks = blocks;
        this.loot = loot;
        this.guardianMob = guardianMob;
    }

    public String getName() { return name; }
    public List<Material> getBlocks() { return blocks; }
    public List<LootItem> getLoot() { return loot; }
    public String getGuardianMob() { return guardianMob; }
}