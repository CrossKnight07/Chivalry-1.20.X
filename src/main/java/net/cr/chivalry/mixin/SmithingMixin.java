package net.cr.chivalry.mixin;

import net.minecraft.item.ItemStack;
import net.minecraft.screen.SmithingScreenHandler;
import net.minecraft.screen.slot.Slot;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

public class SmithingMixin {
    @Mixin(SmithingScreenHandler.class)
    public static class SmithingScreenHandlerMixin {
        @Redirect(method = "onTakeOutput", at = @At(value = "INVOKE", target = "Lnet/minecraft/screen/SmithingScreenHandler;decrementStack(I)V", ordinal = 2))
        private void customRecipeRemainder(SmithingScreenHandler instance, int slotIndex) {
            Slot slot = ((SmithingScreenHandler) (Object) this).getSlot(slotIndex);
            ItemStack stackInSlot = ((Slot) slot).getStack();

            stackInSlot.setDamage(stackInSlot.getDamage() + 1);
            if (stackInSlot.getDamage() >= stackInSlot.getMaxDamage()) {
                stackInSlot.decrement(1);
                stackInSlot.setDamage(0);
            }
        }
    }
}
