package net.cr.chivalry.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RapierItem extends SwordItem {

    public RapierItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (attacker instanceof PlayerEntity playerAttacker) {
            target.damage(target.getWorld().getDamageSources().playerAttack(playerAttacker), 5.0f);
        }
        return super.postHit(stack, target, attacker);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 10);
        RapierItem.setItem(itemStack);

        if (user.isOnGround()) {
            user.setVelocity(user.applyMovementInput(new Vec3d(user.sidewaysSpeed, user.upwardSpeed, user.forwardSpeed), 0.5F).multiply(3.5F));
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

    private static void setItem(ItemStack itemStack) {
    }

}


