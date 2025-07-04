package net.youdzi.coinflip.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.youdzi.coinflip.block.entity.SilverCoinBlockTileEntity;

import net.minecraft.resources.ResourceLocation;

public class SilverCoinBlockBlockModel extends GeoModel<SilverCoinBlockTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SilverCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "animations/coinblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SilverCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "geo/coinblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SilverCoinBlockTileEntity animatable) {
		return new ResourceLocation("coinflip", "textures/block/silver_coin.png");
	}
}
