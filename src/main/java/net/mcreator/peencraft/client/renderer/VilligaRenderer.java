
package net.mcreator.peencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.peencraft.entity.VilligaEntity;

public class VilligaRenderer extends MobRenderer<VilligaEntity, VillagerModel<VilligaEntity>> {
	public VilligaRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VilligaEntity entity) {
		return new ResourceLocation("peencraft:textures/black_villager.png");
	}
}
