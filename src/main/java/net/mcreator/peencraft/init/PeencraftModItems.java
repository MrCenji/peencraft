
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.peencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.peencraft.item.WoodArmorItem;
import net.mcreator.peencraft.PeencraftMod;

public class PeencraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PeencraftMod.MODID);
	public static final RegistryObject<Item> FAKEDIAMOND = block(PeencraftModBlocks.FAKEDIAMOND, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> WOOD_ARMOR_HELMET = REGISTRY.register("wood_armor_helmet", () -> new WoodArmorItem.Helmet());
	public static final RegistryObject<Item> WOOD_ARMOR_CHESTPLATE = REGISTRY.register("wood_armor_chestplate", () -> new WoodArmorItem.Chestplate());
	public static final RegistryObject<Item> WOOD_ARMOR_LEGGINGS = REGISTRY.register("wood_armor_leggings", () -> new WoodArmorItem.Leggings());
	public static final RegistryObject<Item> WOOD_ARMOR_BOOTS = REGISTRY.register("wood_armor_boots", () -> new WoodArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}