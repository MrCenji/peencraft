
package net.mcreator.peencraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.peencraft.entity.XplosivechikenEntity;

public class XplosivechikenRenderer extends MobRenderer<XplosivechikenEntity, ChickenModel<XplosivechikenEntity>> {
	public XplosivechikenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(XplosivechikenEntity entity) {
		return new ResourceLocation("peencraft:textures/xplosivechikn.png");
	}
}
