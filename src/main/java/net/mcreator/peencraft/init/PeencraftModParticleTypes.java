
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.peencraft.PeencraftMod;

public class PeencraftModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, PeencraftMod.MODID);
	public static final RegistryObject<ParticleType<?>> OBSIDIAN_TREE_BIOME_PARTICLES = REGISTRY.register("obsidian_tree_biome_particles",
			() -> new SimpleParticleType(false));
}
