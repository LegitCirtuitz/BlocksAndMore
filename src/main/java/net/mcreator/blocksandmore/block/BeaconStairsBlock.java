package net.mcreator.blocksandmore.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class BeaconStairsBlock extends StairBlock {
	public BeaconStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.GRAVEL).strength(5f, 20f));
	}

	@Override
	public float getExplosionResistance() {
		return 20f;
	}
}