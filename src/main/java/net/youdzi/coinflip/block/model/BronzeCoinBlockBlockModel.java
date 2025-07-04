package net.youdzi.coinflip.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.block.entity.BronzeCoinBlockTileEntity;

import net.minecraft.resources.ResourceLocation;

public class BronzeCoinBlockBlockModel extends GeoModel<BronzeCoinBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BronzeCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "animations/coinblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BronzeCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "geo/coinblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BronzeCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "textures/block/bronze_coin.png");
	}
}
