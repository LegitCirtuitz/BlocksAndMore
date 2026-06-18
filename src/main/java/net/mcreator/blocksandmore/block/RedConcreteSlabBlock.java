package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class RedConcreteSlabBlock extends SlabBlock {
	public RedConcreteSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).requiresCorrectToolForDrops());
	}
}