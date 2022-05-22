
package net.mcreator.peencraft.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CumBlock extends LiquidBlock {
	public CumBlock() {
		super(() -> (FlowingFluid) PeencraftModFluids.CUM.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

				.lightLevel(s -> 15));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

}