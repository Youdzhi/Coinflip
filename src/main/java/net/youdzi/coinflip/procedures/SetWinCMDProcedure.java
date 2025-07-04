package net.youdzi.coinflip.procedures;

import net.youdzi.coinflip.network.CoinflipModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class SetWinCMDProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		{
			boolean _setval = BoolArgumentType.getBool(arguments, "win");
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(CoinflipModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.win = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
	}
}
