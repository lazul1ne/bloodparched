package dev.lazuline.mixin;

import dev.lazuline.effect.ModEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityDeathMixin {

	@Inject(at = @At("HEAD"), method = "onDeath")
	private void onDeath(DamageSource source, CallbackInfo info) {

		System.out.println(source.getType());
		if (source.getAttacker() instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) source.getAttacker();

			player.removeStatusEffect(ModEffects.BLOOD_PARCHED);


		}
	}
}