package net.youdzi.coinflip.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.item.RevertedBronzeCoinItem;

import net.minecraft.resources.ResourceLocation;

public class RevertedBronzeCoinItemModel extends GeoModel<RevertedBronzeCoinItem> {
	@Override
	public ResourceLocation getAnimationResource(RevertedBronzeCoinItem animatable) {
		return new ResourceLocation("coinflip", "animations/coin_reverted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RevertedBronzeCoinItem animatable) {
		return new ResourceLocation("coinflip", "geo/coin_reverted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RevertedBronzeCoinItem animatable) {
		return new ResourceLocation("coinflip", "textures/item/bronze_coin.png");
	}
}
