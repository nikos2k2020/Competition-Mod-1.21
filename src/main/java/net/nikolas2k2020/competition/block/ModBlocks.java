package net.nikolas2k2020.competition.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nikolas2k2020.competition.CompetitionMod;

public class ModBlocks {
    public static final Block AZALEA_LOG = registerBlock("azalea_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2f).requiresTool()));
    public static final Block STRIPPED_AZALEA_LOG = registerBlock("stripped_azalea_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f).requiresTool()));
    public static final Block AZALEA_WOOD = registerBlock("azalea_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2f).requiresTool()));
    public static final Block STRIPPED_AZALEA_WOOD = registerBlock("stripped_azalea_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f).requiresTool()));

    public static final Block AZALEA_PLANKS = registerBlock("azalea_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block AZALEA_STAIRS = registerBlock("azalea_stairs",
            new StairsBlock(ModBlocks.AZALEA_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block AZALEA_SLAB = registerBlock("azalea_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block AZALEA_BUTTON = registerBlock("azalea_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block AZALEA_PRESSURE_PLATE = registerBlock("azalea_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));

    public static final Block AZALEA_FENCE = registerBlock("azalea_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block AZALEA_FENCE_GATE = registerBlock("azalea_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block AZALEA_DOOR = registerBlock("azalea_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK).strength(5.0f, 6.0f).requiresTool()));
    /*public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(3).requiresTool()));*/



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CompetitionMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registeringModBlocks() {
        CompetitionMod.LOGGER.info("Registering Mod Blocks for " + CompetitionMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //entries.add(ModBlocks.RUBY_BLOCK);
        });
    }
}
