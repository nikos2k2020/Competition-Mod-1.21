package net.nikolas2k2020.competition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.nikolas2k2020.competition.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.AZALEA_LOG)
                .add(ModBlocks.STRIPPED_AZALEA_LOG)
                .add(ModBlocks.AZALEA_WOOD)
                .add(ModBlocks.STRIPPED_AZALEA_WOOD)
                .add(ModBlocks.AZALEA_PLANKS)
                .add(ModBlocks.AZALEA_STAIRS)
                .add(ModBlocks.AZALEA_SLAB)
                .add(ModBlocks.AZALEA_BUTTON)
                .add(ModBlocks.AZALEA_FENCE)
                .add(ModBlocks.AZALEA_FENCE_GATE)
                .add(ModBlocks.AZALEA_TRAPDOOR)
                .add(ModBlocks.AZALEA_PRESSURE_PLATE)
                .add(ModBlocks.AZALEA_DOOR);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.AZALEA_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.AZALEA_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.AZALEA_LOG)
                .add(ModBlocks.STRIPPED_AZALEA_LOG)
                .add(ModBlocks.AZALEA_WOOD)
                .add(ModBlocks.STRIPPED_AZALEA_WOOD);
    }
}
