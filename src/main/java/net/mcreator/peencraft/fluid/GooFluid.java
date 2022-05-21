
package net.mcreator.peencraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.peencraft.init.PeencraftModItems;
import net.mcreator.peencraft.init.PeencraftModFluids;
import net.mcreator.peencraft.init.PeencraftModBlocks;

public abstract class GooFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(PeencraftModFluids.GOO,
			PeencraftModFluids.FLOWING_GOO,
			FluidAttributes.builder(new ResourceLocation("peencraft:blocks/still"), new ResourceLocation("peencraft:blocks/moving")).luminosity(5)

					.viscosity(2000)

	).explosionResistance(100f)

			.tickRate(3)

			.bucket(PeencraftModItems.GOO_BUCKET).block(() -> (LiquidBlock) PeencraftModBlocks.GOO.get());

	private GooFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.5);
	}

	public static class Source extends GooFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GooFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
