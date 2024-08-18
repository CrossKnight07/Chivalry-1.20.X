package net.cr.chivalry.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.cr.chivalry.item.custom.NoSweepingItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PlayerEntity.class)
public class NoSweepAttackMixin {

	// instanceof checks cannot be redirected, so we return
	// an item which will always return false instead
	@WrapOperation(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;getStackInHand(Lnet/minecraft/util/Hand;)Lnet/minecraft/item/ItemStack;"))
	private ItemStack init(PlayerEntity instance, Hand hand, Operation<ItemStack> original) {
		ItemStack stack = original.call(instance, hand);
		if (stack.getItem() instanceof NoSweepingItem) {
			return Items.ALLIUM.getDefaultStack();
		}
		return stack;
	}

}