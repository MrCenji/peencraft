
package net.mcreator.peencraft.client.renderer;

public class XplosivechikenRenderer extends MobRenderer<XplosivechikenEntity, ChickenModel<XplosivechikenEntity>> {

	public XplosivechikenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(XplosivechikenEntity entity) {
		return new ResourceLocation("peencraft:textures/xplosivechikn.png");
	}

}
