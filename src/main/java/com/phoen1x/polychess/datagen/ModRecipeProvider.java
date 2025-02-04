package com.phoen1x.polychess.datagen;

import com.phoen1x.polychess.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
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
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_PAWN_WHITE_ITEM.asItem(), 2)
                .pattern("S")
                .pattern("S")
                .input('S', Items.WHITE_CONCRETE)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_PAWN_WHITE_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_ROOK_WHITE_ITEM.asItem(), 2)
                .pattern("SS")
                .pattern("SS")
                .input('S', Items.WHITE_CONCRETE)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_ROOK_WHITE_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_QUEEN_WHITE_ITEM.asItem(), 1)
                .pattern("I I")
                .pattern(" S ")
                .pattern("SSS")
                .input('S', Items.WHITE_CONCRETE)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_QUEEN_WHITE_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_KING_WHITE_ITEM.asItem(), 1)
                .pattern(" G ")
                .pattern(" S ")
                .pattern("SSS")
                .input('S', Items.WHITE_CONCRETE)
                .input('G', Items.GOLD_INGOT)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_KING_WHITE_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_BISHOP_WHITE_ITEM.asItem(), 2)
                .pattern("S")
                .pattern("S")
                .pattern("S")
                .input('S', Items.WHITE_CONCRETE)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_BISHOP_WHITE_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_KNIGHT_WHITE_ITEM.asItem(), 2)
                .pattern("SS")
                .pattern("S ")
                .input('S', Items.WHITE_CONCRETE)
                .criterion(hasItem(Items.WHITE_CONCRETE), conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_KNIGHT_WHITE_ITEM)));

        //------------------------------

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_PAWN_BLACK_ITEM.asItem(), 2)
                .pattern("S")
                .pattern("S")
                .input('S', Items.BLACK_CONCRETE)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_PAWN_BLACK_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_ROOK_BLACK_ITEM.asItem(), 2)
                .pattern("SS")
                .pattern("SS")
                .input('S', Items.BLACK_CONCRETE)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_ROOK_BLACK_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_QUEEN_BLACK_ITEM.asItem(), 1)
                .pattern("I I")
                .pattern(" S ")
                .pattern("SSS")
                .input('S', Items.BLACK_CONCRETE)
                .input('I', Items.IRON_INGOT)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_QUEEN_BLACK_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_KING_BLACK_ITEM.asItem(), 1)
                .pattern(" G ")
                .pattern(" S ")
                .pattern("SSS")
                .input('S', Items.BLACK_CONCRETE)
                .input('G', Items.GOLD_INGOT)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_KING_BLACK_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_BISHOP_BLACK_ITEM.asItem(), 2)
                .pattern("S")
                .pattern("S")
                .pattern("S")
                .input('S', Items.BLACK_CONCRETE)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_BISHOP_BLACK_ITEM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.CHESS_KNIGHT_BLACK_ITEM.asItem(), 2)
                .pattern("SS")
                .pattern("S ")
                .input('S', Items.BLACK_CONCRETE)
                .criterion(hasItem(Items.BLACK_CONCRETE), conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModBlocks.CHESS_KNIGHT_BLACK_ITEM)));
    }
}
