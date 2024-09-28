package net.nikolas2k2020.competition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.nikolas2k2020.competition.block.ModBlocks;
import net.nikolas2k2020.competition.block.custom.CabbageCropBlock;
import net.nikolas2k2020.competition.block.custom.OnionCropBlock;
import net.nikolas2k2020.competition.block.custom.TomatoCropBlock;
import net.nikolas2k2020.competition.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AZALEA_PLANKS);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

        //Azalea
        blockStateModelGenerator.registerLog(ModBlocks.AZALEA_LOG).log(ModBlocks.AZALEA_LOG).wood(ModBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_AZALEA_LOG).log(ModBlocks.STRIPPED_AZALEA_LOG).wood(ModBlocks.STRIPPED_AZALEA_WOOD);

        BlockStateModelGenerator.BlockTexturePool azaleaPool =  blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AZALEA_PLANKS);
        azaleaPool.button(ModBlocks.AZALEA_BUTTON);
        azaleaPool.fence(ModBlocks.AZALEA_FENCE);
        azaleaPool.fenceGate(ModBlocks.AZALEA_FENCE_GATE);
        azaleaPool.stairs(ModBlocks.AZALEA_STAIRS);
        azaleaPool.slab(ModBlocks.AZALEA_SLAB);
        azaleaPool.pressurePlate(ModBlocks.AZALEA_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.AZALEA_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.AZALEA_TRAPDOOR);

        azaleaPool.family(ModBlocks.AZALEA_FAMILY);

        //Chestnut
        blockStateModelGenerator.registerLog(ModBlocks.CHESTNUT_LOG).log(ModBlocks.CHESTNUT_LOG).wood(ModBlocks.CHESTNUT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHESTNUT_LOG).log(ModBlocks.STRIPPED_CHESTNUT_LOG).wood(ModBlocks.STRIPPED_CHESTNUT_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHESTNUT_LEAVES);

        BlockStateModelGenerator.BlockTexturePool chestnutPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHESTNUT_PLANKS);
        chestnutPool.button(ModBlocks.CHESTNUT_BUTTON);
        chestnutPool.fence(ModBlocks.CHESTNUT_FENCE);
        chestnutPool.fenceGate(ModBlocks.CHESTNUT_FENCE_GATE);
        chestnutPool.stairs(ModBlocks.CHESTNUT_STAIRS);
        chestnutPool.slab(ModBlocks.CHESTNUT_SLAB);
        chestnutPool.pressurePlate(ModBlocks.CHESTNUT_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.CHESTNUT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHESTNUT_TRAPDOOR);

        chestnutPool.family(ModBlocks.CHESTNUT_FAMILY);

        //Crops
        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.ONION_CROP, OnionCropBlock.AGE, 0, 1, 2, 3);
        blockStateModelGenerator.registerCrop(ModBlocks.CABBAGE_CROP, CabbageCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MARSHMALLOW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_SLIGHTLY_COOKED, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_COOKED, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_PERFECT, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_BURNT, Models.HANDHELD);

        itemModelGenerator.register(ModItems.Burger, Models.GENERATED);
        //itemModelGenerator.register(ModItems.CABBAGE_SEEDS, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINCED_BEEF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_PATTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        //itemModelGenerator.register(ModItems.ONION, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANGING_AZALEA_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.HANGING_CHESTNUT_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.KNIFE, Models.HANDHELD);
    }
}
