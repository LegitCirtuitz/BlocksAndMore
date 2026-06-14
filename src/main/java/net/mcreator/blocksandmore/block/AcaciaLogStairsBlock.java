package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class AcaciaLogStairsBlock extends StairBlock {
	public AcaciaLogStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.WOOD).strength(1f, 10f).replaceable());
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}