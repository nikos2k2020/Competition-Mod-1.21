package net.nikolas2k2020.competition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.nikolas2k2020.competition.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.AZALEA_LOG);
        addDrop(ModBlocks.STRIPPED_AZALEA_LOG);
        addDrop(ModBlocks.AZALEA_WOOD);
        addDrop(ModBlocks.STRIPPED_AZALEA_WOOD);

        addDrop(ModBlocks.AZALEA_PLANKS);
        addDrop(ModBlocks.AZALEA_STAIRS);
        addDrop(ModBlocks.AZALEA_SLAB, slabDrops(ModBlocks.AZALEA_SLAB));
        addDrop(ModBlocks.AZALEA_BUTTON);
        addDrop(ModBlocks.AZALEA_PRESSURE_PLATE);

        addDrop(ModBlocks.AZALEA_FENCE);
        addDrop(ModBlocks.AZALEA_FENCE_GATE);

        addDrop(ModBlocks.AZALEA_DOOR, doorDrops(ModBlocks.AZALEA_DOOR));
        addDrop(ModBlocks.AZALEA_TRAPDOOR);
    }
}
