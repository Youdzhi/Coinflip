package net.youdzi.coinflip.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.item.GoldCoinItem;

import net.minecraft.resources.ResourceLocation;

public class GoldCoinItemModel extends GeoModel<GoldCoinItem> {
	@Override
	public ResourceLocation getAnimationResource(GoldCoinItem animatable) {
		return new ResourceLocation("coinflip", "animations/coin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldCoinItem animatable) {
		return new ResourceLocation("coinflip", "geo/coin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldCoinItem animatable) {
		return new ResourceLocation("coinflip", "textures/item/gold_coin.png");
	}
}
