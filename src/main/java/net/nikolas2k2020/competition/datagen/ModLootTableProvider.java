package net.nikolas2k2020.competition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;
import net.nikolas2k2020.competition.block.ModBlocks;
import net.nikolas2k2020.competition.block.custom.CabbageCropBlock;
import net.nikolas2k2020.competition.block.custom.OnionCropBlock;
import net.nikolas2k2020.competition.block.custom.TomatoCropBlock;
import net.nikolas2k2020.competition.item.ModItems;

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

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 3));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder));
        BlockStatePropertyLootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.ONION_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(OnionCropBlock.AGE, 3));
        addDrop(ModBlocks.ONION_CROP, cropDrops(ModBlocks.ONION_CROP, ModItems.ONION, ModItems.ONION, builder1));
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CABBAGE_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(CabbageCropBlock.AGE, 7));
        addDrop(ModBlocks.CABBAGE_CROP, cropDrops(ModBlocks.CABBAGE_CROP, ModItems.CABBAGE, ModItems.CABBAGE_SEEDS, builder2));
    }
}
