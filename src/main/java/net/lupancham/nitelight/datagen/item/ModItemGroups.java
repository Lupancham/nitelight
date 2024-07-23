package net.lupancham.nitelight.datagen.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lupancham.nitelight.Nitelight;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NITELIGHT_ITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.tryParse(Nitelight.MOD_ID + ":" + "nitelight_Itemgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.nitelight"))
                    .icon(() -> new ItemStack(Items.CARVED_PUMPKIN))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SULFUR);
                    })
                    .build());

    public static void registerItemGroups() {
        Nitelight.LOGGER.info("Registering item groups for " + Nitelight.MOD_ID);
    }
}
