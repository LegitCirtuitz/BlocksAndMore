package net.mcreator.buildy.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class RedConcreteWallBlock extends WallBlock {
	public RedConcreteWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.8f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false).forceSolidOn());
	}
}