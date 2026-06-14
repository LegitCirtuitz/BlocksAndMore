package net.mcreator.blocksandmore.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.blocksandmore.init.BlocksAndMoreModFluids;

public class LiquidSugarItem extends BucketItem {
	public LiquidSugarItem(Item.Properties properties) {
		super(BlocksAndMoreModFluids.LIQUID_SUGAR, properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}