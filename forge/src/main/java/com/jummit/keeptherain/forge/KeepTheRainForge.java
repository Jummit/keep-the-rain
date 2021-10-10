package com.jummit.keeptherain.forge;

import com.jummit.keeptherain.KeepTheRain;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KeepTheRain.MOD_ID)
public class KeepTheRainForge {
    public KeepTheRainForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(KeepTheRain.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        KeepTheRain.init();
    }
}
