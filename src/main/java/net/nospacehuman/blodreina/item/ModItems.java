package net.nospacehuman.blodreina.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nospacehuman.blodreina.NouBlodreinaNowe;
import net.nospacehuman.blodreina.item.custom.EightBallItem;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(32)));
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(64)));
    public static final Item SHARD_OF_TANZANITE = registerItem("shard_of_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(64).food(
                    new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,20*300, 255, false, false, false), 1f).snack().build())));
    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.TANZANITE).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(NouBlodreinaNowe.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NouBlodreinaNowe.LOGGER.debug("registering mod items for " + NouBlodreinaNowe.MOD_ID);
    }
}
