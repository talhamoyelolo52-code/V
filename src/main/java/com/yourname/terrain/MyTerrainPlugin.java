package com.yourname.terrain;

import org.bukkit.plugin.java.JavaPlugin;
import com.yourname.terrain.biome.BiomeManager;
import com.yourname.terrain.listeners.PlayerMoveListener;
import com.yourname.terrain.listeners.ChunkLoadListener;
import com.yourname.terrain.structures.StructureManager;
import com.yourname.terrain.mobs.CustomMobManager;
import com.yourname.terrain.mobs.BossManager;
import com.yourname.terrain.items.FoodManager;
import com.yourname.terrain.commands.BiomeCommand;
import com.yourname.terrain.commands.TerrainCommand;

public class MyTerrainPlugin extends JavaPlugin {

    private static MyTerrainPlugin instance;
    private BiomeManager biomeManager;
    private StructureManager structureManager;
    private CustomMobManager mobManager;
    private BossManager bossManager;
    private FoodManager foodManager;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        biomeManager = new BiomeManager(this);
        structureManager = new StructureManager(this);
        mobManager = new CustomMobManager(this);
        bossManager = new BossManager(this);
        foodManager = new FoodManager();

        getServer().getPluginManager().registerEvents(new PlayerMoveListener(this), this);
        getServer().getPluginManager().registerEvents(new ChunkLoadListener(this), this);

        getCommand("biome").setExecutor(new BiomeCommand(this));
        getCommand("terrain").setExecutor(new TerrainCommand(this));

        getLogger().info("========================================");
        getLogger().info(" MyTerrainPlugin Enabled!");
        getLogger().info(" 70+ Custom Biomes Loaded!");
        getLogger().info(" 50+ Custom Foods & Fruits!");
        getLogger().info(" 10 Epic Bosses!");
        getLogger().info(" Structures, Loot & Mobs Active!");
        getLogger().info("========================================");
    }

    @Override
    public void onDisable() {
        getLogger().info("MyTerrainPlugin disabled!");
    }

    public static MyTerrainPlugin getInstance() { return instance; }
    public BiomeManager getBiomeManager() { return biomeManager; }
    public StructureManager getStructureManager() { return structureManager; }
    public CustomMobManager getMobManager() { return mobManager; }
    public BossManager getBossManager() { return bossManager; }
    public FoodManager getFoodManager() { return foodManager; }
}