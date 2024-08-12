package net.cr.chivalry.util;

import net.cr.chivalry.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.DAGGER_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.RAPIER_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.LONGSWORD_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.BROADSWORD_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.SPEAR_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.MORNING_STAR_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.BATTLE_AXE_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.WAR_HAMMER_MOLD, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModItems.SMITHING_HAMMER, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModItems.SMITHING_HAMMER, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 24),
                            new ItemStack(ModItems.SMITHING_HAMMER, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.DAGGER_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.RAPIER_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.LONGSWORD_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.BROADSWORD_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.SPEAR_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.MORNING_STAR_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.BATTLE_AXE_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.WAR_HAMMER_BLUEPRINT, 1), 5, 5, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(ModItems.CARPENTERS_CHISEL, 1), 5, 5, 0.05f));
                });
    }
}
