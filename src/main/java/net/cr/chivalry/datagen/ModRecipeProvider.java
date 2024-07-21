package net.cr.chivalry.datagen;

import net.cr.chivalry.block.ModBlocks;
import net.cr.chivalry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STURDY_SPRUCE_LOG, 1)
                .pattern(" N ")
                .pattern("NLN")
                .pattern(" N ")
                .input('N', Items.IRON_NUGGET)
                .input('L', Items.SPRUCE_LOG)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(Items.SPRUCE_LOG), conditionsFromItem(Items.SPRUCE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STURDY_SPRUCE_LOG))); // Change Identifier if multiple recipes have same output

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.RAPIER_STONE), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(Items.COBBLESTONE), RecipeCategory.COMBAT, Items.WOODEN_SWORD)
                .criterion(hasItem(ModItems.RAPIER_STONE), conditionsFromItem(ModItems.RAPIER_STONE))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(Items.WOODEN_SWORD)));
    }
}

