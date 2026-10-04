package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class WhiteTerracottaStairsBlock extends StairBlock {
	public WhiteTerracottaStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1.25f, 4.2f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 4.2f;
	}
}