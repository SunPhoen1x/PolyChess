package com.phoen1x.polychess.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.phoen1x.polychess.block.ModBlocks.*;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }
    @Override
    public void generate() {
        addDrop(CHESS_KING_WHITE);
        addDrop(CHESS_PAWN_WHITE);
        addDrop(CHESS_KNIGHT_WHITE);
        addDrop(CHESS_QUEEN_WHITE);
        addDrop(CHESS_BISHOP_WHITE);
        addDrop(CHESS_ROOK_WHITE);

        addDrop(CHESS_KING_BLACK);
        addDrop(CHESS_PAWN_BLACK);
        addDrop(CHESS_KNIGHT_BLACK);
        addDrop(CHESS_QUEEN_BLACK);
        addDrop(CHESS_BISHOP_BLACK);
        addDrop(CHESS_ROOK_BLACK);
    }
}
