package net.nikolas2k2020.competition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.nikolas2k2020.competition.block.ModBlocks;
import net.nikolas2k2020.competition.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AZALEA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

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
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_SLIGHTLY_COOKED, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_COOKED, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_PERFECT, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MARSHMALLOW_STICK_BURNT, Models.HANDHELD);

        itemModelGenerator.register(ModItems.Burger, Models.GENERATED);
        itemModelGenerator.register(ModItems.CABBAGE_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEEF_PATTY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOMATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONION, Models.GENERATED);
    }
}
