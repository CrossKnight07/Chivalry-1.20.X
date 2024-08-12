package net.cr.chivalry.item;

import net.cr.chivalry.Chivalry;
import net.cr.chivalry.item.custom.CarpentersChiselItem;
import net.cr.chivalry.item.custom.DaggerItem;
import net.cr.chivalry.item.custom.RapierItem;
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
    public static final Item DAGGER_MOLD = registerItem("dagger_mold", new Item(new FabricItemSettings()));
    public static final Item RAPIER_MOLD = registerItem("rapier_mold", new Item(new FabricItemSettings()));
    public static final Item LONGSWORD_MOLD = registerItem("longsword_mold", new Item(new FabricItemSettings()));
    public static final Item BROADSWORD_MOLD = registerItem("broadsword_mold", new Item(new FabricItemSettings()));
    public static final Item SPEAR_MOLD = registerItem("spear_mold", new Item(new FabricItemSettings()));
    public static final Item MORNING_STAR_MOLD = registerItem("morning_star_mold", new Item(new FabricItemSettings()));
    public static final Item BATTLE_AXE_MOLD = registerItem("battle_axe_mold", new Item(new FabricItemSettings()));
    public static final Item WAR_HAMMER_MOLD = registerItem("war_hammer_mold", new Item(new FabricItemSettings()));

    public static final Item DAGGER_BLUEPRINT = registerItem("dagger_blueprint", new Item(new FabricItemSettings()));
    public static final Item RAPIER_BLUEPRINT = registerItem("rapier_blueprint", new Item(new FabricItemSettings()));
    public static final Item LONGSWORD_BLUEPRINT = registerItem("longsword_blueprint", new Item(new FabricItemSettings()));
    public static final Item BROADSWORD_BLUEPRINT = registerItem("broadsword_blueprint", new Item(new FabricItemSettings()));
    public static final Item SPEAR_BLUEPRINT = registerItem("spear_blueprint", new Item(new FabricItemSettings()));
    public static final Item MORNING_STAR_BLUEPRINT = registerItem("morning_star_blueprint", new Item(new FabricItemSettings()));
    public static final Item BATTLE_AXE_BLUEPRINT = registerItem("battle_axe_blueprint", new Item(new FabricItemSettings()));
    public static final Item WAR_HAMMER_BLUEPRINT = registerItem("war_hammer_blueprint", new Item(new FabricItemSettings()));

    // Netherite weapons
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new DaggerItem(ToolMaterials.NETHERITE, 1, -0.5f, new Item.Settings().fireproof()));
    public static final Item NETHERITE_RAPIER = registerItem("netherite_rapier",
            new RapierItem(ToolMaterials.NETHERITE, 2, -2.4f, new Item.Settings().fireproof()));
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

    // Diamond weapons
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new DaggerItem(ToolMaterials.DIAMOND, 1, -0.5f, new Item.Settings()));
    public static final Item DIAMOND_RAPIER = registerItem("diamond_rapier",
            new RapierItem(ToolMaterials.DIAMOND, 2, -2.4f, new Item.Settings()));
    public static final Item DIAMOND_LONGSWORD = registerItem("diamond_longsword",
            new SwordItem(ToolMaterials.DIAMOND, 3, -2.4f, new Item.Settings()));
    public static final Item DIAMOND_BROADSWORD = registerItem("diamond_broadsword",
            new SwordItem(ToolMaterials.DIAMOND, 7, -3.5f, new Item.Settings()));
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear",
            new SwordItem(ToolMaterials.DIAMOND, 3, -2.4f, new Item.Settings()));
    public static final Item DIAMOND_MORNING_STAR = registerItem("diamond_morning_star",
            new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings()));
    public static final Item DIAMOND_BATTLE_AXE = registerItem("diamond_battle_axe",
            new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings()));
    public static final Item DIAMOND_WAR_HAMMER = registerItem("diamond_war_hammer",
            new SwordItem(ToolMaterials.DIAMOND, 4, -3.0f, new Item.Settings()));

    // Golden weapons
    public static final Item GOLDEN_DAGGER = registerItem("golden_dagger",
            new DaggerItem(ToolMaterials.GOLD, 1, -0.5f, new Item.Settings()));
    public static final Item GOLDEN_RAPIER = registerItem("golden_rapier",
            new RapierItem(ToolMaterials.GOLD, 2, -2.4f, new Item.Settings()));
    public static final Item GOLDEN_LONGSWORD = registerItem("golden_longsword",
            new SwordItem(ToolMaterials.GOLD, 3, -2.4f, new Item.Settings()));
    public static final Item GOLDEN_BROADSWORD = registerItem("golden_broadsword",
            new SwordItem(ToolMaterials.GOLD, 7, -3.5f, new Item.Settings()));
    public static final Item GOLDEN_SPEAR = registerItem("golden_spear",
            new SwordItem(ToolMaterials.GOLD, 3, -2.4f, new Item.Settings()));
    public static final Item GOLDEN_MORNING_STAR = registerItem("golden_morning_star",
            new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings()));
    public static final Item GOLDEN_BATTLE_AXE = registerItem("golden_battle_axe",
            new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings()));
    public static final Item GOLDEN_WAR_HAMMER = registerItem("golden_war_hammer",
            new SwordItem(ToolMaterials.GOLD, 4, -3.0f, new Item.Settings()));

    // Iron weapons
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new DaggerItem(ToolMaterials.IRON, 1, -0.5f, new Item.Settings()));
    public static final Item IRON_RAPIER = registerItem("iron_rapier",
            new RapierItem(ToolMaterials.IRON, 2, -2.4f, new Item.Settings()));
    public static final Item IRON_LONGSWORD = registerItem("iron_longsword",
            new SwordItem(ToolMaterials.IRON, 3, -2.4f, new Item.Settings()));
    public static final Item IRON_BROADSWORD = registerItem("iron_broadsword",
            new SwordItem(ToolMaterials.IRON, 7, -3.5f, new Item.Settings()));
    public static final Item IRON_SPEAR = registerItem("iron_spear",
            new SwordItem(ToolMaterials.IRON, 3, -2.4f, new Item.Settings()));
    public static final Item IRON_MORNING_STAR = registerItem("iron_morning_star",
            new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings()));
    public static final Item IRON_BATTLE_AXE = registerItem("iron_battle_axe",
            new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings()));
    public static final Item IRON_WAR_HAMMER = registerItem("iron_war_hammer",
            new SwordItem(ToolMaterials.IRON, 4, -3.0f, new Item.Settings()));

    // Wooden weapons
    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            new DaggerItem(ToolMaterials.WOOD, 1, -0.5f, new Item.Settings()));
    public static final Item WOODEN_RAPIER = registerItem("wooden_rapier",
            new RapierItem(ToolMaterials.WOOD, 2, -2.4f, new Item.Settings()));
    public static final Item WOODEN_LONGSWORD = registerItem("wooden_longsword",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4f, new Item.Settings()));
    public static final Item WOODEN_BROADSWORD = registerItem("wooden_broadsword",
            new SwordItem(ToolMaterials.WOOD, 7, -3.5f, new Item.Settings()));
    public static final Item WOODEN_SPEAR = registerItem("wooden_spear",
            new SwordItem(ToolMaterials.WOOD, 3, -2.4f, new Item.Settings()));
    public static final Item WOODEN_MORNING_STAR = registerItem("wooden_morning_star",
            new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings()));
    public static final Item WOODEN_BATTLE_AXE = registerItem("wooden_battle_axe",
            new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings()));
    public static final Item WOODEN_WAR_HAMMER = registerItem("wooden_war_hammer",
            new SwordItem(ToolMaterials.WOOD, 4, -3.0f, new Item.Settings()));

    // Tools
    public static final Item SMITHING_HAMMER = registerItem("smithing_hammer",
            new SmithingHammerItem(ToolMaterials.NETHERITE, 0, -2.8f, new Item.Settings().maxDamage(256).fireproof()));

    public static final Item CARPENTERS_CHISEL = registerItem("carpenters_chisel",
            new CarpentersChiselItem(ToolMaterials.NETHERITE, 0, -2.8f, new Item.Settings().maxDamage(256).fireproof()));

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
