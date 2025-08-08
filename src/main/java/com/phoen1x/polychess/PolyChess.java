package com.phoen1x.polychess;

import com.phoen1x.polychess.registry.PolyChessPieces;
import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import eu.pb4.polymer.resourcepack.extras.api.ResourcePackExtras;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolyChess implements ModInitializer {
	public static final String MOD_ID = FabricLoader.getInstance().getModContainer("polychess").orElseThrow(() -> new RuntimeException("Mod ID not found!")).getMetadata().getId();
	public static final String MOD_VERSION = FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(() -> new RuntimeException("Mod version not found!")).getMetadata().getVersion().getFriendlyString();
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		PolyChessPieces.registerBlocks();
		PolymerResourcePackUtils.addModAssets(MOD_ID);
		ResourcePackExtras.forDefault().addBridgedModelsFolder(id("block"));
		LOGGER.info("Successfully added mod assets for {} {}", MOD_ID, MOD_VERSION);
		PolymerResourcePackUtils.markAsRequired();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
