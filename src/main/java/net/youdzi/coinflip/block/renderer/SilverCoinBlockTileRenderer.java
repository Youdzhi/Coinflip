package net.youdzi.coinflip.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.youdzi.coinflip.block.model.SilverCoinBlockBlockModel;
import net.youdzi.coinflip.block.entity.SilverCoinBlockTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class SilverCoinBlockTileRenderer extends GeoBlockRenderer<SilverCoinBlockTileEntity> {
	public SilverCoinBlockTileRenderer() {
		super(new SilverCoinBlockBlockModel());
	}

	@Override
	public RenderType getRenderType(SilverCoinBlockTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
