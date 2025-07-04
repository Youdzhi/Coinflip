
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.youdzi.coinflip.init;

import net.youdzi.coinflip.item.SilverCoinItem;
import net.youdzi.coinflip.item.RevertedSilverCoinItem;
import net.youdzi.coinflip.item.RevertedGoldCoinItem;
import net.youdzi.coinflip.item.RevertedBronzeCoinItem;
import net.youdzi.coinflip.item.GoldCoinItem;
import net.youdzi.coinflip.item.BronzeCoinItem;
import net.youdzi.coinflip.block.display.SilverCoinBlockDisplayItem;
import net.youdzi.coinflip.block.display.GoldCoinBlockDisplayItem;
import net.youdzi.coinflip.block.display.BronzeCoinBlockDisplayItem;
import net.youdzi.coinflip.CoinflipMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class CoinflipModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CoinflipMod.MODID);
	public static final RegistryObject<Item> BRONZE_COIN = REGISTRY.register("bronze_coin", () -> new BronzeCoinItem());
	public static final RegistryObject<Item> BRONZE_COIN_BLOCK = REGISTRY.register(CoinflipModBlocks.BRONZE_COIN_BLOCK.getId().getPath(), () -> new BronzeCoinBlockDisplayItem(CoinflipModBlocks.BRONZE_COIN_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SILVER_COIN_BLOCK = REGISTRY.register(CoinflipModBlocks.SILVER_COIN_BLOCK.getId().getPath(), () -> new SilverCoinBlockDisplayItem(CoinflipModBlocks.SILVER_COIN_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOLD_COIN_BLOCK = REGISTRY.register(CoinflipModBlocks.GOLD_COIN_BLOCK.getId().getPath(), () -> new GoldCoinBlockDisplayItem(CoinflipModBlocks.GOLD_COIN_BLOCK.get(), new Item.Properties()));
	public static final RegistryObject<Item> SILVER_COIN = REGISTRY.register("silver_coin", () -> new SilverCoinItem());
	public static final RegistryObject<Item> GOLD_COIN = REGISTRY.register("gold_coin", () -> new GoldCoinItem());
	public static final RegistryObject<Item> REVERTED_BRONZE_COIN = REGISTRY.register("reverted_bronze_coin", () -> new RevertedBronzeCoinItem());
	public static final RegistryObject<Item> REVERTED_GOLD_COIN = REGISTRY.register("reverted_gold_coin", () -> new RevertedGoldCoinItem());
	public static final RegistryObject<Item> REVERTED_SILVER_COIN = REGISTRY.register("reverted_silver_coin", () -> new RevertedSilverCoinItem());
	// Start of user code block custom items
	// End of user code block custom items
}
