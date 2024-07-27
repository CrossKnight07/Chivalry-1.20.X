package net.cr.chivalry.datagen;

import net.cr.chivalry.block.ModBlocks;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STURDY_SPRUCE_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.DAGGER_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAPIER_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LONGSWORD_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROADSWORD_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPEAR_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORNING_STAR_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BATTLE_AXE_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WAR_HAMMER_STONE, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERITE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_RAPIER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_LONGSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BROADSWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_SPEAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_MORNING_STAR, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_BATTLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_WAR_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.SMITHING_HAMMER, Models.HANDHELD);

        itemModelGenerator.register(ModItems.IRON_PLATING, Models.GENERATED);

        itemModelGenerator.register(ModItems.CREEPER_COOKIE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LINKED_CHAINMAIL_MESH, Models.GENERATED);
    }
}
