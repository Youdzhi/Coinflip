package net.youdzi.coinflip.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.youdzi.coinflip.block.model.GoldCoinBlockDisplayModel;
import net.youdzi.coinflip.block.display.GoldCoinBlockDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class GoldCoinBlockDisplayItemRenderer extends GeoItemRenderer<GoldCoinBlockDisplayItem> {
	public GoldCoinBlockDisplayItemRenderer() {
		super(new GoldCoinBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(GoldCoinBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
