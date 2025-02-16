package com.phoen1x.polychess.entity;

import com.phoen1x.polychess.PolyChess;
import com.phoen1x.polychess.block.ModBlocks;
import eu.pb4.polymer.core.api.block.PolymerBlockUtils;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final BlockEntityType<ChessKnightWhiteBlockEntity> CHESS_KNIGHT_WHITE = register("chess_knight_white", BlockEntityType.Builder.create(ChessKnightWhiteBlockEntity::new, ModBlocks.CHESS_KNIGHT_WHITE));
    public static final BlockEntityType<ChessKnightBlackBlockEntity> CHESS_KNIGHT_BLACK = register("chess_knight_black", BlockEntityType.Builder.create(ChessKnightBlackBlockEntity::new, ModBlocks.CHESS_KNIGHT_BLACK));

    public static final BlockEntityType<ChessKingWhiteBlockEntity> CHESS_KING_WHITE = register("chess_king_white", BlockEntityType.Builder.create(ChessKingWhiteBlockEntity::new, ModBlocks.CHESS_KING_WHITE));
    public static final BlockEntityType<ChessKingBlackBlockEntity> CHESS_KING_BLACK = register("chess_king_black", BlockEntityType.Builder.create(ChessKingBlackBlockEntity::new, ModBlocks.CHESS_KING_BLACK));

    public static final BlockEntityType<ChessBishopWhiteBlockEntity> CHESS_BISHOP_WHITE = register("chess_bishop_white", BlockEntityType.Builder.create(ChessBishopWhiteBlockEntity::new, ModBlocks.CHESS_BISHOP_WHITE));
    public static final BlockEntityType<ChessBishopBlackBlockEntity> CHESS_BISHOP_BLACK = register("chess_bishop_black", BlockEntityType.Builder.create(ChessBishopBlackBlockEntity::new, ModBlocks.CHESS_BISHOP_BLACK));


    public static void register() {}

    public static <T extends BlockEntity> BlockEntityType<T> register(String path, BlockEntityType.Builder<T> builder) {
        BlockEntityType<T> blockEntityType = Registry.register(Registries.BLOCK_ENTITY_TYPE,Identifier.of(PolyChess.MOD_ID, path), builder.build());

        PolymerBlockUtils.registerBlockEntity(blockEntityType);

        return blockEntityType;
    }
}
