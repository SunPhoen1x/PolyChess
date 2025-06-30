package com.phoen1x.polychess.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import static com.phoen1x.polychess.block.ModBlocks.*;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(CHESS_KING_WHITE)
                .add(CHESS_PAWN_WHITE)
                .add(CHESS_BISHOP_WHITE)
                .add(CHESS_QUEEN_WHITE)
                .add(CHESS_KNIGHT_WHITE)
                .add(CHESS_ROOK_WHITE)

                .add(CHESS_KING_BLACK)
                .add(CHESS_PAWN_BLACK)
                .add(CHESS_BISHOP_BLACK)
                .add(CHESS_QUEEN_BLACK)
                .add(CHESS_KNIGHT_BLACK)
                .add(CHESS_ROOK_BLACK);
    }
}
