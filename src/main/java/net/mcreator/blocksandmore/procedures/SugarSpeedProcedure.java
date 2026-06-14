package net.mcreator.blocksandmore.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class SugarSpeedProcedure {
	public static boolean eventResult = true;

	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.SPEED))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide()) {
				_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 1600, 2, false, true));
				_entity.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 60, 5, false, true));
				_entity.addEffect(new MobEffectInstance(MobEffects.HASTE, 1600, 3, false, true));
				_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 240, 1, false, true));
			}
		}
	}
}