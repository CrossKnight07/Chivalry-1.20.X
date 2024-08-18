package net.cr.chivalry.mixin;

import net.cr.chivalry.item.custom.NoSweepingItem;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.SweepingEnchantment;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class NoSweepingEnchantMixin {

    @Inject(method = "isAcceptableItem", at = @At("HEAD"), cancellable = true)
    private void cancelSweepingEnchant(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        //noinspection ConstantValue
        if (
                stack.getItem() instanceof NoSweepingItem
                && (Object)this instanceof SweepingEnchantment
        ) {
            cir.setReturnValue(false);
        }
    }

}
