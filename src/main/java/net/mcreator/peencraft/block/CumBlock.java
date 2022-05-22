
package net.mcreator.peencraft.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.peencraft.init.PeencraftModFluids;

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
