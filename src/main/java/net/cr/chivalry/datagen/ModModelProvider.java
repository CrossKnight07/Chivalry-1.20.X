package net.cr.chivalry.datagen;


import net.cr.chivalry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DAGGER_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAPIER_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONGSWORD_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROADSWORD_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPEAR_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORNING_STAR_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BATTLE_AXE_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAR_HAMMER_MOLD, Models.GENERATED);

        itemModelGenerator.register(ModItems.DAGGER_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAPIER_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONGSWORD_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROADSWORD_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPEAR_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORNING_STAR_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BATTLE_AXE_BLUEPRINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAR_HAMMER_BLUEPRINT, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_LONGSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_MORNING_STAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BATTLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_WAR_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_LONGSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_MORNING_STAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_BATTLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_WAR_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.GOLDEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_LONGSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_MORNING_STAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_BATTLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_WAR_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_LONGSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_MORNING_STAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_BATTLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_WAR_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_LONGSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_MORNING_STAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_BATTLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_WAR_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SMITHING_HAMMER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CARPENTERS_CHISEL, Models.HANDHELD);
    }
}
