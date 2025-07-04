package net.youdzi.coinflip.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.item.RevertedSilverCoinItem;

import net.minecraft.resources.ResourceLocation;

public class RevertedSilverCoinItemModel extends GeoModel<RevertedSilverCoinItem> {
	@Override
	public ResourceLocation getAnimationResource(RevertedSilverCoinItem animatable) {
		return new ResourceLocation("coinflip", "animations/coin_reverted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RevertedSilverCoinItem animatable) {
		return new ResourceLocation("coinflip", "geo/coin_reverted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RevertedSilverCoinItem animatable) {
		return new ResourceLocation("coinflip", "textures/item/silver_coin.png");
	}
}
