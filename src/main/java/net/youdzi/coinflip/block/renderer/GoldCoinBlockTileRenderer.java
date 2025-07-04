package net.youdzi.coinflip.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.youdzi.coinflip.block.model.GoldCoinBlockBlockModel;
import net.youdzi.coinflip.block.entity.GoldCoinBlockTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class GoldCoinBlockTileRenderer extends GeoBlockRenderer<GoldCoinBlockTileEntity> {
	public GoldCoinBlockTileRenderer() {
		super(new GoldCoinBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(GoldCoinBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
