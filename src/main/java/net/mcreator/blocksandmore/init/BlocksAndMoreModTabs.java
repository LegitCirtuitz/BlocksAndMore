/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocksandmore.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.blocksandmore.BlocksAndMoreMod;

public class BlocksAndMoreModTabs {
	public static ResourceKey<CreativeModeTab> TAB_BLOCKS_AND_STUFF_1 = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(BlocksAndMoreMod.MODID, "blocks_and_stuff_1"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_BLOCKS_AND_STUFF_1,
				CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.blocks_and_more.blocks_and_stuff_1")).icon(() -> new ItemStack(BlocksAndMoreModBlocks.GOLD_STAIRS)).displayItems((parameters, tabData) -> {
					tabData.accept(BlocksAndMoreModBlocks.RED_CONCRETE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BLOCK_OF_METAL.asItem());
					tabData.accept(BlocksAndMoreModBlocks.ORANGE_CONCRETE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.YELLOW_CONCRETE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BEACON_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.IRON_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModItems.LIQUID_SUGAR_BUCKET);
					tabData.accept(BlocksAndMoreModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.CYAN_CONCRETE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BLUE_CONCRETE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.GOLD_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.COAL_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.EMERALD_STAIR.asItem());
					tabData.accept(BlocksAndMoreModBlocks.DIAMOND_STAIR.asItem());
					tabData.accept(BlocksAndMoreModBlocks.WEMMBU_STAIR.asItem());
					tabData.accept(BlocksAndMoreModBlocks.EMERALD_ORE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.DEEPSLATE_DIAMOND_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.OAK_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.AMETHYST_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.DIAMOND_ORE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.DARK_OAK_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.IRON_ORE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.REDSTONE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.REDSTONE_ORE_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.SPRUCE_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.ACACIA_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BIRCH_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.JUNGLE_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.MANGROVE_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.CHERRY_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.PALE_OAK_LOG_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.CRIMSON_STEM_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.WARPED_STEM_STAIRS.asItem());
					tabData.accept(BlocksAndMoreModBlocks.ORANGE_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.RED_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.YELLOW_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.WHITE_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.LIGHT_BLUE_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.LIME_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.PINK_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.GRAY_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.LIGHT_GRAY_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BEACON_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.SANDSTONE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.RED_SANDSTONE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.CYAN_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.PURPLE_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BLUE_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BLACK_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.GREEN_CONCRETE_SLAB.asItem());
					tabData.accept(BlocksAndMoreModBlocks.BROWN_CONCRETE_SLAB.asItem());
				}).build());
	}
}