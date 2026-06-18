package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

import net.mcreator.blocksandmore.init.BlocksAndMoreModBlocks;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class OrangeConcreteSlabBlock extends SlabBlock {
	public OrangeConcreteSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Environment(EnvType.CLIENT)
	public static void registerRenderLayer() {
		BlockRenderLayerMap.putBlock(BlocksAndMoreModBlocks.ORANGE_CONCRETE_SLAB, ChunkSectionLayer.CUTOUT);
	}
}