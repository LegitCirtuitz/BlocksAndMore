package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class AmethystStairsBlock extends StairBlock {
	public AmethystStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(2f, 10f));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}