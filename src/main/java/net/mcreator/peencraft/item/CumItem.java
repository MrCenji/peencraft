
package net.mcreator.peencraft.item;

import net.minecraft.network.chat.Component;

public class CumItem extends BucketItem {

	public CumItem() {
		super(PeencraftModFluids.CUM,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_FOOD));
	}

}
