/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocksandmore.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.blocksandmore.item.LiquidSugarItem;
import net.mcreator.blocksandmore.BlocksAndMoreMod;

import java.util.function.Function;

public class BlocksAndMoreModItems {
	public static Item RED_CONCRETE_STAIRS;
	public static Item BLOCK_OF_METAL;
	public static Item ORANGE_CONCRETE_STAIRS;
	public static Item YELLOW_CONCRETE_STAIRS;
	public static Item GREEN_CONCRETE_STAIRS;
	public static Item GRASS_STAIRS;
	public static Item BEACON_STAIRS;
	public static Item IRON_STAIRS;
	public static Item LIQUID_SUGAR_BUCKET;
	public static Item LIGHT_BLUE_CONCRETE_STAIRS;
	public static Item CYAN_CONCRETE_STAIRS;
	public static Item BLUE_CONCRETE_STAIRS;
	public static Item GOLD_STAIRS;
	public static Item COAL_STAIRS;
	public static Item EMERALD_STAIR;
	public static Item DIAMOND_STAIR;
	public static Item WEMMBU_STAIR;
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

	public static void load() {
		RED_CONCRETE_STAIRS = block(BlocksAndMoreModBlocks.RED_CONCRETE_STAIRS, "red_concrete_stairs");
		BLOCK_OF_METAL = block(BlocksAndMoreModBlocks.BLOCK_OF_METAL, "block_of_metal", new Item.Properties().fireResistant());
		ORANGE_CONCRETE_STAIRS = block(BlocksAndMoreModBlocks.ORANGE_CONCRETE_STAIRS, "orange_concrete_stairs");
		YELLOW_CONCRETE_STAIRS = block(BlocksAndMoreModBlocks.YELLOW_CONCRETE_STAIRS, "yellow_concrete_stairs");
		GREEN_CONCRETE_STAIRS = block(BlocksAndMoreModBlocks.GREEN_CONCRETE_STAIRS, "green_concrete_stairs");
		GRASS_STAIRS = block(BlocksAndMoreModBlocks.GRASS_STAIRS, "grass_stairs");
		BEACON_STAIRS = block(BlocksAndMoreModBlocks.BEACON_STAIRS, "beacon_stairs");
		IRON_STAIRS = block(BlocksAndMoreModBlocks.IRON_STAIRS, "iron_stairs");
		LIQUID_SUGAR_BUCKET = register("liquid_sugar_bucket", LiquidSugarItem::new);
		LIGHT_BLUE_CONCRETE_STAIRS = block(BlocksAndMoreModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, "light_blue_concrete_stairs");
		CYAN_CONCRETE_STAIRS = block(BlocksAndMoreModBlocks.CYAN_CONCRETE_STAIRS, "cyan_concrete_stairs");
		BLUE_CONCRETE_STAIRS = block(BlocksAndMoreModBlocks.BLUE_CONCRETE_STAIRS, "blue_concrete_stairs");
		GOLD_STAIRS = block(BlocksAndMoreModBlocks.GOLD_STAIRS, "gold_stairs");
		COAL_STAIRS = block(BlocksAndMoreModBlocks.COAL_STAIRS, "coal_stairs");
		EMERALD_STAIR = block(BlocksAndMoreModBlocks.EMERALD_STAIR, "emerald_stair");
		DIAMOND_STAIR = block(BlocksAndMoreModBlocks.DIAMOND_STAIR, "diamond_stair");
		WEMMBU_STAIR = block(BlocksAndMoreModBlocks.WEMMBU_STAIR, "wemmbu_stair");
		EMERALD_ORE_STAIRS = block(BlocksAndMoreModBlocks.EMERALD_ORE_STAIRS, "emerald_ore_stairs");
		DEEPSLATE_EMERALD_ORE_STAIRS = block(BlocksAndMoreModBlocks.DEEPSLATE_EMERALD_ORE_STAIRS, "deepslate_emerald_ore_stairs");
		DEEPSLATE_DIAMOND_STAIRS = block(BlocksAndMoreModBlocks.DEEPSLATE_DIAMOND_STAIRS, "deepslate_diamond_stairs");
		OAK_LOG_STAIRS = block(BlocksAndMoreModBlocks.OAK_LOG_STAIRS, "oak_log_stairs");
		AMETHYST_STAIRS = block(BlocksAndMoreModBlocks.AMETHYST_STAIRS, "amethyst_stairs");
		DIAMOND_ORE_STAIRS = block(BlocksAndMoreModBlocks.DIAMOND_ORE_STAIRS, "diamond_ore_stairs");
		DARK_OAK_LOG_STAIRS = block(BlocksAndMoreModBlocks.DARK_OAK_LOG_STAIRS, "dark_oak_log_stairs");
		IRON_ORE_STAIRS = block(BlocksAndMoreModBlocks.IRON_ORE_STAIRS, "iron_ore_stairs");
		REDSTONE_STAIRS = block(BlocksAndMoreModBlocks.REDSTONE_STAIRS, "redstone_stairs");
		REDSTONE_ORE_STAIRS = block(BlocksAndMoreModBlocks.REDSTONE_ORE_STAIRS, "redstone_ore_stairs");
		SPRUCE_LOG_STAIRS = block(BlocksAndMoreModBlocks.SPRUCE_LOG_STAIRS, "spruce_log_stairs");
		ACACIA_LOG_STAIRS = block(BlocksAndMoreModBlocks.ACACIA_LOG_STAIRS, "acacia_log_stairs");
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(BlocksAndMoreMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(BlocksAndMoreMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}