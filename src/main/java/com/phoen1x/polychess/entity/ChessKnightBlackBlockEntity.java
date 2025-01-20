package com.phoen1x.polychess.entity;

import com.phoen1x.polychess.block.knights.ChessKnightWhite;
import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;


public class ChessKnightBlackBlockEntity extends LockableBlockEntity{
    @SuppressWarnings("unchecked")
    private ChessKnightWhite.Model model;
    public ChessKnightBlackBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.CHESS_KNIGHT_BLACK, blockPos, blockState);
    }
}
