
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.youdzi.coinflip.init;

import net.youdzi.coinflip.CoinflipMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class CoinflipModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoinflipMod.MODID);
	public static final RegistryObject<CreativeModeTab> COIN_FLIPPER = REGISTRY.register("coin_flipper",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.coinflip.coin_flipper")).icon(() -> new ItemStack(CoinflipModItems.BRONZE_COIN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CoinflipModItems.BRONZE_COIN.get());
				tabData.accept(CoinflipModItems.SILVER_COIN.get());
				tabData.accept(CoinflipModItems.GOLD_COIN.get());
			})

					.build());
}
