package net.mcreator.blocksandmore.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

public class AmethystBladeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 100, 7f, 0, 2, TagKey.create(Registries.ITEM, Identifier.parse("blocks_and_more:amethyst_blade_repair_items")));

	public AmethystBladeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6.5f, -2.8f));
	}
}