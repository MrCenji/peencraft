
package net.mcreator.peencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.peencraft.entity.KillerMouseEntity;

public class KillerMouseRenderer extends MobRenderer<KillerMouseEntity, SilverfishModel<KillerMouseEntity>> {
	public KillerMouseRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(KillerMouseEntity entity) {
		return new ResourceLocation("peencraft:textures/mice_for_biome_project_2_0.png");
	}
}
