/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocksandmore.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.blocksandmore.block.*;
import net.mcreator.blocksandmore.BlocksAndMoreMod;

import java.util.function.Function;

public class BlocksAndMoreModBlocks {
	public static Block RED_CONCRETE_STAIRS;
	public static Block BLOCK_OF_METAL;
	public static Block ORANGE_CONCRETE_STAIRS;
	public static Block YELLOW_CONCRETE_STAIRS;
	public static Block GREEN_CONCRETE_STAIRS;
	public static Block GRASS_STAIRS;
	public static Block BEACON_STAIRS;
	public static Block IRON_STAIRS;
	public static Block LIQUID_SUGAR;
	public static Block LIGHT_BLUE_CONCRETE_STAIRS;
	public static Block CYAN_CONCRETE_STAIRS;
	public static Block BLUE_CONCRETE_STAIRS;
	public static Block GOLD_STAIRS;
	public static Block COAL_STAIRS;
	public static Block EMERALD_STAIR;
	public static Block DIAMOND_STAIR;
	public static Block WEMMBU_STAIR;
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
	public static Block ORANGE_CONCRETE_SLAB;
	public static Block RED_CONCRETE_SLAB;
	public static Block YELLOW_CONCRETE_SLAB;

	public static void load() {
		RED_CONCRETE_STAIRS = register("red_concrete_stairs", RedConcreteStairsBlock::new);
		BLOCK_OF_METAL = register("block_of_metal", BlockOfMetalBlock::new);
		ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", OrangeConcreteStairsBlock::new);
		YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", YellowConcreteStairsBlock::new);
		GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", GreenConcreteStairsBlock::new);
		GRASS_STAIRS = register("grass_stairs", GrassStairsBlock::new);
		BEACON_STAIRS = register("beacon_stairs", BeaconStairsBlock::new);
		IRON_STAIRS = register("iron_stairs", IronStairsBlock::new);
		LIQUID_SUGAR = register("liquid_sugar", LiquidSugarBlock::new);
		LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", LightBlueConcreteStairsBlock::new);
		CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", CyanConcreteStairsBlock::new);
		BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", BlueConcreteStairsBlock::new);
		GOLD_STAIRS = register("gold_stairs", GoldStairsBlock::new);
		COAL_STAIRS = register("coal_stairs", CoalStairsBlock::new);
		EMERALD_STAIR = register("emerald_stair", EmeraldStairBlock::new);
		DIAMOND_STAIR = register("diamond_stair", DiamondStairBlock::new);
		WEMMBU_STAIR = register("wemmbu_stair", WemmbuStairBlock::new);
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
		ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", OrangeConcreteSlabBlock::new);
		RED_CONCRETE_SLAB = register("red_concrete_slab", RedConcreteSlabBlock::new);
		YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", YellowConcreteSlabBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(BlocksAndMoreMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}