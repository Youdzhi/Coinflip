package net.youdzi.coinflip.item.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.youdzi.coinflip.item.model.BronzeCoinItemModel;
import net.youdzi.coinflip.item.BronzeCoinItem;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import java.util.Set;
import java.util.HashSet;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class BronzeCoinItemRenderer extends GeoItemRenderer<BronzeCoinItem> {
	public BronzeCoinItemRenderer() {
		super(new BronzeCoinItemModel());
	}

	@Override
	public RenderType getRenderType(BronzeCoinItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	private static final float SCALE_RECIPROCAL = 1.0f / 16.0f;
	protected boolean renderArms = false;
	protected MultiBufferSource currentBuffer;
	protected RenderType renderType;
	public ItemDisplayContext transformType;
	protected BronzeCoinItem animatable;
	private final Set<String> hiddenBones = new HashSet<>();
	private final Set<String> suppressedBones = new HashSet<>();

	@Override
	public void renderByItem(ItemStack stack, ItemDisplayContext transformType, PoseStack matrixStack, MultiBufferSource bufferIn, int combinedLightIn, int p_239207_6_) {
		this.transformType = transformType;
		super.renderByItem(stack, transformType, matrixStack, bufferIn, combinedLightIn, p_239207_6_);
	}

	@Override
	public void actuallyRender(PoseStack matrixStackIn, BronzeCoinItem animatable, BakedGeoModel model, RenderType type, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, boolean isRenderer, float partialTicks, int packedLightIn,
			int packedOverlayIn, float red, float green, float blue, float alpha) {
		this.currentBuffer = renderTypeBuffer;
		this.renderType = type;
		this.animatable = animatable;
		super.actuallyRender(matrixStackIn, animatable, model, type, renderTypeBuffer, vertexBuilder, isRenderer, partialTicks, packedLightIn, packedOverlayIn, red, green, blue, alpha);
		if (this.renderArms) {
			this.renderArms = false;
		}
	}

	@Override
	public ResourceLocation getTextureLocation(BronzeCoinItem instance) {
		return super.getTextureLocation(instance);
	}
}
