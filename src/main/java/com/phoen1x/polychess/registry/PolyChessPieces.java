package com.phoen1x.polychess.registry;

import com.phoen1x.polychess.PolyChess;
import com.phoen1x.polychess.block.PolyChessBlock;
import com.phoen1x.polychess.block.TexturedPolyBlockItem;
import eu.pb4.polymer.core.api.item.PolymerItemGroupUtils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PolyChessPieces {

    private static final String[] PIECES = {
            "pawn", "king", "queen", "rook", "bishop", "knight"
    };

    private static final String[] COLORS = {
            "white", "black"
    };

    public static final List<Block> ALL_BLOCKS = new ArrayList<>();
    public static final List<BlockItem> ALL_ITEMS = new ArrayList<>();

    public static void registerBlocks() {
        for (String color : COLORS) {
            for (String piece : PIECES) {
                String name = "chess_" + piece + "_" + color;

                AbstractBlock.Settings baseSettings = Block.Settings.copy(
                        color.equals("white") ? Blocks.WHITE_WOOL : Blocks.BLACK_WOOL
                );

                Block block = registerBlock(name, settings -> new PolyChessBlock(settings, name), baseSettings);
                ALL_BLOCKS.add(block);

                BlockItem item = registerBlockItem(name, s -> new TexturedPolyBlockItem(block, s),
                        new Item.Settings().rarity(Rarity.EPIC));
                ALL_ITEMS.add(item);
            }
        }

        ItemGroup.Builder builder = PolymerItemGroupUtils.builder();
        builder.icon(() -> new ItemStack(ALL_ITEMS.get(0)));
        builder.displayName(Text.translatable("item-group.polychess.blocks"));
        builder.entries((displayContext, entries) ->
                ALL_BLOCKS.forEach(block -> entries.add(new ItemStack(block)))
        );


        ItemGroup polymerGroup = builder.build();
        PolymerItemGroupUtils.registerPolymerItemGroup(
                Identifier.of(PolyChess.MOD_ID, "blocks"), polymerGroup
        );
    }

    public static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings){
        var key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(PolyChess.MOD_ID, name));
        Block block = factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    public static BlockItem registerBlockItem(String name, Function<Item.Settings, BlockItem> factory, Item.Settings settings){
        var key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(PolyChess.MOD_ID, name));
        BlockItem item = factory.apply(settings.registryKey(key).useBlockPrefixedTranslationKey());
        return Registry.register(Registries.ITEM, key, item);
    }
}