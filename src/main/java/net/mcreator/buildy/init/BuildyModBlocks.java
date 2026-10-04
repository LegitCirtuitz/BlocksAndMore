/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildy.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.buildy.block.*;
import net.mcreator.buildy.BuildyMod;

import java.util.function.Function;

public class BuildyModBlocks {
	public static Block BEACON_STAIRS;
	public static Block IRON_STAIRS;
	public static Block GOLD_STAIRS;
	public static Block COAL_STAIRS;
	public static Block EMERALD_STAIR;
	public static Block DIAMOND_STAIR;
	public static Block EMERALD_ORE_STAIRS;
	public static Block DEEPSLATE_EMERALD_ORE_STAIRS;
	public static Block DEEPSLATE_DIAMOND_STAIRS;
	public static Block OAK_LOG_STAIRS;
	public static Block AMETHYST_STAIRS;
	public static Block DIAMOND_ORE_STAIRS;
	public static Block DARK_OAK_LOG_STAIRS;
	public static Block IRON_ORE_STAIRS;
	public static Block REDSTONE_STAIRS;
	public static Block REDSTONE_ORE_STAIRS;
	public static Block SPRUCE_LOG_STAIRS;
	public static Block ACACIA_LOG_STAIRS;
	public static Block BIRCH_LOG_STAIRS;
	public static Block JUNGLE_LOG_STAIRS;
	public static Block MANGROVE_LOG_STAIRS;
	public static Block CHERRY_LOG_STAIRS;
	public static Block PALE_OAK_LOG_STAIRS;
	public static Block CRIMSON_STEM_STAIRS;
	public static Block WARPED_STEM_STAIRS;
	public static Block BEACON_SLAB;
	public static Block SANDSTONE_SLAB;
	public static Block RED_SANDSTONE_SLAB;
	public static Block RED_CONCRETE_WALL;
	public static Block ORANGE_CONCRETE_WALL;
	public static Block RED_TERRACOTTA_STAIRS;
	public static Block ORANGE_TERRACOTTA_STAIRS;
	public static Block YELLOW_TERRACOTTA_STAIRS;
	public static Block GREEN_TERRACOTTA_STAIRS;
	public static Block LIME_TERRACOTTA_STAIRS;
	public static Block BLACK_TERRACOTTA_STAIRS;
	public static Block WHITE_TERRACOTTA_STAIRS;
	public static Block GRAY_TERRACOTTA_STAIRS;
	public static Block LIGHT_GRAY_TERRACOTTA;
	public static Block PINK_TERRACOTTA_STAIRS;
	public static Block MAGENTA_TERRACOTTA_STAIRS;
	public static Block BROWN_TERRACOTTA_STAIRS;
	public static Block BLUE_TERRACOTTA_STAIRS;
	public static Block LIGHT_BLUE_TERRACOTTA_STAIRS;
	public static Block CYAN_TERRACOTTA_STAIRS;
	public static Block PURPLE_TERRACOTTA_STAIRS;

	public static void load() {
		BEACON_STAIRS = register("beacon_stairs", BeaconStairsBlock::new);
		IRON_STAIRS = register("iron_stairs", IronStairsBlock::new);
		GOLD_STAIRS = register("gold_stairs", GoldStairsBlock::new);
		COAL_STAIRS = register("coal_stairs", CoalStairsBlock::new);
		EMERALD_STAIR = register("emerald_stair", EmeraldStairBlock::new);
		DIAMOND_STAIR = register("diamond_stair", DiamondStairBlock::new);
		EMERALD_ORE_STAIRS = register("emerald_ore_stairs", EmeraldOreStairsBlock::new);
		DEEPSLATE_EMERALD_ORE_STAIRS = register("deepslate_emerald_ore_stairs", DeepslateEmeraldOreStairsBlock::new);
		DEEPSLATE_DIAMOND_STAIRS = register("deepslate_diamond_stairs", DeepslateDiamondStairsBlock::new);
		OAK_LOG_STAIRS = register("oak_log_stairs", OakLogStairsBlock::new);
		AMETHYST_STAIRS = register("amethyst_stairs", AmethystStairsBlock::new);
		DIAMOND_ORE_STAIRS = register("diamond_ore_stairs", DiamondOreStairsBlock::new);
		DARK_OAK_LOG_STAIRS = register("dark_oak_log_stairs", DarkOakLogStairsBlock::new);
		IRON_ORE_STAIRS = register("iron_ore_stairs", IronOreStairsBlock::new);
		REDSTONE_STAIRS = register("redstone_stairs", RedstoneStairsBlock::new);
		REDSTONE_ORE_STAIRS = register("redstone_ore_stairs", RedstoneOreStairsBlock::new);
		SPRUCE_LOG_STAIRS = register("spruce_log_stairs", SpruceLogStairsBlock::new);
		ACACIA_LOG_STAIRS = register("acacia_log_stairs", AcaciaLogStairsBlock::new);
		BIRCH_LOG_STAIRS = register("birch_log_stairs", BirchLogStairsBlock::new);
		JUNGLE_LOG_STAIRS = register("jungle_log_stairs", JungleLogStairsBlock::new);
		MANGROVE_LOG_STAIRS = register("mangrove_log_stairs", MangroveLogStairsBlock::new);
		CHERRY_LOG_STAIRS = register("cherry_log_stairs", CherryLogStairsBlock::new);
		PALE_OAK_LOG_STAIRS = register("pale_oak_log_stairs", PaleOakLogStairsBlock::new);
		CRIMSON_STEM_STAIRS = register("crimson_stem_stairs", CrimsonStemStairsBlock::new);
		WARPED_STEM_STAIRS = register("warped_stem_stairs", WarpedStemStairsBlock::new);
		BEACON_SLAB = register("beacon_slab", BeaconSlabBlock::new);
		SANDSTONE_SLAB = register("sandstone_slab", SandstoneSlabBlock::new);
		RED_SANDSTONE_SLAB = register("red_sandstone_slab", RedSandstoneSlabBlock::new);
		RED_CONCRETE_WALL = register("red_concrete_wall", RedConcreteWallBlock::new);
		ORANGE_CONCRETE_WALL = register("orange_concrete_wall", OrangeConcreteWallBlock::new);
		RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", RedTerracottaStairsBlock::new);
		ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", OrangeTerracottaStairsBlock::new);
		YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", YellowTerracottaStairsBlock::new);
		GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", GreenTerracottaStairsBlock::new);
		LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", LimeTerracottaStairsBlock::new);
		BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", BlackTerracottaStairsBlock::new);
		WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", WhiteTerracottaStairsBlock::new);
		GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", GrayTerracottaStairsBlock::new);
		LIGHT_GRAY_TERRACOTTA = register("light_gray_terracotta", LightGrayTerracottaBlock::new);
		PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", PinkTerracottaStairsBlock::new);
		MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", MagentaTerracottaStairsBlock::new);
		BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", BrownTerracottaStairsBlock::new);
		BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", BlueTerracottaStairsBlock::new);
		LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", LightBlueTerracottaStairsBlock::new);
		CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", CyanTerracottaStairsBlock::new);
		PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", PurpleTerracottaStairsBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(BuildyMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}