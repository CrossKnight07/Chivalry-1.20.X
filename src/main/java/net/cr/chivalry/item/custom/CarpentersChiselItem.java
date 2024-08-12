package net.cr.chivalry.item.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CarpentersChiselItem extends AxeItem {

    public CarpentersChiselItem(ToolMaterial toolMaterial, int attackDamage, float miningSpeed, Settings settings) {
        super(toolMaterial, attackDamage, miningSpeed, settings);
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

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.chivalry.carpenters_chisel.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);
    }

}
