package com.jummit.keeptherain;

import dev.architectury.registry.level.GameRuleFactory;
import dev.architectury.registry.level.GameRuleRegistry;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.GameRules.Category;

public class KeepTheRain {
	public static final String MOD_ID = "keeptherain";

	public static final GameRules.Key<GameRules.BooleanValue> DO_SLEEP_CLEAR_WEATHER =
			GameRuleRegistry.register("clearWeatherAfterSleep", Category.PLAYER, GameRuleFactory.createBooleanRule(false));

	public static void init() {
	}
}
