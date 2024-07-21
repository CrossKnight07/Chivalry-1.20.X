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
        itemModelGenerator.register(ModItems.RAPIER_STONE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORNING_STAR_STONE, Models.GENERATED);

        itemModelGenerator.register(ModItems.CREEPER_COOKIE, Models.GENERATED);

        itemModelGenerator.register(ModItems.LINKED_CHAINMAIL_MESH, Models.GENERATED);
    }
}
