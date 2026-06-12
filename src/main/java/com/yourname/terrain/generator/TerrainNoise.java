package com.yourname.terrain.generator;

import java.util.Random;

public class TerrainNoise {

    private final Random random;
    private final double scale;

    public TerrainNoise(long seed, double scale) {
        this.random = new Random(seed);
        this.scale = scale;
    }

    public double noise(double x, double z) {
        // Simple noise function - replace with Perlin/Simplex for production
        return random.nextDouble() * scale;
    }

    public double getHeight(int x, int z) {
        return 64 + noise(x * 0.1, z * 0.1) * 20;
    }
}