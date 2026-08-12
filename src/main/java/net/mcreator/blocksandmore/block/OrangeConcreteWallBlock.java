package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class OrangeConcreteWallBlock extends WallBlock {
	public OrangeConcreteWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.8f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}