
package net.mcreator.peencraft.fluid;

public abstract class CumFluid extends ForgeFlowingFluid {

	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(PeencraftModFluids.CUM,
			PeencraftModFluids.FLOWING_CUM,
			CumFluidAttributes.builder(new ResourceLocation("peencraft:blocks/cum"), new ResourceLocation("peencraft:blocks/cum"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place"))).color(-4138753))
			.explosionResistance(100f).canMultiply().tickRate(1).levelDecreasePerBlock(2).slopeFindDistance(5).bucket(PeencraftModItems.CUM_BUCKET)
			.block(() -> (LiquidBlock) PeencraftModBlocks.CUM.get());

	private CumFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.SPIT;
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.5);
	}

	public static class Source extends CumFluid {
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

	public static class Flowing extends CumFluid {
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
