
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.youdzi.coinflip.init;

import net.youdzi.coinflip.block.SilverCoinBlockBlock;
import net.youdzi.coinflip.block.GoldCoinBlockBlock;
import net.youdzi.coinflip.block.BronzeCoinBlockBlock;
import net.youdzi.coinflip.CoinflipMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class CoinflipModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CoinflipMod.MODID);
	public static final RegistryObject<Block> BRONZE_COIN_BLOCK = REGISTRY.register("bronze_coin_block", () -> new BronzeCoinBlockBlock());
	public static final RegistryObject<Block> SILVER_COIN_BLOCK = REGISTRY.register("silver_coin_block", () -> new SilverCoinBlockBlock());
	public static final RegistryObject<Block> GOLD_COIN_BLOCK = REGISTRY.register("gold_coin_block", () -> new GoldCoinBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
