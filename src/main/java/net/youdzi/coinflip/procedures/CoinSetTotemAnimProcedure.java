package net.youdzi.coinflip.procedures;

import net.youdzi.coinflip.network.CoinflipModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class CoinSetTotemAnimProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = DoubleArgumentType.getDouble(arguments, "num");
			entity.getCapability(CoinflipModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.showcoin = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
