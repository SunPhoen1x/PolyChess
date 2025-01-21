package com.phoen1x.polychess.block;

import com.phoen1x.polychess.PolyChess;
import com.phoen1x.polychess.block.bishop.ChessBishopBlack;
import com.phoen1x.polychess.block.bishop.ChessBishopWhite;
import com.phoen1x.polychess.block.kings.ChessKingBlack;
import com.phoen1x.polychess.block.kings.ChessKingWhite;
import com.phoen1x.polychess.block.knights.ChessKnightBlack;
import com.phoen1x.polychess.block.knights.ChessKnightWhite;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static com.phoen1x.polychess.PolyChess.MOD_ID;

public class ModBlocks {
    public static final Block CHESS_PAWN_WHITE = registerBlock("chess_pawn_white", new PolyChessBlockWhite(Block.Settings.copy(Blocks.WHITE_CONCRETE), "chess_pawn_white"));
    public static final Block CHESS_KING_WHITE = registerBlock("chess_king_white", new ChessKingWhite(Block.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block CHESS_QUEEN_WHITE = registerBlock("chess_queen_white", new PolyChessBlockWhite(Block.Settings.copy(Blocks.WHITE_CONCRETE), "chess_queen_white"));
    public static final Block CHESS_ROOK_WHITE = registerBlock("chess_rook_white", new PolyChessBlockWhite(Block.Settings.copy(Blocks.WHITE_CONCRETE), "chess_rook_white"));
    public static final Block CHESS_BISHOP_WHITE = registerBlock("chess_bishop_white", new ChessBishopWhite(Block.Settings.copy(Blocks.WHITE_CONCRETE)));
    public static final Block CHESS_KNIGHT_WHITE = registerBlock("chess_knight_white", new ChessKnightWhite(Block.Settings.copy(Blocks.WHITE_CONCRETE)));

    public static final Block CHESS_PAWN_BLACK = registerBlock("chess_pawn_black", new PolyChessBlockBlack(Block.Settings.copy(Blocks.BLACK_CONCRETE), "chess_pawn_black"));
    public static final Block CHESS_KING_BLACK = registerBlock("chess_king_black", new ChessKingBlack(Block.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block CHESS_QUEEN_BLACK = registerBlock("chess_queen_black", new PolyChessBlockBlack(Block.Settings.copy(Blocks.BLACK_CONCRETE), "chess_queen_black"));
    public static final Block CHESS_ROOK_BLACK = registerBlock("chess_rook_black", new PolyChessBlockBlack(Block.Settings.copy(Blocks.BLACK_CONCRETE), "chess_rook_black"));
    public static final Block CHESS_BISHOP_BLACK = registerBlock("chess_bishop_black", new ChessBishopBlack(Block.Settings.copy(Blocks.BLACK_CONCRETE)));
    public static final Block CHESS_KNIGHT_BLACK = registerBlock("chess_knight_black", new ChessKnightBlack(Block.Settings.copy(Blocks.BLACK_CONCRETE)));

    public static final BlockItem CHESS_KING_BLACK_ITEM = registerBlockItem("chess_king_black", new TexturedPolyBlockItem(CHESS_KING_BLACK, new Item.Settings().rarity(Rarity.EPIC), "block/chess_king_black"));
    public static final BlockItem CHESS_PAWN_BLACK_ITEM = registerBlockItem("chess_pawn_black", new TexturedPolyBlockItem(CHESS_PAWN_BLACK, new Item.Settings().rarity(Rarity.EPIC), "block/chess_pawn_black"));
    public static final BlockItem CHESS_QUEEN_BLACK_ITEM = registerBlockItem("chess_queen_black", new TexturedPolyBlockItem(CHESS_QUEEN_BLACK, new Item.Settings().rarity(Rarity.EPIC), "block/chess_queen_black"));
    public static final BlockItem CHESS_ROOK_BLACK_ITEM = registerBlockItem("chess_rook_black", new TexturedPolyBlockItem(CHESS_ROOK_BLACK, new Item.Settings().rarity(Rarity.EPIC), "block/chess_rook_black"));
    public static final BlockItem CHESS_BISHOP_BLACK_ITEM = registerBlockItem("chess_bishop_black", new TexturedPolyBlockItem(CHESS_BISHOP_BLACK, new Item.Settings().rarity(Rarity.EPIC), "block/chess_bishop_black"));
    public static final BlockItem CHESS_KNIGHT_BLACK_ITEM = registerBlockItem("chess_knight_black", new TexturedPolyBlockItem(CHESS_KNIGHT_BLACK, new Item.Settings().rarity(Rarity.EPIC), "block/chess_knight_black"));

    public static final BlockItem CHESS_KING_WHITE_ITEM = registerBlockItem("chess_king_white", new TexturedPolyBlockItem(CHESS_KING_WHITE, new Item.Settings().rarity(Rarity.EPIC), "block/chess_king_white"));
    public static final BlockItem CHESS_PAWN_WHITE_ITEM = registerBlockItem("chess_pawn_white", new TexturedPolyBlockItem(CHESS_PAWN_WHITE, new Item.Settings().rarity(Rarity.EPIC), "block/chess_pawn_white"));
    public static final BlockItem CHESS_QUEEN_WHITE_ITEM = registerBlockItem("chess_queen_white", new TexturedPolyBlockItem(CHESS_QUEEN_WHITE, new Item.Settings().rarity(Rarity.EPIC), "block/chess_queen_white"));
    public static final BlockItem CHESS_ROOK_WHITE_ITEM = registerBlockItem("chess_rook_white", new TexturedPolyBlockItem(CHESS_ROOK_WHITE, new Item.Settings().rarity(Rarity.EPIC), "block/chess_rook_white"));
    public static final BlockItem CHESS_BISHOP_WHITE_ITEM = registerBlockItem("chess_bishop_white", new TexturedPolyBlockItem(CHESS_BISHOP_WHITE, new Item.Settings().rarity(Rarity.EPIC), "block/chess_bishop_white"));
    public static final BlockItem CHESS_KNIGHT_WHITE_ITEM = registerBlockItem("chess_knight_white", new TexturedPolyBlockItem(CHESS_KNIGHT_WHITE, new Item.Settings().rarity(Rarity.EPIC), "block/chess_knight_white"));

    public static void registerBlocks() {
        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ModBlocks.CHESS_KING_WHITE_ITEM, 1));
        builder.displayName(Text.translatable("item-group.polychess.blocks"));

        builder.entries((displayContext, entries) -> {
            entries.add(CHESS_KING_WHITE);
            entries.add(CHESS_PAWN_WHITE);
            entries.add(CHESS_QUEEN_WHITE);
            entries.add(CHESS_ROOK_WHITE);
            entries.add(CHESS_BISHOP_WHITE);
            entries.add(CHESS_KNIGHT_WHITE);

            entries.add(CHESS_KING_BLACK);
            entries.add(CHESS_PAWN_BLACK);
            entries.add(CHESS_QUEEN_BLACK);
            entries.add(CHESS_ROOK_BLACK);
            entries.add(CHESS_BISHOP_BLACK);
            entries.add(CHESS_KNIGHT_BLACK);
        });
        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(Identifier.of(MOD_ID, "blocks"), polymerGroup);

        PolyChess.LOGGER.info("PolyChess register");
    }

    public static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, name), block);
    }
    public static BlockItem registerBlockItem(String name, BlockItem item){
        return Registry.register(Registries.ITEM, Identifier.of(MOD_ID, name), item);
    }
}
