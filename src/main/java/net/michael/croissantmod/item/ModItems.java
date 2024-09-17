package net.michael.croissantmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.michael.croissantmod.CroissantMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;




public class ModItems {

    public static final Item Croissant = registerItem( "croissant", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item (new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CroissantMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CroissantMod.LOGGER.info("Registering Mod Items for " + CroissantMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RAW_PINK_GARNET);
            entries.add(Croissant);
        });
    }
}
