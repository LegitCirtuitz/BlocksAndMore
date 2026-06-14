package net.mcreator.blocksandmore.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.InsideBlockEffectType;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

import net.mcreator.blocksandmore.init.BlocksAndMoreModItems;
import net.mcreator.blocksandmore.init.BlocksAndMoreModFluids;
import net.mcreator.blocksandmore.init.BlocksAndMoreModBlocks;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.Optional;

public abstract class LiquidSugarFluid extends FlowingFluid {
	@Environment(EnvType.CLIENT)
	public static final FluidVariantAttributeHandler fluidAttributes = new FluidVariantAttributeHandler() {
		@Override
		public Optional<SoundEvent> getFillSound(FluidVariant variant) {
			return Optional.of(SoundEvents.BUCKET_FILL);
		}

		@Override
		public Optional<SoundEvent> getEmptySound(FluidVariant variant) {
			return Optional.of(SoundEvents.BUCKET_EMPTY);
		}
	};

	@Override
	protected void entityInside(Level level, BlockPos blockPos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier) {
		insideBlockEffectApplier.apply(InsideBlockEffectType.EXTINGUISH);
	}

	private LiquidSugarFluid() {
		super();
	}

	@Override
	protected boolean canConvertToSource(ServerLevel level) {
		return false;
	}

	@Override
	protected void beforeDestroyingBlock(LevelAccessor level, BlockPos pos, BlockState state) {
		BlockEntity blockEntity = state.hasBlockEntity() ? level.getBlockEntity(pos) : null;
		Block.dropResources(state, level, pos, blockEntity);
	}

	@Override
	protected boolean canBeReplacedWith(FluidState state, BlockGetter level, BlockPos pos, Fluid fluid, Direction direction) {
		return direction == Direction.DOWN && !isSame(fluid);
	}

	@Override
	public Fluid getFlowing() {
		return BlocksAndMoreModFluids.FLOWING_LIQUID_SUGAR;
	}

	@Override
	public Fluid getSource() {
		return BlocksAndMoreModFluids.LIQUID_SUGAR;
	}

	@Override
	public float getExplosionResistance() {
		return 100f;
	}

	@Override
	public int getTickDelay(LevelReader level) {
		return 5;
	}

	@Override
	protected int getDropOff(LevelReader level) {
		return 1;
	}

	@Override
	protected int getSlopeFindDistance(LevelReader level) {
		return 4;
	}

	@Override
	public Item getBucket() {
		return BlocksAndMoreModItems.LIQUID_SUGAR_BUCKET;
	}

	@Override
	protected BlockState createLegacyBlock(FluidState state) {
		if (BlocksAndMoreModBlocks.LIQUID_SUGAR != null)
			return ((LiquidBlock) BlocksAndMoreModBlocks.LIQUID_SUGAR).defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
		return Blocks.AIR.defaultBlockState();
	}

	@Override
	public boolean isSame(Fluid fluid) {
		return fluid == getSource() || fluid == getFlowing();
	}

	@Override
	public Optional<SoundEvent> getPickupSound() {
		return Optional.ofNullable(SoundEvents.BUCKET_FILL);
	}

	public static class Source extends LiquidSugarFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidSugarFluid {
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

	@Environment(EnvType.CLIENT)
	public static void clientLoad() {
		FluidVariantAttributes.register(BlocksAndMoreModFluids.LIQUID_SUGAR, fluidAttributes);
		FluidVariantAttributes.register(BlocksAndMoreModFluids.FLOWING_LIQUID_SUGAR, fluidAttributes);
		FluidRenderHandlerRegistry.INSTANCE.register(BlocksAndMoreModFluids.LIQUID_SUGAR, BlocksAndMoreModFluids.FLOWING_LIQUID_SUGAR,
				new SimpleFluidRenderHandler(ResourceLocation.parse("minecraft:block/white_concrete"), ResourceLocation.parse("minecraft:block/white_concrete")));
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayer() {
		BlockRenderLayerMap.putFluids(ChunkSectionLayer.TRANSLUCENT, BlocksAndMoreModFluids.LIQUID_SUGAR, BlocksAndMoreModFluids.FLOWING_LIQUID_SUGAR);
	}
}