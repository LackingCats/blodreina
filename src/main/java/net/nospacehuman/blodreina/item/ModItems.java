package net.nospacehuman.blodreina.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nospacehuman.blodreina.NouBlodreinaNowe;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(32)));
    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(NouBlodreinaNowe.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NouBlodreinaNowe.LOGGER.debug("registering mod items for " + NouBlodreinaNowe.MOD_ID);
    }
}
