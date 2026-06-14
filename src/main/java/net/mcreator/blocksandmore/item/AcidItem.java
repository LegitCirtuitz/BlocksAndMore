package net.mcreator.blocksandmore.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.blocksandmore.init.BlocksAndMoreModFluids;

public class AcidItem extends BucketItem {
	public AcidItem(Item.Properties properties) {
		super(BlocksAndMoreModFluids.ACID, properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}