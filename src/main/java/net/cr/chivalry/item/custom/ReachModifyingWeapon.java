package net.cr.chivalry.item.custom;

import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

import java.util.UUID;

public class ReachModifyingWeapon extends SwordItem {
    public static EntityAttributeModifier ATTACK_RANGE_MODIFIER;

    public ReachModifyingWeapon(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings, float reachModifier) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        ATTACK_RANGE_MODIFIER = new EntityAttributeModifier(UUID.fromString("76d4bee5-967a-4b21-871f-bfbe7cf5559e"), "Attack range modifier", reachModifier, EntityAttributeModifier.Operation.ADDITION);
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        Multimap<EntityAttribute, EntityAttributeModifier> map = LinkedHashMultimap.create(super.getAttributeModifiers(slot));
        if (slot == EquipmentSlot.MAINHAND) {
            map.put(ReachEntityAttributes.ATTACK_RANGE, ATTACK_RANGE_MODIFIER);
            map.put(ReachEntityAttributes.REACH, ATTACK_RANGE_MODIFIER);
        }

        return map;
    }
}
