package com.phoen1x.polychess.entity;

import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;


public class ChessKingWhiteBlockEntity extends LockableBlockEntity{
    @SuppressWarnings("unchecked")
    public ChessKingWhiteBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.CHESS_KING_WHITE, blockPos, blockState);
    }
}
