package net.nikolas2k2020.competition.item.advanced;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nikolas2k2020.competition.CompetitionMod;
import net.nikolas2k2020.competition.block.ModBlocks;
import net.nikolas2k2020.competition.item.ModItems;

public class ModItemGroups {
    public static final ItemGroup MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompetitionMod.MOD_ID, "mod_blocks_group"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.AZALEA_LOG)).displayName(Text.translatable("itemgroup.competition.mod_blocks_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AZALEA_LOG);
                        entries.add(ModBlocks.AZALEA_WOOD);
                        entries.add(ModBlocks.STRIPPED_AZALEA_LOG);
                        entries.add(ModBlocks.STRIPPED_AZALEA_WOOD);
                        entries.add(ModBlocks.AZALEA_PLANKS);
                        entries.add(ModBlocks.AZALEA_STAIRS);
                        entries.add(ModBlocks.AZALEA_SLAB);
                        entries.add(ModBlocks.AZALEA_FENCE);
                        entries.add(ModBlocks.AZALEA_FENCE_GATE);
                        entries.add(ModBlocks.AZALEA_DOOR);
                        entries.add(ModBlocks.AZALEA_TRAPDOOR);
                        entries.add(ModBlocks.AZALEA_PRESSURE_PLATE);
                        entries.add(ModBlocks.AZALEA_BUTTON);
                    }).build());

    public static final ItemGroup MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompetitionMod.MOD_ID, "mod_items_group"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.Burger)).displayName(Text.translatable("itemgroup.competition.mod_items_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Burger);
                        entries.add(ModItems.BEEF_PATTY);
                        entries.add(ModItems.CABBAGE_LEAF);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.ONION);
                    }).build());


    public static void registerItemGroups() {
        CompetitionMod.LOGGER.info("Registering Item Groups for " + CompetitionMod.MOD_ID);
    }
}
