package net.cr.chivalry.item.custom;

import net.minecraft.item.ToolMaterial;

public class SpearItem extends ReachModifyingWeapon implements NoSweepingItem {
    public SpearItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings, 3);
    }
}
