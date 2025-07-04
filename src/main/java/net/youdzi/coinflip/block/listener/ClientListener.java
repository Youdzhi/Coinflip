package net.youdzi.coinflip.block.listener;

import net.youdzi.coinflip.init.CoinflipModBlockEntities;
import net.youdzi.coinflip.block.renderer.SilverCoinBlockTileRenderer;
import net.youdzi.coinflip.block.renderer.GoldCoinBlockTileRenderer;
import net.youdzi.coinflip.block.renderer.BronzeCoinBlockTileRenderer;
import net.youdzi.coinflip.CoinflipMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = CoinflipMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(CoinflipModBlockEntities.BRONZE_COIN_BLOCK.get(), context -> new BronzeCoinBlockTileRenderer());
		event.registerBlockEntityRenderer(CoinflipModBlockEntities.SILVER_COIN_BLOCK.get(), context -> new SilverCoinBlockTileRenderer());
		event.registerBlockEntityRenderer(CoinflipModBlockEntities.GOLD_COIN_BLOCK.get(), context -> new GoldCoinBlockTileRenderer());
	}
}
