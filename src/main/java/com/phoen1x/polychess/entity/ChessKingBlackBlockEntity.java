package com.phoen1x.polychess.entity;

import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;


public class ChessKingBlackBlockEntity extends LockableBlockEntity{
    @SuppressWarnings("unchecked")
    public ChessKingBlackBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.CHESS_KING_BLACK, blockPos, blockState);
    }
}
