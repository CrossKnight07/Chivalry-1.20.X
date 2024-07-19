package net.cr.chivalry.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CREEPER_COOKIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f).alwaysEdible().snack().build();
}
