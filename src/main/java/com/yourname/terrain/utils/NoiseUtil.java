package com.yourname.terrain.utils;

public class NoiseUtil {

    public static double lerp(double a, double b, double t) {
        return a + t * (b - a);
    }

    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }

    public static double fade(double t) {
        return t * t * t * (t * (t * 6 - 15) + 10);
    }

    public static int fastFloor(double x) {
        return x < 0 ? (int) x - 1 : (int) x;
    }
}