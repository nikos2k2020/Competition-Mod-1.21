package net.nikolas2k2020.competition.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nikolas2k2020.competition.CompetitionMod;
import net.nikolas2k2020.competition.block.custom.CabbageCropBlock;
import net.nikolas2k2020.competition.block.custom.OnionCropBlock;
import net.nikolas2k2020.competition.block.custom.TomatoCropBlock;

public class ModBlocks {
    //Azalea Blocks
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
    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
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
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Identifier AZALEA_SIGN_TEXTURE = Identifier.of(CompetitionMod.MOD_ID, "entity/signs/azalea");
    public static final Identifier AZALEA_HANGING_SIGN_TEXTURE = Identifier.of(CompetitionMod.MOD_ID, "entity/signs/hanging/azalea");
    public static final Identifier AZALEA_HANGING_GUI_SIGN_TEXTURE = Identifier.of(CompetitionMod.MOD_ID, "textures/gui/hanging_signs/azalea");

    public static final Block STANDING_AZALEA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "standing_azalea_sign"),
            new TerraformSignBlock(AZALEA_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_AZALEA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "wall_azalea_sign"),
            new TerraformWallSignBlock(AZALEA_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_AZALEA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "azalea_hanging_sign"),
            new TerraformHangingSignBlock(AZALEA_HANGING_SIGN_TEXTURE, AZALEA_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_AZALEA_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "azalea_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(AZALEA_HANGING_SIGN_TEXTURE, AZALEA_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));

    //Chestnut Blocks
    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2f).requiresTool()));
    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f).requiresTool()));
    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2f).requiresTool()));
    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f).requiresTool()));

    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block CHESTNUT_STAIRS = registerBlock("chestnut_stairs",
            new StairsBlock(ModBlocks.CHESTNUT_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block CHESTNUT_SLAB = registerBlock("chestnut_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block CHESTNUT_BUTTON = registerBlock("chestnut_button",
            new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));
    public static final Block CHESTNUT_PRESSURE_PLATE = registerBlock("chestnut_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()));

    public static final Block CHESTNUT_FENCE = registerBlock("chestnut_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHESTNUT_FENCE_GATE = registerBlock("chestnut_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block CHESTNUT_DOOR = registerBlock("chestnut_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block CHESTNUT_TRAPDOOR = registerBlock("chestnut_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).nonOpaque()));

    public static final Identifier CHESTNUT_SIGN_TEXTURE = Identifier.of(CompetitionMod.MOD_ID, "entity/signs/chestnut");
    public static final Identifier CHESTNUT_HANGING_SIGN_TEXTURE = Identifier.of(CompetitionMod.MOD_ID, "entity/signs/hanging/chestnut");
    public static final Identifier CHESTNUT_HANGING_GUI_SIGN_TEXTURE = Identifier.of(CompetitionMod.MOD_ID, "textures/gui/hanging_signs/chestnut");

    public static final Block STANDING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "standing_chestnut_sign"),
            new TerraformSignBlock(CHESTNUT_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN)));
    public static final Block WALL_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "wall_chestnut_sign"),
            new TerraformWallSignBlock(CHESTNUT_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "chestnut_hanging_sign"),
            new TerraformHangingSignBlock(CHESTNUT_HANGING_SIGN_TEXTURE, CHESTNUT_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, Identifier.of(CompetitionMod.MOD_ID, "chestnut_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(CHESTNUT_HANGING_SIGN_TEXTURE, CHESTNUT_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN)));


    //Crops
    public static final Block TOMATO_CROP = registerBlock("tomato_crop",
            new TomatoCropBlock((AbstractBlock.Settings.copy(Blocks.WHEAT))));
    public static final Block ONION_CROP = registerBlock("onion_crop",
            new OnionCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));
    public static final Block CABBAGE_CROP = registerBlock("cabbage_crop",
            new CabbageCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    //Families
    public static final BlockFamily AZALEA_FAMILY = BlockFamilies.register(ModBlocks.AZALEA_PLANKS)
            .sign(ModBlocks.STANDING_AZALEA_SIGN, ModBlocks.WALL_AZALEA_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    public static final BlockFamily CHESTNUT_FAMILY = BlockFamilies.register(ModBlocks.CHESTNUT_PLANKS)
            .sign(ModBlocks.STANDING_CHESTNUT_SIGN, ModBlocks.WALL_CHESTNUT_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    //Other
    /*public static final Block RUBY_BLOCK = registerBlock("ruby_block",
        new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK).strength(5.0f, 6.0f).requiresTool()));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
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
