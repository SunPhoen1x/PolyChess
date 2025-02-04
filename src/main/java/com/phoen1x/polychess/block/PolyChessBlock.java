package com.phoen1x.polychess.block;

import eu.pb4.factorytools.api.block.BarrierBasedWaterloggable;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import org.joml.Vector3f;

import static com.phoen1x.polychess.PolyChess.id;

public class PolyChessBlock extends LeavesBlock implements BarrierBasedWaterloggable, FactoryBlock {

    protected ItemStack CHESS_MODEL;
    private final boolean isWhite;

    public PolyChessBlock(Settings settings, String path, boolean isWhite) {
        super(settings);
        this.isWhite = isWhite;
        CHESS_MODEL = BaseItemProvider.requestModel(id("block/" + path));
        this.setDefaultState(this.stateManager.getDefaultState().with(Properties.PERSISTENT, false));
    }

    @Override
    public ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new Model(initialBlockState);
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, ServerPlayerEntity player) {
        return isWhite ? Blocks.WHITE_CONCRETE.getDefaultState() : Blocks.BLACK_CONCRETE.getDefaultState();
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.BARRIER.getDefaultState();
    }

    public final class Model extends BlockModel {
        public ItemDisplayElement main;

        public Model(BlockState state) {
            init(state);
        }

        public void init(BlockState state) {
            this.main = ItemDisplayElementUtil.createSimple(CHESS_MODEL);
            this.main.setScale(new Vector3f(0.5f));
            this.main.setTranslation(new Vector3f(0, 0, -0.5f));
            this.main.setPitch(-90f);
            this.main.setYaw(90f);
            this.addElement(main);
        }

        private void updateItem(BlockState state) {
            this.removeElement(this.main);
            init(state);
        }

        @Override
        public void notifyUpdate(HolderAttachment.UpdateType updateType) {
            if (updateType == BlockBoundAttachment.BLOCK_STATE_UPDATE) {
                updateItem(this.blockState());
            }
            super.notifyUpdate(updateType);
        }
    }
}
