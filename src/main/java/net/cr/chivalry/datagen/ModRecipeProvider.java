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
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_PLATING, 1)
                .input(Ingredient.ofItems(Items.IRON_INGOT))
                .input(Ingredient.ofItems(ModItems.SMITHING_HAMMER))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(ModItems.SMITHING_HAMMER), conditionsFromItem(ModItems.SMITHING_HAMMER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_PLATING)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STURDY_SPRUCE_LOG, 1)
                .pattern(" N ")
                .pattern("NLN")
                .pattern(" N ")
                .input('N', Items.IRON_NUGGET)
                .input('L', Items.SPRUCE_LOG)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(Items.SPRUCE_LOG), conditionsFromItem(Items.SPRUCE_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STURDY_SPRUCE_LOG))); // Change Identifier if multiple recipes have same output

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DAGGER_STONE), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_DAGGER)
                .criterion(hasItem(ModItems.DAGGER_STONE), conditionsFromItem(ModItems.DAGGER_STONE))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_DAGGER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.RAPIER_STONE), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_RAPIER)
                .criterion(hasItem(ModItems.RAPIER_STONE), conditionsFromItem(ModItems.RAPIER_STONE))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_RAPIER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LONGSWORD_STONE), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_LONGSWORD)
                .criterion(hasItem(ModItems.LONGSWORD_STONE), conditionsFromItem(ModItems.LONGSWORD_STONE))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_LONGSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BROADSWORD_STONE), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_BROADSWORD)
                .criterion(hasItem(ModItems.BROADSWORD_STONE), conditionsFromItem(ModItems.BROADSWORD_STONE))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_BROADSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.SPEAR_STONE), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_SPEAR)
                .criterion(hasItem(ModItems.SPEAR_STONE), conditionsFromItem(ModItems.SPEAR_STONE))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_SPEAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.MORNING_STAR_STONE), Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_MORNING_STAR)
                .criterion(hasItem(ModItems.MORNING_STAR_STONE), conditionsFromItem(ModItems.MORNING_STAR_STONE))
                .criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_MORNING_STAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BATTLE_AXE_STONE), Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_BATTLE_AXE)
                .criterion(hasItem(ModItems.BATTLE_AXE_STONE), conditionsFromItem(ModItems.BATTLE_AXE_STONE))
                .criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_BATTLE_AXE)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.WAR_HAMMER_STONE), Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_WAR_HAMMER)
                .criterion(hasItem(ModItems.WAR_HAMMER_STONE), conditionsFromItem(ModItems.WAR_HAMMER_STONE))
                .criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_WAR_HAMMER)));
    }
}

