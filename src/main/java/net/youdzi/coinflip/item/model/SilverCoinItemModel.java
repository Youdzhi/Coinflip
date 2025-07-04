package net.youdzi.coinflip.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.item.SilverCoinItem;

import net.minecraft.resources.ResourceLocation;

public class SilverCoinItemModel extends GeoModel<SilverCoinItem> {
	@Override
	public ResourceLocation getAnimationResource(SilverCoinItem animatable) {
		return new ResourceLocation("coinflip", "animations/coin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverCoinItem animatable) {
		return new ResourceLocation("coinflip", "geo/coin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverCoinItem animatable) {
		return new ResourceLocation("coinflip", "textures/item/silver_coin.png");
	}
}
