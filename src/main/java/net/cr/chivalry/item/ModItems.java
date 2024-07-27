package net.cr.chivalry.item;

import net.cr.chivalry.Chivalry;
import net.cr.chivalry.item.custom.SmithingHammerItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Weapon stones to craft any weapon-type
    public static final Item DAGGER_STONE = registerItem("dagger_stone", new Item(new FabricItemSettings()));
    public static final Item RAPIER_STONE = registerItem("rapier_stone", new Item(new FabricItemSettings()));
    public static final Item LONGSWORD_STONE = registerItem("longsword_stone", new Item(new FabricItemSettings()));
    public static final Item BROADSWORD_STONE = registerItem("broadsword_stone", new Item(new FabricItemSettings()));
    public static final Item SPEAR_STONE = registerItem("spear_stone", new Item(new FabricItemSettings()));
    public static final Item MORNING_STAR_STONE = registerItem("morning_star_stone", new Item(new FabricItemSettings()));
    public static final Item BATTLE_AXE_STONE = registerItem("battle_axe_stone", new Item(new FabricItemSettings()));
    public static final Item WAR_HAMMER_STONE = registerItem("war_hammer_stone", new Item(new FabricItemSettings()));

    // Netherite weapons
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new SwordItem(ToolMaterials.NETHERITE, 1, -0.5f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_RAPIER = registerItem("netherite_rapier",
            new SwordItem(ToolMaterials.NETHERITE, 3, -2.4f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_LONGSWORD = registerItem("netherite_longsword",
            new SwordItem(ToolMaterials.NETHERITE, 3, -2.4f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_BROADSWORD = registerItem("netherite_broadsword",
            new SwordItem(ToolMaterials.NETHERITE, 7, -3.5f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear",
            new SwordItem(ToolMaterials.NETHERITE, 3, -2.4f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_MORNING_STAR = registerItem("netherite_morning_star",
            new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_BATTLE_AXE = registerItem("netherite_battle_axe",
            new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_WAR_HAMMER = registerItem("netherite_war_hammer",
            new SwordItem(ToolMaterials.NETHERITE, 4, -3.0f, new Item.Settings().fireproof()));

    // Tools
    public static final Item SMITHING_HAMMER = registerItem("smithing_hammer", new SmithingHammerItem(new Item.Settings().maxCount(1).maxDamage(256).fireproof()));

    // Miscellaneous items
    public static final Item IRON_PLATING = registerItem("iron_plating", new Item(new FabricItemSettings()));

    public static final Item LINKED_CHAINMAIL_MESH = registerItem("linked_chainmail_mesh", new Item(new FabricItemSettings()));

    public static final Item CREEPER_COOKIE = registerItem("creeper_cookie", new Item(new FabricItemSettings().food(ModFoodComponents.CREEPER_COOKIE)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Chivalry.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Chivalry.LOGGER.info("Registering Mod Items for " + Chivalry.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
