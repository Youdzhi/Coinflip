package net.youdzi.coinflip.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.youdzi.coinflip.block.model.BronzeCoinBlockBlockModel;
import net.youdzi.coinflip.block.entity.BronzeCoinBlockTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class BronzeCoinBlockTileRenderer extends GeoBlockRenderer<BronzeCoinBlockTileEntity> {
	public BronzeCoinBlockTileRenderer() {
		super(new BronzeCoinBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(BronzeCoinBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
