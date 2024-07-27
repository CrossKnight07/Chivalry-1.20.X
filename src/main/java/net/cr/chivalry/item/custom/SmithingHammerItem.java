package net.cr.chivalry.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SmithingHammerItem extends Item {
    public SmithingHammerItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack newStack = stack.copy();
        newStack.setDamage(newStack.getDamage() + 1);
        if (newStack.getDamage() >= newStack.getMaxDamage()) {
            newStack.decrement(1);
            newStack.setDamage(0);
        }
        return newStack;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return true;
    }

}
