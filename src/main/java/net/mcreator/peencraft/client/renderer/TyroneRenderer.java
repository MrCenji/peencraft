
package net.mcreator.peencraft.client.renderer;

public class TyroneRenderer extends MobRenderer<TyroneEntity, VillagerModel<TyroneEntity>> {

	public TyroneRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.6f);

	}

	@Override
	public ResourceLocation getTextureLocation(TyroneEntity entity) {
		return new ResourceLocation("peencraft:textures/black_villager.png");
	}

}
