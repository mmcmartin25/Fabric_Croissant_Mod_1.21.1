package net.michael.croissantmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.michael.croissantmod.CroissantMod;
import net.michael.croissantmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup croissantmod_items_group = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CroissantMod.MOD_ID, "croissantmod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CROISSANT))
                    .displayName(Text.translatable("itemgroup.croissantmod.croissantmod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CROISSANT);
                        entries.add(ModItems.BUTTER);
                        entries.add(ModItems.DOUGH);
                        entries.add(ModItems.RAW_DOUGH);
                        entries.add(ModItems.DUBIOUS_MEAL);
                        entries.add(ModItems.CROISSANTWAND);

                        entries.add(ModBlocks.CROISSANT_BLOCK);
                        entries.add(ModBlocks.OVEN);
                        entries.add(ModBlocks.BUTTERED_CROISSANT_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        CroissantMod.LOGGER.info("Registering Item Groups for " + CroissantMod.MOD_ID);
    }
}