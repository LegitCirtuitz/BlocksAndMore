/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocksandmore.init;

import net.mcreator.blocksandmore.fluid.LiquidSugarFluid;
import net.mcreator.blocksandmore.block.EmeraldStairBlock;
import net.mcreator.blocksandmore.block.BlockOfMetalBlock;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class BlocksAndMoreModBlocksRenderers {
	public static void clientLoad() {
		BlockOfMetalBlock.registerRenderLayer();
		LiquidSugarFluid.registerRenderLayer();
		EmeraldStairBlock.registerRenderLayer();
	}
	// Start of user code block custom block renderers
	// End of user code block custom block renderers
}