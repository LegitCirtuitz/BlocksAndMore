/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildy.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.buildy.item.AmethystBladeItem;
import net.mcreator.buildy.BuildyMod;

import java.util.function.Function;

public class BuildyModItems {
	public static Item BEACON_STAIRS;
	public static Item IRON_STAIRS;
	public static Item GOLD_STAIRS;
	public static Item COAL_STAIRS;
	public static Item EMERALD_STAIR;
	public static Item DIAMOND_STAIR;
	public static Item EMERALD_ORE_STAIRS;
	public static Item DEEPSLATE_EMERALD_ORE_STAIRS;
	public static Item DEEPSLATE_DIAMOND_STAIRS;
	public static Item OAK_LOG_STAIRS;
	public static Item AMETHYST_STAIRS;
	public static Item DIAMOND_ORE_STAIRS;
	public static Item DARK_OAK_LOG_STAIRS;
	public static Item IRON_ORE_STAIRS;
	public static Item REDSTONE_STAIRS;
	public static Item REDSTONE_ORE_STAIRS;
	public static Item SPRUCE_LOG_STAIRS;
	public static Item ACACIA_LOG_STAIRS;
	public static Item BIRCH_LOG_STAIRS;
	public static Item JUNGLE_LOG_STAIRS;
	public static Item MANGROVE_LOG_STAIRS;
	public static Item CHERRY_LOG_STAIRS;
	public static Item PALE_OAK_LOG_STAIRS;
	public static Item CRIMSON_STEM_STAIRS;
	public static Item WARPED_STEM_STAIRS;
	public static Item BEACON_SLAB;
	public static Item SANDSTONE_SLAB;
	public static Item RED_SANDSTONE_SLAB;
	public static Item AMETHYST_BLADE;
	public static Item RED_CONCRETE_WALL;
	public static Item ORANGE_CONCRETE_WALL;
	public static Item RED_TERRACOTTA_STAIRS;
	public static Item ORANGE_TERRACOTTA_STAIRS;
	public static Item YELLOW_TERRACOTTA_STAIRS;
	public static Item GREEN_TERRACOTTA_STAIRS;
	public static Item LIME_TERRACOTTA_STAIRS;
	public static Item BLACK_TERRACOTTA_STAIRS;
	public static Item WHITE_TERRACOTTA_STAIRS;
	public static Item GRAY_TERRACOTTA_STAIRS;
	public static Item LIGHT_GRAY_TERRACOTTA;
	public static Item PINK_TERRACOTTA_STAIRS;
	public static Item MAGENTA_TERRACOTTA_STAIRS;
	public static Item BROWN_TERRACOTTA_STAIRS;
	public static Item BLUE_TERRACOTTA_STAIRS;
	public static Item LIGHT_BLUE_TERRACOTTA_STAIRS;
	public static Item CYAN_TERRACOTTA_STAIRS;
	public static Item PURPLE_TERRACOTTA_STAIRS;

