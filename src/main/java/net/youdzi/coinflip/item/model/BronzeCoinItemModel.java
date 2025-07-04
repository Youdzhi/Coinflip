package net.youdzi.coinflip.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.item.BronzeCoinItem;

import net.minecraft.resources.ResourceLocation;

public class BronzeCoinItemModel extends GeoModel<BronzeCoinItem> {
	@Override
	public ResourceLocation getAnimationResource(BronzeCoinItem animatable) {
		return new ResourceLocation("coinflip", "animations/coin.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BronzeCoinItem animatable) {
		return new ResourceLocation("coinflip", "geo/coin.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BronzeCoinItem animatable) {
		return new ResourceLocation("coinflip", "textures/item/bronze_coin.png");
	}
}
