package com.phoen1x.polychess.utils;

import com.phoen1x.polychess.block.ModBlocks;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModifyLootTables {

    public static void modifyLootTables(){
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if ((key.getValue() == LootTables.RUINED_PORTAL_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KING_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_QUEEN_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));

                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KING_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_QUEEN_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
            }

            if ((key.getValue() == LootTables.VILLAGE_PLAINS_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));

                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
            }

            if ((key.getValue() == LootTables.VILLAGE_TAIGA_HOUSE_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));

                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
            }

            if ((key.getValue() == LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));

                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
            }

            if ((key.getValue() == LootTables.VILLAGE_DESERT_HOUSE_CHEST.getValue())){
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_WHITE_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));

                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_PAWN_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
                tableBuilder.modifyPools(builder -> builder.with(ItemEntry.builder(ModBlocks.CHESS_ROOK_BLACK_ITEM)
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3), false))
                        .weight(10)));
            }

            if ((key.getValue() == LootTables.ANCIENT_CITY_CHEST.getValue())){
                LootPool.Builder pool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(10f))
                        .with(ItemEntry.builder(ModBlocks.CHESS_PAWN_WHITE_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_WHITE_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_WHITE_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_ROOK_WHITE_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_KING_WHITE_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_QUEEN_WHITE_ITEM))

                        .with(ItemEntry.builder(ModBlocks.CHESS_PAWN_BLACK_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_BISHOP_BLACK_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_KNIGHT_BLACK_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_ROOK_BLACK_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_KING_BLACK_ITEM))
                        .with(ItemEntry.builder(ModBlocks.CHESS_QUEEN_BLACK_ITEM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1, 3)));
                tableBuilder.pool(pool);
            }
        });
    }
}
