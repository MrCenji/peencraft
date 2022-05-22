
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.peencraft.entity.XplosivechikenEntity;
import net.mcreator.peencraft.entity.VilligaEntity;
import net.mcreator.peencraft.entity.TyroneEntity;
import net.mcreator.peencraft.entity.KillerMouseEntity;
import net.mcreator.peencraft.PeencraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PeencraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PeencraftMod.MODID);
	public static final RegistryObject<EntityType<XplosivechikenEntity>> XPLOSIVECHIKEN = register("xplosivechiken",
			EntityType.Builder.<XplosivechikenEntity>of(XplosivechikenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(200).setUpdateInterval(3).setCustomClientFactory(XplosivechikenEntity::new).fireImmune().sized(0.4f, 0.7f));
	public static final RegistryObject<EntityType<TyroneEntity>> TYRONE = register("tyrone",
			EntityType.Builder.<TyroneEntity>of(TyroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128)
					.setUpdateInterval(3).setCustomClientFactory(TyroneEntity::new)

					.sized(0.7f, 2.25f));
	public static final RegistryObject<EntityType<KillerMouseEntity>> KILLER_MOUSE = register("killer_mouse",
			EntityType.Builder.<KillerMouseEntity>of(KillerMouseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KillerMouseEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<VilligaEntity>> VILLIGA = register("villiga",
			EntityType.Builder.<VilligaEntity>of(VilligaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(50)
					.setUpdateInterval(3).setCustomClientFactory(VilligaEntity::new)

					.sized(0.6f, 1.95f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			XplosivechikenEntity.init();
			TyroneEntity.init();
			KillerMouseEntity.init();
			VilligaEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(XPLOSIVECHIKEN.get(), XplosivechikenEntity.createAttributes().build());
		event.put(TYRONE.get(), TyroneEntity.createAttributes().build());
		event.put(KILLER_MOUSE.get(), KillerMouseEntity.createAttributes().build());
		event.put(VILLIGA.get(), VilligaEntity.createAttributes().build());
	}
}
