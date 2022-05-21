
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peencraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.peencraft.client.renderer.XplosivechikenRenderer;
import net.mcreator.peencraft.client.renderer.TyroneRenderer;
import net.mcreator.peencraft.client.renderer.KillerMouseRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PeencraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PeencraftModEntities.XPLOSIVECHIKEN.get(), XplosivechikenRenderer::new);
		event.registerEntityRenderer(PeencraftModEntities.TYRONE.get(), TyroneRenderer::new);
		event.registerEntityRenderer(PeencraftModEntities.KILLER_MOUSE.get(), KillerMouseRenderer::new);
	}
}
