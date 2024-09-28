package net.nikolas2k2020.competition.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nikolas2k2020.competition.CompetitionMod;
import net.nikolas2k2020.competition.block.ModBlocks;
import net.nikolas2k2020.competition.entity.ModBoats;
import net.nikolas2k2020.competition.item.advanced.ModFoodComponents;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    public static final Item MARSHMALLOW = registerItem("marshmallow", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW)));
    public static final Item MARSHMALLOW_STICK = registerItem("marshmallow_stick", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_BURNT = registerItem("marshmallow_stick_burnt", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_BURNED).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_COOKED = registerItem("marshmallow_stick_cooked", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_COOKED).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_PERFECT = registerItem("marshmallow_stick_perfect", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_PERFECT).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_SLIGHTLY_COOKED = registerItem("marshmallow_stick_slightly_cooked", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_SLIGHTLY_COOKED).maxCount(1)));

    public static final Item Burger = registerItem("burger", new Item(new Item.Settings().food(ModFoodComponents.BURGER).maxCount(16)));
    public static final Item CABBAGE_SEEDS = registerItem("cabbage_seeds", new AliasedBlockItem(ModBlocks.CABBAGE_CROP, new Item.Settings()));
    public static final Item CABBAGE = registerItem("cabbage", new Item(new Item.Settings().food(ModFoodComponents.CABBAGE)));
    public static final Item CABBAGE_LEAF = registerItem("cabbage_leaf", new Item(new Item.Settings().food(ModFoodComponents.CABBAGE_LEAF)));
    public static final Item MINCED_BEEF = registerItem("minced_beef", new Item(new Item.Settings().food(ModFoodComponents.MINCED_BEEF)));
    public static final Item BEEF_PATTY = registerItem("beef_patty", new Item(new Item.Settings().food(ModFoodComponents.BEEF_PATTY)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new Item.Settings()));
    public static final Item ONION = registerItem("onion", new AliasedBlockItem(ModBlocks.ONION_CROP, new Item.Settings().food(ModFoodComponents.ONION)));

    public static final Item KNIFE = registerItem("knife", new Item(new Item.Settings().maxCount(1)));

    public static final Item AZALEA_SIGN = registerItem("azalea_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_AZALEA_SIGN, ModBlocks.WALL_AZALEA_SIGN));
    public static final Item HANGING_AZALEA_SIGN = registerItem("azalea_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_AZALEA_SIGN, ModBlocks.WALL_HANGING_AZALEA_SIGN, new Item.Settings().maxCount(16)));

    public static final Item AZALEA_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.AZALEA_BOAT_ID, ModBoats.AZALEA_BOAT_KEY, false);
    public static final Item AZALEA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.AZALEA_CHEST_BOAT_ID, ModBoats.AZALEA_BOAT_KEY, true);


    public static final Item CHESTNUT_SIGN = registerItem("chestnut_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.STANDING_CHESTNUT_SIGN, ModBlocks.WALL_CHESTNUT_SIGN));
    public static final Item HANGING_CHESTNUT_SIGN = registerItem("chestnut_hanging_sign",
            new HangingSignItem(ModBlocks.HANGING_CHESTNUT_SIGN, ModBlocks.WALL_HANGING_CHESTNUT_SIGN, new Item.Settings().maxCount(16)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CompetitionMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CompetitionMod.LOGGER.info("Registering Mod Items for " + CompetitionMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //entries.add(RUBY);
            //entries.add(MARSHMALLOW);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            /*entries.add(MARSHMALLOW_STICK);
            entries.add(MARSHMALLOW_STICK_SLIGHTLY_COOKED);
            entries.add(MARSHMALLOW_STICK_COOKED);
            entries.add(MARSHMALLOW_STICK_PERFECT);
            entries.add(MARSHMALLOW_STICK_BURNT);*/
        });
    }
}
