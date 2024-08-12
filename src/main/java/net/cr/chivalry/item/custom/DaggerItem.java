package net.cr.chivalry.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class DaggerItem extends SwordItem {

    public DaggerItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        ItemStack itemStack = user.getStackInHand(hand);
        user.getItemCooldownManager().set(this, 10);
        DaggerItem.setItem(itemStack);

        if (user.isOnGround()) {
            user.addVelocity(user.getRotationVector().multiply(1.5F));
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

    private static void setItem(ItemStack itemStack) {
    }

}


