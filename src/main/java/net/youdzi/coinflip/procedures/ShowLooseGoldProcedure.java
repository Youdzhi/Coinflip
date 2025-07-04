package net.youdzi.coinflip.procedures;

import net.youdzi.coinflip.network.CoinflipModVariables;
import net.youdzi.coinflip.init.CoinflipModItems;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ShowLooseGoldProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (world.isClientSide()) {
		    LocalPlayer player = Minecraft.getInstance().player;
		    if (player != null && player.getCapability(CoinflipModVariables.PLAYER_VARIABLES_CAPABILITY, null)
		        .orElse(new CoinflipModVariables.PlayerVariables()).showcoin == 5) {
		        
		        Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(CoinflipModItems.GOLD_COIN.get()));
		    }
		}
	}
}
