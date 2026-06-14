package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class OrangeConcreteStairsBlock extends StairBlock {
	public OrangeConcreteStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(3f, 10f));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}