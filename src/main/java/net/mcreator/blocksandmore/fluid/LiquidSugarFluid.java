package net.mcreator.blocksandmore.fluid;

import org.apache.logging.log4j.core.util.Source;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.LiquidBlock;
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
import net.minecraft.resources.Identifier;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.block.FluidModel;

import net.mcreator.blocksandmore.init.BlocksAndMoreModItems;
import net.mcreator.blocksandmore.init.BlocksAndMoreModFluids;
import net.mcreator.blocksandmore.init.BlocksAndMoreModBlocks;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderingRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.Optional;

public abstract class LiquidSugarFluid extends FlowingFluid {
	private static final FluidVariantAttributeHandler PROPERTIES = new FluidVariantAttributeHandler() {
	};

	private LiquidSugarFluid() {
		super();
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
	protected boolean canConvertToSource(ServerLevel level) {
		return false;
	}

	@Override
	protected int getSlopeFindDistance(LevelReader level) {
		return 4;
	}

	@Override
	protected int getDropOff(LevelReader level) {
		return 1;
	}

	@Override
	public Item getBucket() {
		return BlocksAndMoreModItems.LIQUID_SUGAR_BUCKET;
	}

	@Override
	protected boolean canBeReplacedWith(FluidState state, BlockGetter level, BlockPos pos, Fluid fluid, Direction direction) {
		return direction == Direction.DOWN && !isSame(fluid);
	}

	@Override
	public int getTickDelay(LevelReader level) {
		return 5;
	}

	@Override
	protected float getExplosionResistance() {
		return 100f;
	}

	@Override
	protected BlockState createLegacyBlock(FluidState state) {
		return BlocksAndMoreModBlocks.LIQUID_SUGAR.defaultBlockState().setValue(LiquidBlock.LEVEL, getLegacyLevel(state));
	}

	@Override
	public boolean isSame(Fluid fluid) {
		return fluid == getSource() || fluid == getFlowing();
	}

	@Override
	public Optional<SoundEvent> getPickupSound() {
		return Optional.of(SoundEvents.BUCKET_FILL);
	}

	@Override
	protected void entityInside(Level level, BlockPos pos, Entity entity, InsideBlockEffectApplier effectApplier) {
		effectApplier.apply(InsideBlockEffectType.EXTINGUISH);
	}

	@Override
	protected void beforeDestroyingBlock(LevelAccessor world, BlockPos pos, BlockState blockstate) {
		BlockEntity blockEntity = blockstate.hasBlockEntity() ? world.getBlockEntity(pos) : null;
		Block.dropResources(blockstate, world, pos, blockEntity);
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

	public static void load() {
		FluidVariantAttributes.register(BlocksAndMoreModFluids.LIQUID_SUGAR, PROPERTIES);
		FluidVariantAttributes.register(BlocksAndMoreModFluids.FLOWING_LIQUID_SUGAR, PROPERTIES);
	}

	@Environment(EnvType.CLIENT)
	public static void clientLoad() {
		FluidRenderingRegistry.register(BlocksAndMoreModFluids.LIQUID_SUGAR, BlocksAndMoreModFluids.FLOWING_LIQUID_SUGAR,
				new FluidModel.Unbaked(new Material(Identifier.parse("minecraft:block/white_concrete")), new Material(Identifier.parse("minecraft:block/white_concrete")), null, null));
	}
}