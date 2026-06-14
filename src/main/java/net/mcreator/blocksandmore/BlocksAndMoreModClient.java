package net.mcreator.blocksandmore;

import net.mcreator.blocksandmore.init.BlocksAndMoreModFluids;
import net.mcreator.blocksandmore.init.BlocksAndMoreModBlocksRenderers;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class BlocksAndMoreModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		BlocksAndMoreModBlocksRenderers.clientLoad();
		BlocksAndMoreModFluids.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}