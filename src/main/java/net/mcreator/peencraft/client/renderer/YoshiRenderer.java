
package net.mcreator.peencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.peencraft.entity.YoshiEntity;

public class YoshiRenderer extends MobRenderer<YoshiEntity, ChickenModel<YoshiEntity>> {
	public YoshiRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.7000000000000001f);
	}

	@Override
	public ResourceLocation getTextureLocation(YoshiEntity entity) {
		return new ResourceLocation("peencraft:textures/yosi.png");
	}
}
