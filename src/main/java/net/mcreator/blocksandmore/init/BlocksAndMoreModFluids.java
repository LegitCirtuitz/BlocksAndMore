/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.blocksandmore.init;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.blocksandmore.fluid.LiquidSugarFluid;
import net.mcreator.blocksandmore.fluid.AcidFluid;
import net.mcreator.blocksandmore.BlocksAndMoreMod;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.function.Supplier;

public class BlocksAndMoreModFluids {
	public static FlowingFluid LIQUID_SUGAR;
	public static FlowingFluid FLOWING_LIQUID_SUGAR;
	public static FlowingFluid ACID;
	public static FlowingFluid FLOWING_ACID;

	public static void load() {
		LIQUID_SUGAR = register("liquid_sugar", LiquidSugarFluid.Source::new);
		FLOWING_LIQUID_SUGAR = register("flowing_liquid_sugar", LiquidSugarFluid.Flowing::new);
		ACID = register("acid", AcidFluid.Source::new);
		FLOWING_ACID = register("flowing_acid", AcidFluid.Flowing::new);
	}

	@Environment(EnvType.CLIENT)
	public static void clientLoad() {
		LiquidSugarFluid.clientLoad();
		AcidFluid.clientLoad();
	}

	private static <F extends Fluid> F register(String registryname, Supplier<F> element) {
		return (F) Registry.register(BuiltInRegistries.FLUID, ResourceLocation.fromNamespaceAndPath(BlocksAndMoreMod.MODID, registryname), element.get());
	}
}