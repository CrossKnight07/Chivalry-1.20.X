package net.cr.chivalry.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.cr.chivalry.item.custom.RapierItem;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

public class RapierMixin {
    @Mixin(LivingEntity.class)
    public static class LivingEntityMixin {

        @WrapOperation(method = "applyArmorToDamage(Lnet/minecraft/entity/damage/DamageSource;F)F", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/damage/DamageSource;isIn(Lnet/minecraft/registry/tag/TagKey;)Z"))
        public boolean negateArmorIfRapier(DamageSource instance, TagKey<DamageType> tag, Operation<Boolean> original) {
            if (instance.getAttacker() instanceof ServerPlayerEntity player) {
                if (player.getStackInHand(Hand.MAIN_HAND).getItem()  instanceof RapierItem) {
                    return false;
                }
            }
            return original.call(instance, tag);
        }
    }
}
