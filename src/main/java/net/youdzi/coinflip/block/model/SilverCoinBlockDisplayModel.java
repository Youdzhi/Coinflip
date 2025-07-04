package net.youdzi.coinflip.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.block.display.SilverCoinBlockDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class SilverCoinBlockDisplayModel extends GeoModel<SilverCoinBlockDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SilverCoinBlockDisplayItem animatable) {
		return new ResourceLocation("coinflip", "animations/coinblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverCoinBlockDisplayItem animatable) {
		return new ResourceLocation("coinflip", "geo/coinblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverCoinBlockDisplayItem entity) {
		return new ResourceLocation("coinflip", "textures/block/silver_coin.png");
	}
}
