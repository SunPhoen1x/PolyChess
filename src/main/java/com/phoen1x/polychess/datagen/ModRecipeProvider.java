package com.phoen1x.polychess.datagen;

import com.phoen1x.polychess.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
//        offerStonecuttingRecipe(
//                exporter,
//                RecipeCategory.DECORATIONS,
//                ModBlocks.CHESS_KING_WHITE,
//                Blocks.WHITE_CONCRETE,
//                1
//        );
//        offerStonecuttingRecipe(
//                exporter,
//                RecipeCategory.DECORATIONS,
//                ModBlocks.CHESS_PAWN_WHITE,
//                Blocks.WHITE_CONCRETE,
//                1
//        );
//        SmithingTransformRecipeJsonBuilder.create(
//                Ingredient.EMPTY,
//                Ingredient.ofItems(ModBlocks.CHESS_KING_WHITE_ITEM),
//                Ingredient.ofItems(Blocks.WHITE_CONCRETE),
//                RecipeCategory.DECORATIONS,
//                ModBlocks.CHESS_KING_BLACK_ITEM
//        )
//                .criterion("has_white_concrete", conditionsFromItem(ModBlocks.CHESS_KING_BLACK_ITEM))
//                .offerTo(exporter, Identifier.of("polychess", "chess_king_white"));
    }
}
