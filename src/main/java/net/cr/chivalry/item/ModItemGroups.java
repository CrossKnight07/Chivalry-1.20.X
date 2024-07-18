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
                        entries.add(ModItems.RAPIER_STONE);
                        entries.add(ModItems.MORNING_STAR_STONE);
                        entries.add(ModItems.LINKED_CHAINMAIL_MESH);

                        entries.add(ModBlocks.STURDY_SPRUCE_LOG);

                    }).build());



    public static void registerItemGroups() {
        Chivalry.LOGGER.info("Registering Item Groups for " + Chivalry.MOD_ID);
    }
}
