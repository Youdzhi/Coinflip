package net.youdzi.coinflip.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.youdzi.coinflip.block.model.SilverCoinBlockDisplayModel;
import net.youdzi.coinflip.block.display.SilverCoinBlockDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class SilverCoinBlockDisplayItemRenderer extends GeoItemRenderer<SilverCoinBlockDisplayItem> {
	public SilverCoinBlockDisplayItemRenderer() {
		super(new SilverCoinBlockDisplayModel());
	}

	@Override
	public RenderType getRenderType(SilverCoinBlockDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
