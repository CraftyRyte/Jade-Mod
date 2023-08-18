package com.craftyryte.jademod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JadeMod implements ModInitializer {
	public static final String MOD_ID = "jademod";
    public static final Logger LOGGER = LoggerFactory.getLogger("jademod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}