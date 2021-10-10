package com.jummit.keeptherain.fabric;

import com.jummit.keeptherain.KeepTheRain;

import net.fabricmc.api.ModInitializer;

public class KeepTheRainFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		KeepTheRain.init();
	}
}
