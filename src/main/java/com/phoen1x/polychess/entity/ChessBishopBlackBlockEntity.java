package com.phoen1x.polychess.entity;

import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;


public class ChessBishopBlackBlockEntity extends LockableBlockEntity{
    @SuppressWarnings("unchecked")
    public ChessBishopBlackBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.CHESS_BISHOP_BLACK, blockPos, blockState);
    }
}
