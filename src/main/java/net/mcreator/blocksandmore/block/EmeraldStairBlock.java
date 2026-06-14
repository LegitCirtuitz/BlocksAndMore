package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

import net.mcreator.blocksandmore.init.BlocksAndMoreModBlocks;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class EmeraldStairBlock extends StairBlock {
	public EmeraldStairBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(5f, 50f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayer() {
		BlockRenderLayerMap.putBlock(BlocksAndMoreModBlocks.EMERALD_STAIR, ChunkSectionLayer.CUTOUT);
	}

	@Override
	public float getExplosionResistance() {
		return 50f;
	}
}