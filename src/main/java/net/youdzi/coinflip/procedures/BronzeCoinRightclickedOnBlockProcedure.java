package net.youdzi.coinflip.procedures;

import net.youdzi.coinflip.init.CoinflipModItems;
import net.youdzi.coinflip.init.CoinflipModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class BronzeCoinRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(CoinflipModItems.BRONZE_COIN.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(BlockPos.containing(x, y + 1, z), CoinflipModBlocks.BRONZE_COIN_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
