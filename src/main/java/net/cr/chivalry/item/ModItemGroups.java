package net.cr.chivalry.item;

import net.cr.chivalry.Chivalry;
import net.cr.chivalry.block.ModBlocks;
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
                    .icon(() -> new ItemStack(ModItems.RAPIER_STONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DAGGER_STONE);
                        entries.add(ModItems.RAPIER_STONE);
                        entries.add(ModItems.LONGSWORD_STONE);
                        entries.add(ModItems.BROADSWORD_STONE);
                        entries.add(ModItems.SPEAR_STONE);
                        entries.add(ModItems.MORNING_STAR_STONE);
                        entries.add(ModItems.BATTLE_AXE_STONE);
                        entries.add(ModItems.WAR_HAMMER_STONE);

                        entries.add(ModItems.NETHERITE_DAGGER);
                        entries.add(ModItems.NETHERITE_RAPIER);
                        entries.add(ModItems.NETHERITE_LONGSWORD);
                        entries.add(ModItems.NETHERITE_BROADSWORD);
                        entries.add(ModItems.NETHERITE_SPEAR);
                        entries.add(ModItems.NETHERITE_MORNING_STAR);
                        entries.add(ModItems.NETHERITE_BATTLE_AXE);
                        entries.add(ModItems.NETHERITE_WAR_HAMMER);

                        entries.add(ModItems.SMITHING_HAMMER);
                        entries.add(ModItems.IRON_PLATING);
                        entries.add(ModItems.LINKED_CHAINMAIL_MESH);
                        entries.add(ModItems.CREEPER_COOKIE);

                        entries.add(ModBlocks.STURDY_SPRUCE_LOG);
                        entries.add(ModBlocks.SOUND_BLOCK);

                    }).build());



    public static void registerItemGroups() {
        Chivalry.LOGGER.info("Registering Item Groups for " + Chivalry.MOD_ID);
    }
}
