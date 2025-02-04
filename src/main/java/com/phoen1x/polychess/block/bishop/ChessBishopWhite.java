package com.phoen1x.polychess.block.bishop;

import com.mojang.serialization.MapCodec;
import com.phoen1x.polychess.PolyChess;
import com.phoen1x.polychess.entity.ChessBishopWhiteBlockEntity;
import com.phoen1x.polychess.utils.TransparentBlocks.TransparentTripWire;
import eu.pb4.factorytools.api.block.FactoryBlock;
import eu.pb4.factorytools.api.resourcepack.BaseItemProvider;
import eu.pb4.factorytools.api.virtualentity.BlockModel;
import eu.pb4.factorytools.api.virtualentity.ItemDisplayElementUtil;
import eu.pb4.polymer.virtualentity.api.ElementHolder;
import eu.pb4.polymer.virtualentity.api.elements.ItemDisplayElement;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

public class ChessBishopWhite extends BlockWithEntity implements TransparentTripWire, FactoryBlock, BlockEntityProvider {
    public static final DirectionProperty FACING;
    public static final MapCodec<ChessBishopWhite> CODEC;
    private Model model;

    static {
        FACING = Properties.HORIZONTAL_FACING;
        CODEC = createCodec(ChessBishopWhite::new);
    }

    public ChessBishopWhite(Settings settings) {
        super(settings.nonOpaque());
    }

    @Override
    public BlockState getPolymerBreakEventBlockState(BlockState state, ServerPlayerEntity player) {
        return Blocks.WHITE_CONCRETE.getDefaultState();
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.BARRIER.getDefaultState();
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ChessBishopWhiteBlockEntity(pos, state);
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        ItemScatterer.onStateReplaced(state, newState, world, pos);
        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
        super.appendProperties(builder);
    }

    @Override
    public @Nullable ElementHolder createElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        model = new Model(initialBlockState, world, pos);
        return model;
    }

    @Override
    public boolean tickElementHolder(ServerWorld world, BlockPos pos, BlockState initialBlockState) {
        this.model.tick();
        return true;
    }

    public static final class Model extends BlockModel {
        public static final ItemStack MODEL = BaseItemProvider.requestModel(Identifier.of(PolyChess.MOD_ID, "block/chess_bishop_white"));
        public ItemDisplayElement bishop;
        public ServerWorld world;
        public BlockPos pos;

        public Model(BlockState state, ServerWorld world, BlockPos pos) {
            this.world = world;
            this.pos = pos;
            init(state);
        }

        public void init(BlockState state) {
            this.bishop = ItemDisplayElementUtil.createSimple(MODEL);
            this.bishop.setScale(new Vector3f(0.5f));
            this.bishop.setTranslation(new Vector3f(0, 0, -0.5f));
            this.bishop.setPitch(-90f);
            this.addElement(bishop);
            this.updateStatePos(state);
        }

        private void updateStatePos(BlockState state) {
            var direction = state.get(FACING);
            var yaw = direction.asRotation();
            this.bishop.setYaw(yaw);
        }
    }
}
