package com.phoen1x.polychess;

import com.phoen1x.polychess.block.ModBlocks;
import com.phoen1x.polychess.block.knights.ChessKnightBlack;
import com.phoen1x.polychess.block.knights.ChessKnightWhite;
import com.phoen1x.polychess.entity.ModEntities;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolyChess implements ModInitializer {
	public static final String MOD_ID = "polychess";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerBlocks();
		ModEntities.register();
		initModels();
		if (PolymerResourcePackUtils.addModAssets(MOD_ID)) {
			LOGGER.info("Success PolyChess added mod assets for " + MOD_ID);
		} else {
			LOGGER.error("Failed to add PolyChess assets for " + MOD_ID);
		}
		PolymerResourcePackUtils.markAsRequired();
	}

	public void initModels(){
		ChessKnightWhite.Model.MODEL.isEmpty();
		ChessKnightBlack.Model.MODEL.isEmpty();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}