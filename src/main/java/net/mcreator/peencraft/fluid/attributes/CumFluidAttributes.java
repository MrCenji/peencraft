
package net.mcreator.peencraft.fluid.attributes;

public class CumFluidAttributes extends FluidAttributes {

	public static CustomBuilder builder(ResourceLocation stillTexture, ResourceLocation flowingTexture) {
		return new CustomBuilder(stillTexture, flowingTexture, CumFluidAttributes::new);
	}

	public static class CustomBuilder extends FluidAttributes.Builder {
		protected CustomBuilder(ResourceLocation stillTexture, ResourceLocation flowingTexture,
				BiFunction<FluidAttributes.Builder, Fluid, FluidAttributes> factory) {
			super(stillTexture, flowingTexture, factory);
		}
	}

	protected CumFluidAttributes(Builder builder, Fluid fluid) {
		super(builder, fluid);
	}

	@Override
	public int getColor(BlockAndTintGetter world, BlockPos pos) {
		return Minecraft.getInstance().level.getBiome(pos).value().getFogColor() | 0xFF000000;
	}

}