	public static void load() {
		BEACON_STAIRS = block(BuildyModBlocks.BEACON_STAIRS, "beacon_stairs");
		IRON_STAIRS = block(BuildyModBlocks.IRON_STAIRS, "iron_stairs");
		GOLD_STAIRS = block(BuildyModBlocks.GOLD_STAIRS, "gold_stairs");
		COAL_STAIRS = block(BuildyModBlocks.COAL_STAIRS, "coal_stairs");
		EMERALD_STAIR = block(BuildyModBlocks.EMERALD_STAIR, "emerald_stair");
		DIAMOND_STAIR = block(BuildyModBlocks.DIAMOND_STAIR, "diamond_stair");
		EMERALD_ORE_STAIRS = block(BuildyModBlocks.EMERALD_ORE_STAIRS, "emerald_ore_stairs");
		DEEPSLATE_EMERALD_ORE_STAIRS = block(BuildyModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS, "deepslate_emerald_ore_stairs");
		DEEPSLATE_DIAMOND_STAIRS = block(BuildyModBlocks.DEEPSLATE_DIAMOND_STAIRS, "deepslate_diamond_stairs");
		OAK_LOG_STAIRS = block(BuildyModBlocks.OAK_LOG_STAIRS, "oak_log_stairs");
		AMETHYST_STAIRS = block(BuildyModBlocks.AMETHYST_STAIRS, "amethyst_stairs");
		DIAMOND_ORE_STAIRS = block(BuildyModBlocks.DIAMOND_ORE_STAIRS, "diamond_ore_stairs");
		DARK_OAK_LOG_STAIRS = block(BuildyModBlocks.DARK_OAK_LOG_STAIRS, "dark_oak_log_stairs");
		IRON_ORE_STAIRS = block(BuildyModBlocks.IRON_ORE_STAIRS, "iron_ore_stairs");
		REDSTONE_STAIRS = block(BuildyModBlocks.REDSTONE_STAIRS, "redstone_stairs");
		REDSTONE_ORE_STAIRS = block(BuildyModBlocks.REDSTONE_ORE_STAIRS, "redstone_ore_stairs");
		SPRUCE_LOG_STAIRS = block(BuildyModBlocks.SPRUCE_LOG_STAIRS, "spruce_log_stairs");
		ACACIA_LOG_STAIRS = block(BuildyModBlocks.ACACIA_LOG_STAIRS, "acacia_log_stairs");
		BIRCH_LOG_STAIRS = block(BuildyModBlocks.BIRCH_LOG_STAIRS, "birch_log_stairs");
		JUNGLE_LOG_STAIRS = block(BuildyModBlocks.JUNGLE_LOG_STAIRS, "jungle_log_stairs");
		MANGROVE_LOG_STAIRS = block(BuildyModBlocks.MANGROVE_LOG_STAIRS, "mangrove_log_stairs");
		CHERRY_LOG_STAIRS = block(BuildyModBlocks.CHERRY_LOG_STAIRS, "cherry_log_stairs");
		PALE_OAK_LOG_STAIRS = block(BuildyModBlocks.PALE_OAK_LOG_STAIRS, "pale_oak_log_stairs");
		CRIMSON_STEM_STAIRS = block(BuildyModBlocks.CRIMSON_STEM_STAIRS, "crimson_stem_stairs");
		WARPED_STEM_STAIRS = block(BuildyModBlocks.WARPED_STEM_STAIRS, "warped_stem_stairs");
		BEACON_SLAB = block(BuildyModBlocks.BEACON_SLAB, "beacon_slab");
		SANDSTONE_SLAB = block(BuildyModBlocks.SANDSTONE_SLAB, "sandstone_slab");
		RED_SANDSTONE_SLAB = block(BuildyModBlocks.RED_SANDSTONE_SLAB, "red_sandstone_slab");
		AMETHYST_BLADE = register("amethyst_blade", AmethystBladeItem::new);
		RED_CONCRETE_WALL = block(BuildyModBlocks.RED_CONCRETE_WALL, "red_concrete_wall");
		ORANGE_CONCRETE_WALL = block(BuildyModBlocks.ORANGE_CONCRETE_WALL, "orange_concrete_wall");
		RED_TERRACOTTA_STAIRS = block(BuildyModBlocks.RED_TERRACOTTA_STAIRS, "red_terracotta_stairs");
		ORANGE_TERRACOTTA_STAIRS = block(BuildyModBlocks.ORANGE_TERRACOTTA_STAIRS, "orange_terracotta_stairs");
		YELLOW_TERRACOTTA_STAIRS = block(BuildyModBlocks.YELLOW_TERRACOTTA_STAIRS, "yellow_terracotta_stairs");
		GREEN_TERRACOTTA_STAIRS = block(BuildyModBlocks.GREEN_TERRACOTTA_STAIRS, "green_terracotta_stairs");
		LIME_TERRACOTTA_STAIRS = block(BuildyModBlocks.LIME_TERRACOTTA_STAIRS, "lime_terracotta_stairs");
		BLACK_TERRACOTTA_STAIRS = block(BuildyModBlocks.BLACK_TERRACOTTA_STAIRS, "black_terracotta_stairs");
		WHITE_TERRACOTTA_STAIRS = block(BuildyModBlocks.WHITE_TERRACOTTA_STAIRS, "white_terracotta_stairs");
		GRAY_TERRACOTTA_STAIRS = block(BuildyModBlocks.GRAY_TERRACOTTA_STAIRS, "gray_terracotta_stairs");
		LIGHT_GRAY_TERRACOTTA = block(BuildyModBlocks.LIGHT_GRAY_TERRACOTTA, "light_gray_terracotta");
		PINK_TERRACOTTA_STAIRS = block(BuildyModBlocks.PINK_TERRACOTTA_STAIRS, "pink_terracotta_stairs");
		MAGENTA_TERRACOTTA_STAIRS = block(BuildyModBlocks.MAGENTA_TERRACOTTA_STAIRS, "magenta_terracotta_stairs");
		BROWN_TERRACOTTA_STAIRS = block(BuildyModBlocks.BROWN_TERRACOTTA_STAIRS, "brown_terracotta_stairs");
		BLUE_TERRACOTTA_STAIRS = block(BuildyModBlocks.BLUE_TERRACOTTA_STAIRS, "blue_terracotta_stairs");
		LIGHT_BLUE_TERRACOTTA_STAIRS = block(BuildyModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, "light_blue_terracotta_stairs");
		CYAN_TERRACOTTA_STAIRS = block(BuildyModBlocks.CYAN_TERRACOTTA_STAIRS, "cyan_terracotta_stairs");
		PURPLE_TERRACOTTA_STAIRS = block(BuildyModBlocks.PURPLE_TERRACOTTA_STAIRS, "purple_terracotta_stairs");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BuildyMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(BuildyMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}