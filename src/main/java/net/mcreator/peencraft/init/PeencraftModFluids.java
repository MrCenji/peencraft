
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.peencraft.fluid.GooFluid;
import net.mcreator.peencraft.fluid.CumFluid;
import net.mcreator.peencraft.PeencraftMod;

public class PeencraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, PeencraftMod.MODID);
	public static final RegistryObject<Fluid> GOO = REGISTRY.register("goo", () -> new GooFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_GOO = REGISTRY.register("flowing_goo", () -> new GooFluid.Flowing());
	public static final RegistryObject<Fluid> CUM = REGISTRY.register("cum", () -> new CumFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CUM = REGISTRY.register("flowing_cum", () -> new CumFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(GOO.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GOO.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CUM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CUM.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
