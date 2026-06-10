package net.hosam.microbes.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hosam.microbes.Microbes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item SWAB = registerItem("swab", new Item(new Item.Settings()));
    public static final Item SAMPLE_TRAY = registerItem("sample_tray", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Microbes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Microbes.LOGGER.info("Registering Mod Items for " + Microbes.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SWAB);
            entries.add(SAMPLE_TRAY);
        });
    }
}