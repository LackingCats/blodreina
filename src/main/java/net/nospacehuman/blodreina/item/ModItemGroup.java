package net.nospacehuman.blodreina.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nospacehuman.blodreina.NouBlodreinaNowe;

public class ModItemGroup {
    public static ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(NouBlodreinaNowe.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));

}
