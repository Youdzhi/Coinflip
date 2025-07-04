package net.youdzi.coinflip.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.block.display.GoldCoinBlockDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class GoldCoinBlockDisplayModel extends GeoModel<GoldCoinBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldCoinBlockDisplayItem animatable) {
		return new ResourceLocation("coinflip", "animations/coinblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldCoinBlockDisplayItem animatable) {
		return new ResourceLocation("coinflip", "geo/coinblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldCoinBlockDisplayItem entity) {
		return new ResourceLocation("coinflip", "textures/block/gold_coin.png");
	}
}
