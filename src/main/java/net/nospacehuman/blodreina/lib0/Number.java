package net.nospacehuman.blodreina.lib0;

import java.util.Random;

public class Number {
    public static float number() {
        float leftLimit = 16F;
        float rightLimit = 128F;
        float generatedFloat;
        generatedFloat = leftLimit + new Random().nextFloat() * (rightLimit - leftLimit);
        return generatedFloat;
    }
}
