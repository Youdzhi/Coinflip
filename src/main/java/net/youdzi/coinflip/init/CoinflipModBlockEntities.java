
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.youdzi.coinflip.init;

import net.youdzi.coinflip.block.entity.SilverCoinBlockTileEntity;
import net.youdzi.coinflip.block.entity.GoldCoinBlockTileEntity;
import net.youdzi.coinflip.block.entity.BronzeCoinBlockTileEntity;
import net.youdzi.coinflip.CoinflipMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class CoinflipModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CoinflipMod.MODID);
	public static final RegistryObject<BlockEntityType<BronzeCoinBlockTileEntity>> BRONZE_COIN_BLOCK = REGISTRY.register("bronze_coin_block",
			() -> BlockEntityType.Builder.of(BronzeCoinBlockTileEntity::new, CoinflipModBlocks.BRONZE_COIN_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<SilverCoinBlockTileEntity>> SILVER_COIN_BLOCK = REGISTRY.register("silver_coin_block",
			() -> BlockEntityType.Builder.of(SilverCoinBlockTileEntity::new, CoinflipModBlocks.SILVER_COIN_BLOCK.get()).build(null));
	public static final RegistryObject<BlockEntityType<GoldCoinBlockTileEntity>> GOLD_COIN_BLOCK = REGISTRY.register("gold_coin_block",
			() -> BlockEntityType.Builder.of(GoldCoinBlockTileEntity::new, CoinflipModBlocks.GOLD_COIN_BLOCK.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
