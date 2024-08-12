package net.cr.chivalry.item;

import net.cr.chivalry.Chivalry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHIVALRY = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Chivalry.MOD_ID, "rapier_stone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chivalry"))
                    .icon(() -> new ItemStack(ModItems.NETHERITE_RAPIER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DAGGER_MOLD);
                        entries.add(ModItems.RAPIER_MOLD);
                        entries.add(ModItems.LONGSWORD_MOLD);
                        entries.add(ModItems.BROADSWORD_MOLD);
                        entries.add(ModItems.SPEAR_MOLD);
                        entries.add(ModItems.MORNING_STAR_MOLD);
                        entries.add(ModItems.BATTLE_AXE_MOLD);
                        entries.add(ModItems.WAR_HAMMER_MOLD);

                        entries.add(ModItems.SMITHING_HAMMER);

                        entries.add(ModItems.DAGGER_BLUEPRINT);
                        entries.add(ModItems.RAPIER_BLUEPRINT);
                        entries.add(ModItems.LONGSWORD_BLUEPRINT);
                        entries.add(ModItems.BROADSWORD_BLUEPRINT);
                        entries.add(ModItems.SPEAR_BLUEPRINT);
                        entries.add(ModItems.MORNING_STAR_BLUEPRINT);
                        entries.add(ModItems.BATTLE_AXE_BLUEPRINT);
                        entries.add(ModItems.WAR_HAMMER_BLUEPRINT);

                        entries.add(ModItems.CARPENTERS_CHISEL);

                        entries.add(ModItems.NETHERITE_DAGGER);
                        entries.add(ModItems.NETHERITE_RAPIER);
                        entries.add(ModItems.NETHERITE_LONGSWORD);
                        entries.add(ModItems.NETHERITE_BROADSWORD);
                        entries.add(ModItems.NETHERITE_SPEAR);
                        entries.add(ModItems.NETHERITE_MORNING_STAR);
                        entries.add(ModItems.NETHERITE_BATTLE_AXE);
                        entries.add(ModItems.NETHERITE_WAR_HAMMER);

                        entries.add(ModItems.DIAMOND_DAGGER);
                        entries.add(ModItems.DIAMOND_RAPIER);
                        entries.add(ModItems.DIAMOND_LONGSWORD);
                        entries.add(ModItems.DIAMOND_BROADSWORD);
                        entries.add(ModItems.DIAMOND_SPEAR);
                        entries.add(ModItems.DIAMOND_MORNING_STAR);
                        entries.add(ModItems.DIAMOND_BATTLE_AXE);
                        entries.add(ModItems.DIAMOND_WAR_HAMMER);

                        entries.add(ModItems.GOLDEN_DAGGER);
                        entries.add(ModItems.GOLDEN_RAPIER);
                        entries.add(ModItems.GOLDEN_LONGSWORD);
                        entries.add(ModItems.GOLDEN_BROADSWORD);
                        entries.add(ModItems.GOLDEN_SPEAR);
                        entries.add(ModItems.GOLDEN_MORNING_STAR);
                        entries.add(ModItems.GOLDEN_BATTLE_AXE);
                        entries.add(ModItems.GOLDEN_WAR_HAMMER);

                        entries.add(ModItems.IRON_DAGGER);
                        entries.add(ModItems.IRON_RAPIER);
                        entries.add(ModItems.IRON_LONGSWORD);
                        entries.add(ModItems.IRON_BROADSWORD);
                        entries.add(ModItems.IRON_SPEAR);
                        entries.add(ModItems.IRON_MORNING_STAR);
                        entries.add(ModItems.IRON_BATTLE_AXE);
                        entries.add(ModItems.IRON_WAR_HAMMER);

                        entries.add(ModItems.WOODEN_DAGGER);
                        entries.add(ModItems.WOODEN_RAPIER);
                        entries.add(ModItems.WOODEN_LONGSWORD);
                        entries.add(ModItems.WOODEN_BROADSWORD);
                        entries.add(ModItems.WOODEN_SPEAR);
                        entries.add(ModItems.WOODEN_MORNING_STAR);
                        entries.add(ModItems.WOODEN_BATTLE_AXE);
                        entries.add(ModItems.WOODEN_WAR_HAMMER);



                    }).build());



    public static void registerItemGroups() {
        Chivalry.LOGGER.info("Registering Item Groups for " + Chivalry.MOD_ID);
    }
}
