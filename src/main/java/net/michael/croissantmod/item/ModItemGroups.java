package net.michael.croissantmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.michael.croissantmod.CroissantMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CROISSANT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CroissantMod.MOD_ID, "croissant_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CROISSANT))
                    .displayName(Text.translatable("itemgroup.croissantmod.croissant_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CROISSANT);
                    }).build());
    public static final ItemGroup CROISSANT_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CroissantMod.MOD_ID, "croissant_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CROISSANT_BLOCK))
                    .displayName(Text.translatable("itemgroup.croissantmod.croissant_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CROISSANT_BLOCK);
                    }).build());

    public static void registerItemGropus() {
        CroissantMod.LOGGER.info("Registering Item Groups for " + CroissantMod.MOD_ID);
    }
}
