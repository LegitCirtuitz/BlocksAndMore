/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildy.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.buildy.BuildyMod;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;

public class BuildyModTabs {
	public static ResourceKey<CreativeModeTab> TAB_BLOCKS_AND_STUFF_1 = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(BuildyMod.MODID, "blocks_and_stuff_1"));
	public static ResourceKey<CreativeModeTab> TAB_BUILDY_STAIRS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(BuildyMod.MODID, "buildy_stairs"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_BLOCKS_AND_STUFF_1,
				CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.buildy.blocks_and_stuff_1")).icon(() -> new ItemStack(BuildyModBlocks.GOLD_STAIRS)).displayItems((parameters, tabData) -> {
					tabData.accept(BuildyModBlocks.BEACON_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.IRON_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.GOLD_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.COAL_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.EMERALD_STAIR.asItem());
					tabData.accept(BuildyModBlocks.DIAMOND_STAIR.asItem());
					tabData.accept(BuildyModBlocks.EMERALD_ORE_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.DEEPSLATE_DIAMOND_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.OAK_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.AMETHYST_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.DIAMOND_ORE_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.DARK_OAK_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.IRON_ORE_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.REDSTONE_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.REDSTONE_ORE_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.SPRUCE_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.ACACIA_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.BIRCH_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.JUNGLE_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.MANGROVE_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.CHERRY_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.PALE_OAK_LOG_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.CRIMSON_STEM_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.WARPED_STEM_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.BEACON_SLAB.asItem());
					tabData.accept(BuildyModBlocks.SANDSTONE_SLAB.asItem());
					tabData.accept(BuildyModBlocks.RED_SANDSTONE_SLAB.asItem());
					tabData.accept(BuildyModItems.AMETHYST_BLADE);
					tabData.accept(BuildyModBlocks.RED_CONCRETE_WALL.asItem());
					tabData.accept(BuildyModBlocks.ORANGE_CONCRETE_WALL.asItem());
					tabData.accept(BuildyModBlocks.RED_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.ORANGE_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.GREEN_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.LIME_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.WHITE_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.GRAY_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.LIGHT_GRAY_TERRACOTTA.asItem());
					tabData.accept(BuildyModBlocks.MAGENTA_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.BROWN_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.BLUE_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.CYAN_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.PURPLE_TERRACOTTA_STAIRS.asItem());
				}).build());
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_BUILDY_STAIRS,
				CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0).title(Component.translatable("item_group.buildy.buildy_stairs")).icon(() -> new ItemStack(BuildyModBlocks.IRON_STAIRS)).displayItems((parameters, tabData) -> {
					tabData.accept(BuildyModBlocks.LIME_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.WHITE_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.GRAY_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.LIGHT_GRAY_TERRACOTTA.asItem());
					tabData.accept(BuildyModBlocks.MAGENTA_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.BROWN_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.BLUE_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.CYAN_TERRACOTTA_STAIRS.asItem());
					tabData.accept(BuildyModBlocks.PURPLE_TERRACOTTA_STAIRS.asItem());
				}).build());
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(tabData -> {
			tabData.accept(BuildyModItems.AMETHYST_BLADE);
		});
		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(tabData -> {
			tabData.accept(BuildyModItems.AMETHYST_BLADE);
		});
	}
}