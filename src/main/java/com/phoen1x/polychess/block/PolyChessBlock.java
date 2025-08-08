package com.phoen1x.polychess.block;

import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.attachment.BlockBoundAttachment;
import eu.pb4.polymer.virtualentity.api.attachment.HolderAttachment;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.joml.Vector3f;
import xyz.nucleoid.packettweaker.PacketContext;

import static com.phoen1x.polychess.PolyChess.id;

public class PolyChessBlock extends Block implements FactoryBlock {
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;

    private final ItemStack chessModel;
    private final boolean isWhite;

    public PolyChessBlock(Settings settings, String path) {
        super(settings.nonOpaque());

        this.isWhite = path.toLowerCase().endsWith("_white");
        this.chessModel = ItemDisplayElementUtil.getModel(id("block/" + path));

        this.setDefaultState(this.stateManager.getDefaultState()
                .with(Properties.PERSISTENT, false)
                .with(FACING, Direction.NORTH));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.PERSISTENT, FACING);
    }

    @Override
    public ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        return new Model(initialBlockState);
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, PacketContext context) {
        return (isWhite ? Blocks.WHITE_WOOL : Blocks.BLACK_WOOL).getDefaultState();
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state, PacketContext context) {
        return Blocks.BARRIER.getDefaultState();
    }

    public final class Model extends BlockModel {
        private ItemDisplayElement main;

        public Model(BlockState state) {
            updateModel(state);
        }

        private void updateModel(BlockState state) {
            if (main != null) removeElement(main);
            main = ItemDisplayElementUtil.createSimple(chessModel);
            main.setScale(new Vector3f(0.5f));
            main.setTranslation(new Vector3f(0, 0, -0.5f));
            main.setPitch(-90f);
            main.setYaw(state.get(FACING).getPositiveHorizontalDegrees());
            addElement(main);
        }

        @Override
        public void notifyUpdate(HolderAttachment.UpdateType updateType) {
            if (updateType == BlockBoundAttachment.BLOCK_STATE_UPDATE) {
                updateModel(this.blockState());
            }
            super.notifyUpdate(updateType);
        }
    }
}