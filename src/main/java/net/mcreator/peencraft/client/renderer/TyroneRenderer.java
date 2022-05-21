
package net.mcreator.peencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.peencraft.entity.TyroneEntity;

public class TyroneRenderer extends MobRenderer<TyroneEntity, VillagerModel<TyroneEntity>> {
	public TyroneRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.6f);
	}

	@Override
	public ResourceLocation getTextureLocation(TyroneEntity entity) {
		return new ResourceLocation("peencraft:textures/black_villager.png");
	}
}
