package net.lupancham.nitelight.datagen.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lupancham.nitelight.Nitelight;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SULFUR = registerItem(new Item(new Item.Settings()));

    private static void addItemstoFirstItemGroup(FabricItemGroupEntries entries) {
        entries.add(Items.STONE);
    }

    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(Nitelight.MOD_ID + ":" + "sulfur"), item);
    }

    public static void registerItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemstoFirstItemGroup);
    }
}
