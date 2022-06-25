package net.nospacehuman.blodreina.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.nospacehuman.blodreina.NouBlodreinaNowe;
import net.nospacehuman.blodreina.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        NouBlodreinaNowe.LOGGER.info("Registering Fuels for " + NouBlodreinaNowe.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModItems.FRAGMENT_OF_THE_UNDERWORLD, 20*1500);
    }
}
