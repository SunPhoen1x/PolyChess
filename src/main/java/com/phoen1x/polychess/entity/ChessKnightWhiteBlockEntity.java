package com.phoen1x.polychess.entity;

import com.phoen1x.polychess.block.knights.ChessKnightWhite;
import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;


public class ChessKnightWhiteBlockEntity extends LockableBlockEntity{
    @SuppressWarnings("unchecked")
    private ChessKnightWhite.Model model;
    public ChessKnightWhiteBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.CHESS_KNIGHT_WHITE, blockPos, blockState);
    }
}
