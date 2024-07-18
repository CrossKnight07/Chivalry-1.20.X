package net.cr.chivalry.item;

import net.cr.chivalry.Chivalry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAPIER_STONE = registerItem("rapier_stone", new Item(new FabricItemSettings()));
    public static final Item MORNING_STAR_STONE = registerItem("morning_star_stone", new Item(new FabricItemSettings()));
    public static final Item LINKED_CHAINMAIL_MESH = registerItem("linked_chainmail_mesh", new Item(new FabricItemSettings()));


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Chivalry.MOD_ID, name), item);
    }

    public static void reisterModItems() {
        Chivalry.LOGGER.info("Registering Mod Items for " + Chivalry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
