package com.jummit.keeptherain.mixin;

import com.jummit.keeptherain.KeepTheRain;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.world.ServerWorld;

@Mixin(ServerWorld.class)
public class ResetWeatherMixin {
	@Inject(at = @At("HEAD"), method = "resetWeather()V", cancellable = true)
	private void init(CallbackInfo info) {
		ServerWorld world = ((ServerWorld)(Object)this);
		if (!world.getGameRules().getBoolean(KeepTheRain.DO_SLEEP_CLEAR_WEATHER)) {
			if (world.getLevelProperties().isThundering()) {
				world.setWeather(0, 0, true, false);
			}
			info.cancel();
		}
	}
}
