package com.phoen1x.polychess.entity;

import eu.pb4.factorytools.api.block.entity.LockableBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;


public class ChessBishopWhiteBlockEntity extends LockableBlockEntity{
    @SuppressWarnings("unchecked")
    public ChessBishopWhiteBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModEntities.CHESS_BISHOP_WHITE, blockPos, blockState);
    }
}
