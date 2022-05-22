
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.peencraft.block.ZachoreBlock;
import net.mcreator.peencraft.block.TestBlock;
import net.mcreator.peencraft.block.HentaiBlockBlock;
import net.mcreator.peencraft.block.GugugingaStoneBlock;
import net.mcreator.peencraft.block.GugugingaPortalBlock;
import net.mcreator.peencraft.block.GooBlock;
import net.mcreator.peencraft.PeencraftMod;

public class PeencraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PeencraftMod.MODID);
	public static final RegistryObject<Block> FAKEDIAMOND = REGISTRY.register("fakediamond", () -> new TestBlock());
	public static final RegistryObject<Block> ZACHORE = REGISTRY.register("zachore", () -> new ZachoreBlock());
	public static final RegistryObject<Block> GUGUGINGA_PORTAL = REGISTRY.register("guguginga_portal", () -> new GugugingaPortalBlock());
	public static final RegistryObject<Block> GUGUGINGA_STONE = REGISTRY.register("guguginga_stone", () -> new GugugingaStoneBlock());
	public static final RegistryObject<Block> GOO = REGISTRY.register("goo", () -> new GooBlock());
	public static final RegistryObject<Block> HENTAI_BLOCK = REGISTRY.register("hentai_block", () -> new HentaiBlockBlock());
}
