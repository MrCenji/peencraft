
package net.mcreator.peencraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.peencraft.init.PeencraftModFluids;

public class CumItem extends BucketItem {
	public CumItem() {
		super(PeencraftModFluids.CUM,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_FOOD));
	}
}
