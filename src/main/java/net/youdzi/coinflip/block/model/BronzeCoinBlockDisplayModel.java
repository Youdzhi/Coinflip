package net.youdzi.coinflip.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.block.display.BronzeCoinBlockDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class BronzeCoinBlockDisplayModel extends GeoModel<BronzeCoinBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BronzeCoinBlockDisplayItem animatable) {
		return new ResourceLocation("coinflip", "animations/coinblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BronzeCoinBlockDisplayItem animatable) {
		return new ResourceLocation("coinflip", "geo/coinblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BronzeCoinBlockDisplayItem entity) {
		return new ResourceLocation("coinflip", "textures/block/bronze_coin.png");
	}
}
