package com.phoen1x.polychess.datagen;

import com.phoen1x.polychess.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_KING_WHITE,
                Blocks.WHITE_CONCRETE,
                1
        );
        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_QUEEN_WHITE,
                Blocks.WHITE_CONCRETE,
                1
        );
        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_PAWN_WHITE,
                Blocks.WHITE_CONCRETE,
                1
        );
        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_ROOK_WHITE,
                Blocks.WHITE_CONCRETE,
                1
        );
//        offerStonecuttingRecipe(
//                exporter,
//                RecipeCategory.DECORATIONS,
//                ModBlocks.CHESS_KNIGHT_WHITE,
//                Blocks.WHITE_CONCRETE,
//                1
//        );
//        offerStonecuttingRecipe(
//                exporter,
//                RecipeCategory.DECORATIONS,
//                ModBlocks.CHESS_BISHOP_WHITE,
//                Blocks.WHITE_CONCRETE,
//                1
//        );

        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_KING_BLACK,
                Blocks.BLACK_CONCRETE,
                1
        );
        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_QUEEN_BLACK,
                Blocks.BLACK_CONCRETE,
                1
        );
        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_PAWN_BLACK,
                Blocks.BLACK_CONCRETE,
                1
        );
        offerStonecuttingRecipe(
                exporter,
                RecipeCategory.DECORATIONS,
                ModBlocks.CHESS_ROOK_BLACK,
                Blocks.BLACK_CONCRETE,
                1
        );
//        offerStonecuttingRecipe(
//                exporter,
//                RecipeCategory.DECORATIONS,
//                ModBlocks.CHESS_KNIGHT_BLACK,
//                Blocks.BLACK_CONCRETE,
//                1
//        );
//        offerStonecuttingRecipe(
//                exporter,
//                RecipeCategory.DECORATIONS,
//                ModBlocks.CHESS_BISHOP_BLACK,
//                Blocks.BLACK_CONCRETE,
//                1
//        );
    }
}
