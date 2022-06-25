package net.nospacehuman.blodreina.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.nospacehuman.blodreina.NouBlodreinaNowe;
import net.nospacehuman.blodreina.block.custom.FloaterBlock;
import net.nospacehuman.blodreina.item.ModItemGroup;

public class ModBlocks {

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(55f).luminance(11)),
                ModItemGroup.TANZANITE);

    public static final Block COMPRESSED_TANZANITE_BLOCK = registerBlock("compressed_tanzanite_block",
            new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(76f).luminance(13)),
                ModItemGroup.TANZANITE);

    public static final Block FLOATER = registerBlock("floater",
            new FloaterBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(65f).luminance(15)),
                ModItemGroup.TANZANITE);

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(8f).luminance(7),
                    UniformIntProvider.create(3, 7)),
                        ModItemGroup.TANZANITE);

    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(10f).luminance(7),
                    UniformIntProvider.create(5, 10)),
                        ModItemGroup.TANZANITE);

    public static final Block NETHERRACK_TANZANITE_ORE = registerBlock("netherrack_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(8f).luminance(10),
                    UniformIntProvider.create(5, 10)),
                        ModItemGroup.TANZANITE);

    public static final Block ENDSTONE_TANZANITE_ORE = registerBlock("endstone_tanzanite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(8f).luminance(8),
                    UniformIntProvider.create(7, 14)),
                        ModItemGroup.TANZANITE);


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(NouBlodreinaNowe.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(NouBlodreinaNowe.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        NouBlodreinaNowe.LOGGER.info("Registering ModBlocks for " + NouBlodreinaNowe.MOD_ID);
    }
}
