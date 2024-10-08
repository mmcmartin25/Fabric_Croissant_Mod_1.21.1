package net.michael.croissantmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.michael.croissantmod.CroissantMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CROISSANT_BLOCK = registerBlock("croissant_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.MOSS_BLOCK)));

    public static final Block BUTTERED_CROISSANT_BLOCK = registerBlock("buttered_croissant_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.HONEY)));


    public static final Block OVEN = registerBlock("oven",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CroissantMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CroissantMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CroissantMod.LOGGER.info("Registering Mod Blocks for " + CroissantMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.CROISSANT_BLOCK);
            entries.add(ModBlocks.OVEN);
            entries.add(ModBlocks.BUTTERED_CROISSANT_BLOCK);
        });
    }
}