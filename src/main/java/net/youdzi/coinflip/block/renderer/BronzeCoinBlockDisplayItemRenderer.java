package net.youdzi.coinflip.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.youdzi.coinflip.block.model.BronzeCoinBlockDisplayModel;
import net.youdzi.coinflip.block.display.BronzeCoinBlockDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class BronzeCoinBlockDisplayItemRenderer extends GeoItemRenderer<BronzeCoinBlockDisplayItem> {
	public BronzeCoinBlockDisplayItemRenderer() {
		super(new BronzeCoinBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(BronzeCoinBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
