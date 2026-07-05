package com.example.erstellemireinezumtestenvon;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErstelleMirEineZumTestenVon implements ModInitializer {
    public static final String MOD_ID = "erstellemireinezumtestenvon";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("ErstelleMirEineZumTestenVon loaded!");
        // TODO: Register items, blocks, events, and commands here
    }
}