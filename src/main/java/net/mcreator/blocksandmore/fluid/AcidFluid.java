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
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
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

public abstract class AcidFluid extends FlowingFluid {
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

	private AcidFluid() {
		super();
	}

	@Override
	protected boolean canConvertToSource(ServerLevel level) {
		return true;
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
		return BlocksAndMoreModFluids.FLOWING_ACID;
	}

	@Override
	public Fluid getSource() {
		return BlocksAndMoreModFluids.ACID;
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
		return BlocksAndMoreModItems.ACID_BUCKET;
	}

	@Override
	protected BlockState createLegacyBlock(FluidState state) {
		if (BlocksAndMoreModBlocks.ACID != null)
			return ((LiquidBlock) BlocksAndMoreModBlocks.ACID).defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
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

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ASH;
	}

	public static class Source extends AcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
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
		FluidVariantAttributes.register(BlocksAndMoreModFluids.ACID, fluidAttributes);
		FluidVariantAttributes.register(BlocksAndMoreModFluids.FLOWING_ACID, fluidAttributes);
		FluidRenderHandlerRegistry.INSTANCE.register(BlocksAndMoreModFluids.ACID, BlocksAndMoreModFluids.FLOWING_ACID,
				new SimpleFluidRenderHandler(ResourceLocation.parse("blocks_and_more:block/screenshot_2026-06-10_073036"), ResourceLocation.parse("blocks_and_more:block/screenshot_2026-06-10_072951")));
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayer() {
		BlockRenderLayerMap.putFluids(ChunkSectionLayer.TRANSLUCENT, BlocksAndMoreModFluids.ACID, BlocksAndMoreModFluids.FLOWING_ACID);
	}
}