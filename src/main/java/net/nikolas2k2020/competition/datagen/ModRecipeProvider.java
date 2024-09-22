package net.nikolas2k2020.competition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.nikolas2k2020.competition.block.ModBlocks;
import net.nikolas2k2020.competition.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {


    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //Blocks
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_SLAB, ModBlocks.AZALEA_PLANKS);
        offerPressurePlateRecipe(exporter, ModBlocks.AZALEA_PRESSURE_PLATE, ModBlocks.AZALEA_PLANKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_PLANKS, 4).input(ModBlocks.AZALEA_LOG).criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_LOG),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_LOG)).criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_LOG),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_LOG)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_STAIRS, 4).pattern("b  ").pattern("bb ").pattern("bbb")
                .input('b', ModBlocks.AZALEA_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_DOOR, 3).pattern("bb").pattern("bb").pattern("bb")
                .input('b', ModBlocks.AZALEA_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_TRAPDOOR, 2).pattern("bbb").pattern("bbb")
                .input('b', ModBlocks.AZALEA_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_FENCE, 3).pattern("b#b").pattern("b#b")
                .input('b', ModBlocks.AZALEA_PLANKS)
                .input('#', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_FENCE_GATE).pattern("#b#").pattern("#b#")
                .input('b', ModBlocks.AZALEA_PLANKS)
                .input('#', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZALEA_BUTTON).pattern("b")
                .input('b', ModBlocks.AZALEA_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.AZALEA_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AZALEA_PLANKS))
                .offerTo(exporter);

        //Items
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MARSHMALLOW_STICK).pattern("#").pattern("b")
                .input('#', ModItems.MARSHMALLOW)
                .input('b', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MARSHMALLOW),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MARSHMALLOW))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.Burger).pattern("!@#").pattern("bn ")
                .input('!', Items.BREAD)
                .input('@', ModItems.BEEF_PATTY)
                .input('#', ModItems.CABBAGE_LEAF)
                .input('b', ModItems.TOMATO)
                .input('n', ModItems.ONION)
                .criterion(FabricRecipeProvider.hasItem(Items.BREAD),
                        FabricRecipeProvider.conditionsFromItem(Items.BREAD))
                .criterion(FabricRecipeProvider.hasItem(ModItems.BEEF_PATTY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.BEEF_PATTY))
                .criterion(FabricRecipeProvider.hasItem(ModItems.CABBAGE_LEAF),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CABBAGE_LEAF))
                .criterion(FabricRecipeProvider.hasItem(ModItems.TOMATO),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TOMATO))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ONION),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ONION))
                .offerTo(exporter);
    }
}
