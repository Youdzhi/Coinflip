package net.youdzi.coinflip.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class CoinCMDProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "outcome")).equals("tails")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "name")) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "setloose @s true");
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else if ((StringArgumentType.getString(arguments, "outcome")).equals("heads")) {
			try {
				for (Entity entityiterator : EntityArgument.getEntities(arguments, "name")) {
					{
						Entity _ent = entityiterator;
						if (!_ent.level().isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "setloose @s false");
						}
					}
				}
			} catch (CommandSyntaxException e) {
				e.printStackTrace();
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Usage: /coin <Player> heads/tails"), false);
		}
	}
}
