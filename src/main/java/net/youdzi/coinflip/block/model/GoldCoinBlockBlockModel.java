package net.youdzi.coinflip.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.block.entity.GoldCoinBlockTileEntity;

import net.minecraft.resources.ResourceLocation;

public class GoldCoinBlockBlockModel extends GeoModel<GoldCoinBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(GoldCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "animations/coinblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GoldCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "geo/coinblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GoldCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "textures/block/gold_coin.png");
	}
}
