package net.cr.chivalry.datagen;

import net.cr.chivalry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_DAGGER, 1)
                .input(Ingredient.ofItems(Items.WOODEN_SWORD))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.DAGGER_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_SWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.DAGGER_BLUEPRINT), conditionsFromItem(ModItems.DAGGER_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_DAGGER))); // Change Identifier if multiple recipes have same output

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_RAPIER, 1)
                .input(Ingredient.ofItems(Items.WOODEN_SWORD))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.RAPIER_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_SWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.RAPIER_BLUEPRINT), conditionsFromItem(ModItems.RAPIER_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_RAPIER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_LONGSWORD, 1)
                .input(Ingredient.ofItems(Items.WOODEN_SWORD))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.LONGSWORD_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_SWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.LONGSWORD_BLUEPRINT), conditionsFromItem(ModItems.LONGSWORD_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_LONGSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_BROADSWORD, 1)
                .input(Ingredient.ofItems(Items.WOODEN_SWORD))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.BROADSWORD_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_SWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.BROADSWORD_BLUEPRINT), conditionsFromItem(ModItems.BROADSWORD_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_BROADSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_SPEAR, 1)
                .input(Ingredient.ofItems(Items.WOODEN_SWORD))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.SPEAR_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_SWORD), conditionsFromItem(Items.WOODEN_SWORD))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.SPEAR_BLUEPRINT), conditionsFromItem(ModItems.SPEAR_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_SPEAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_MORNING_STAR, 1)
                .input(Ingredient.ofItems(Items.WOODEN_AXE))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.MORNING_STAR_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.WOODEN_AXE))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.MORNING_STAR_BLUEPRINT), conditionsFromItem(ModItems.MORNING_STAR_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_MORNING_STAR)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_BATTLE_AXE, 1)
                .input(Ingredient.ofItems(Items.WOODEN_AXE))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.BATTLE_AXE_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.WOODEN_AXE))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.BATTLE_AXE_BLUEPRINT), conditionsFromItem(ModItems.BATTLE_AXE_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_BATTLE_AXE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WOODEN_WAR_HAMMER, 1)
                .input(Ingredient.ofItems(Items.WOODEN_AXE))
                .input(Ingredient.ofItems(ModItems.CARPENTERS_CHISEL))
                .input(Ingredient.ofItems(ModItems.WAR_HAMMER_BLUEPRINT))
                .criterion(hasItem(Items.WOODEN_AXE), conditionsFromItem(Items.WOODEN_AXE))
                .criterion(hasItem(ModItems.CARPENTERS_CHISEL), conditionsFromItem(ModItems.CARPENTERS_CHISEL))
                .criterion(hasItem(ModItems.WAR_HAMMER_BLUEPRINT), conditionsFromItem(ModItems.WAR_HAMMER_BLUEPRINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WOODEN_WAR_HAMMER)));



        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DAGGER_MOLD), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_DAGGER)
                .criterion(hasItem(ModItems.DAGGER_MOLD), conditionsFromItem(ModItems.DAGGER_MOLD))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_DAGGER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.RAPIER_MOLD), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_RAPIER)
                .criterion(hasItem(ModItems.RAPIER_MOLD), conditionsFromItem(ModItems.RAPIER_MOLD))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_RAPIER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LONGSWORD_MOLD), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_LONGSWORD)
                .criterion(hasItem(ModItems.LONGSWORD_MOLD), conditionsFromItem(ModItems.LONGSWORD_MOLD))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_LONGSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BROADSWORD_MOLD), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_BROADSWORD)
                .criterion(hasItem(ModItems.BROADSWORD_MOLD), conditionsFromItem(ModItems.BROADSWORD_MOLD))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_BROADSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.SPEAR_MOLD), Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_SPEAR)
                .criterion(hasItem(ModItems.SPEAR_MOLD), conditionsFromItem(ModItems.SPEAR_MOLD))
                .criterion(hasItem(Items.NETHERITE_SWORD), conditionsFromItem(Items.NETHERITE_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_SPEAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.MORNING_STAR_MOLD), Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_MORNING_STAR)
                .criterion(hasItem(ModItems.MORNING_STAR_MOLD), conditionsFromItem(ModItems.MORNING_STAR_MOLD))
                .criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_MORNING_STAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BATTLE_AXE_MOLD), Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_BATTLE_AXE)
                .criterion(hasItem(ModItems.BATTLE_AXE_MOLD), conditionsFromItem(ModItems.BATTLE_AXE_MOLD))
                .criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_BATTLE_AXE)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.WAR_HAMMER_MOLD), Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.NETHERITE_WAR_HAMMER)
                .criterion(hasItem(ModItems.WAR_HAMMER_MOLD), conditionsFromItem(ModItems.WAR_HAMMER_MOLD))
                .criterion(hasItem(Items.NETHERITE_AXE), conditionsFromItem(Items.NETHERITE_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.NETHERITE_WAR_HAMMER)));



        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DAGGER_MOLD), Ingredient.ofItems(Items.DIAMOND_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_DAGGER)
                .criterion(hasItem(ModItems.DAGGER_MOLD), conditionsFromItem(ModItems.DAGGER_MOLD))
                .criterion(hasItem(Items.DIAMOND_SWORD), conditionsFromItem(Items.DIAMOND_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_DAGGER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.RAPIER_MOLD), Ingredient.ofItems(Items.DIAMOND_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_RAPIER)
                .criterion(hasItem(ModItems.RAPIER_MOLD), conditionsFromItem(ModItems.RAPIER_MOLD))
                .criterion(hasItem(Items.DIAMOND_SWORD), conditionsFromItem(Items.DIAMOND_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_RAPIER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LONGSWORD_MOLD), Ingredient.ofItems(Items.DIAMOND_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_LONGSWORD)
                .criterion(hasItem(ModItems.LONGSWORD_MOLD), conditionsFromItem(ModItems.LONGSWORD_MOLD))
                .criterion(hasItem(Items.DIAMOND_SWORD), conditionsFromItem(Items.DIAMOND_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_LONGSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BROADSWORD_MOLD), Ingredient.ofItems(Items.DIAMOND_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_BROADSWORD)
                .criterion(hasItem(ModItems.BROADSWORD_MOLD), conditionsFromItem(ModItems.BROADSWORD_MOLD))
                .criterion(hasItem(Items.DIAMOND_SWORD), conditionsFromItem(Items.DIAMOND_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_BROADSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.SPEAR_MOLD), Ingredient.ofItems(Items.DIAMOND_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_SPEAR)
                .criterion(hasItem(ModItems.SPEAR_MOLD), conditionsFromItem(ModItems.SPEAR_MOLD))
                .criterion(hasItem(Items.DIAMOND_SWORD), conditionsFromItem(Items.DIAMOND_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_SPEAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.MORNING_STAR_MOLD), Ingredient.ofItems(Items.DIAMOND_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_MORNING_STAR)
                .criterion(hasItem(ModItems.MORNING_STAR_MOLD), conditionsFromItem(ModItems.MORNING_STAR_MOLD))
                .criterion(hasItem(Items.DIAMOND_AXE), conditionsFromItem(Items.DIAMOND_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_MORNING_STAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BATTLE_AXE_MOLD), Ingredient.ofItems(Items.DIAMOND_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_BATTLE_AXE)
                .criterion(hasItem(ModItems.BATTLE_AXE_MOLD), conditionsFromItem(ModItems.BATTLE_AXE_MOLD))
                .criterion(hasItem(Items.DIAMOND_AXE), conditionsFromItem(Items.DIAMOND_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_BATTLE_AXE)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.WAR_HAMMER_MOLD), Ingredient.ofItems(Items.DIAMOND_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.DIAMOND_WAR_HAMMER)
                .criterion(hasItem(ModItems.WAR_HAMMER_MOLD), conditionsFromItem(ModItems.WAR_HAMMER_MOLD))
                .criterion(hasItem(Items.DIAMOND_AXE), conditionsFromItem(Items.DIAMOND_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DIAMOND_WAR_HAMMER)));



        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DAGGER_MOLD), Ingredient.ofItems(Items.GOLDEN_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_DAGGER)
                .criterion(hasItem(ModItems.DAGGER_MOLD), conditionsFromItem(ModItems.DAGGER_MOLD))
                .criterion(hasItem(Items.GOLDEN_SWORD), conditionsFromItem(Items.GOLDEN_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_DAGGER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.RAPIER_MOLD), Ingredient.ofItems(Items.GOLDEN_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_RAPIER)
                .criterion(hasItem(ModItems.RAPIER_MOLD), conditionsFromItem(ModItems.RAPIER_MOLD))
                .criterion(hasItem(Items.GOLDEN_SWORD), conditionsFromItem(Items.GOLDEN_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_RAPIER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LONGSWORD_MOLD), Ingredient.ofItems(Items.GOLDEN_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_LONGSWORD)
                .criterion(hasItem(ModItems.LONGSWORD_MOLD), conditionsFromItem(ModItems.LONGSWORD_MOLD))
                .criterion(hasItem(Items.GOLDEN_SWORD), conditionsFromItem(Items.GOLDEN_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_LONGSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BROADSWORD_MOLD), Ingredient.ofItems(Items.GOLDEN_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_BROADSWORD)
                .criterion(hasItem(ModItems.BROADSWORD_MOLD), conditionsFromItem(ModItems.BROADSWORD_MOLD))
                .criterion(hasItem(Items.GOLDEN_SWORD), conditionsFromItem(Items.GOLDEN_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BROADSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.SPEAR_MOLD), Ingredient.ofItems(Items.GOLDEN_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_SPEAR)
                .criterion(hasItem(ModItems.SPEAR_MOLD), conditionsFromItem(ModItems.SPEAR_MOLD))
                .criterion(hasItem(Items.GOLDEN_SWORD), conditionsFromItem(Items.GOLDEN_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_SPEAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.MORNING_STAR_MOLD), Ingredient.ofItems(Items.GOLDEN_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_MORNING_STAR)
                .criterion(hasItem(ModItems.MORNING_STAR_MOLD), conditionsFromItem(ModItems.MORNING_STAR_MOLD))
                .criterion(hasItem(Items.GOLDEN_AXE), conditionsFromItem(Items.GOLDEN_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_MORNING_STAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BATTLE_AXE_MOLD), Ingredient.ofItems(Items.GOLDEN_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_BATTLE_AXE)
                .criterion(hasItem(ModItems.BATTLE_AXE_MOLD), conditionsFromItem(ModItems.BATTLE_AXE_MOLD))
                .criterion(hasItem(Items.GOLDEN_AXE), conditionsFromItem(Items.GOLDEN_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BATTLE_AXE)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.WAR_HAMMER_MOLD), Ingredient.ofItems(Items.GOLDEN_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.GOLDEN_WAR_HAMMER)
                .criterion(hasItem(ModItems.WAR_HAMMER_MOLD), conditionsFromItem(ModItems.WAR_HAMMER_MOLD))
                .criterion(hasItem(Items.GOLDEN_AXE), conditionsFromItem(Items.GOLDEN_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_WAR_HAMMER)));



        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DAGGER_MOLD), Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_DAGGER)
                .criterion(hasItem(ModItems.DAGGER_MOLD), conditionsFromItem(ModItems.DAGGER_MOLD))
                .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_DAGGER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.RAPIER_MOLD), Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_RAPIER)
                .criterion(hasItem(ModItems.RAPIER_MOLD), conditionsFromItem(ModItems.RAPIER_MOLD))
                .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_RAPIER)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.LONGSWORD_MOLD), Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_LONGSWORD)
                .criterion(hasItem(ModItems.LONGSWORD_MOLD), conditionsFromItem(ModItems.LONGSWORD_MOLD))
                .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_LONGSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BROADSWORD_MOLD), Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_BROADSWORD)
                .criterion(hasItem(ModItems.BROADSWORD_MOLD), conditionsFromItem(ModItems.BROADSWORD_MOLD))
                .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_BROADSWORD)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.SPEAR_MOLD), Ingredient.ofItems(Items.IRON_SWORD),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_SPEAR)
                .criterion(hasItem(ModItems.SPEAR_MOLD), conditionsFromItem(ModItems.SPEAR_MOLD))
                .criterion(hasItem(Items.IRON_SWORD), conditionsFromItem(Items.IRON_SWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_SPEAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.MORNING_STAR_MOLD), Ingredient.ofItems(Items.IRON_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_MORNING_STAR)
                .criterion(hasItem(ModItems.MORNING_STAR_MOLD), conditionsFromItem(ModItems.MORNING_STAR_MOLD))
                .criterion(hasItem(Items.IRON_AXE), conditionsFromItem(Items.IRON_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_MORNING_STAR)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.BATTLE_AXE_MOLD), Ingredient.ofItems(Items.IRON_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_BATTLE_AXE)
                .criterion(hasItem(ModItems.BATTLE_AXE_MOLD), conditionsFromItem(ModItems.BATTLE_AXE_MOLD))
                .criterion(hasItem(Items.IRON_AXE), conditionsFromItem(Items.IRON_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_BATTLE_AXE)));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.WAR_HAMMER_MOLD), Ingredient.ofItems(Items.IRON_AXE),
                        Ingredient.ofItems(ModItems.SMITHING_HAMMER), RecipeCategory.COMBAT, ModItems.IRON_WAR_HAMMER)
                .criterion(hasItem(ModItems.WAR_HAMMER_MOLD), conditionsFromItem(ModItems.WAR_HAMMER_MOLD))
                .criterion(hasItem(Items.IRON_AXE), conditionsFromItem(Items.IRON_AXE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.IRON_WAR_HAMMER)));
    }
}

