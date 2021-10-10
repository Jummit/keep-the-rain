package com.jummit.keeptherain.mixin;

import com.jummit.keeptherain.KeepTheRain;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.level.ServerLevel;

@Mixin(ServerLevel.class)
public class ResetWeatherMixin {
	@Inject(at = @At("HEAD"), method = "stopWeather()V", cancellable = true)
	private void init(CallbackInfo info) {
		ServerLevel level = ((ServerLevel)(Object)this);
		if (!level.getGameRules().getBoolean(KeepTheRain.DO_SLEEP_CLEAR_WEATHER)) {
			if (level.getLevelData().isThundering()) {
				level.setWeatherParameters(0, 0, true, false);
			}
			info.cancel();
		}
	}
}
