package net.youdzi.coinflip.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.item.RevertedGoldCoinItem;

import net.minecraft.resources.ResourceLocation;

public class RevertedGoldCoinItemModel extends GeoModel<RevertedGoldCoinItem> {
	@Override
	public ResourceLocation getAnimationResource(RevertedGoldCoinItem animatable) {
		return new ResourceLocation("coinflip", "animations/coin_reverted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RevertedGoldCoinItem animatable) {
		return new ResourceLocation("coinflip", "geo/coin_reverted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RevertedGoldCoinItem animatable) {
		return new ResourceLocation("coinflip", "textures/item/gold_coin.png");
	}
}
