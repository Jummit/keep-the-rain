package com.jummit.keeptherain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import net.minecraft.world.GameRules.Category;

public class KeepTheRain implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("modid");

	public static final GameRules.Key<GameRules.BooleanRule> DO_SLEEP_CLEAR_WEATHER =
			GameRuleRegistry.register("clearWeatherAfterSleep", Category.PLAYER, GameRuleFactory.createBooleanRule(false));

	@Override
	public void onInitialize() {
	}
}
