package net.mcreator.buildy.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class GrayTerracottaStairsBlock extends StairBlock {
	public GrayTerracottaStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1.25f, 4.2f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 4.2f;
	}
}