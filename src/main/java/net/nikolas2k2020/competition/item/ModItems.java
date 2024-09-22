package net.nikolas2k2020.competition.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nikolas2k2020.competition.CompetitionMod;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));

    public static final Item MARSHMALLOW = registerItem("marshmallow", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW)));
    public static final Item MARSHMALLOW_STICK = registerItem("marshmallow_stick", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_BURNT = registerItem("marshmallow_stick_burnt", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_BURNED).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_COOKED = registerItem("marshmallow_stick_cooked", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_COOKED).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_PERFECT = registerItem("marshmallow_stick_perfect", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_PERFECT).maxCount(1)));
    public static final Item MARSHMALLOW_STICK_SLIGHTLY_COOKED = registerItem("marshmallow_stick_slightly_cooked", new Item(new Item.Settings().food(ModFoodComponents.MARSHMALLOW_STICK_SLIGHTLY_COOKED).maxCount(1)));

    public static final Item Burger = registerItem("burger", new Item(new Item.Settings().food(ModFoodComponents.BURGER).maxCount(16)));
    public static final Item CABBAGE_LEAF = registerItem("cabbage_leaf", new Item(new Item.Settings().food(ModFoodComponents.CABBAGE_LEAF)));
    public static final Item BEEF_PATTY = registerItem("beef_patty", new Item(new Item.Settings().food(ModFoodComponents.BEEF_PATTY)));
    public static final Item TOMATO = registerItem("tomato", new Item(new Item.Settings().food(ModFoodComponents.TOMATO)));
    public static final Item ONION = registerItem("onion", new Item(new Item.Settings().food(ModFoodComponents.ONION)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CompetitionMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CompetitionMod.LOGGER.info("Registering Mod Items for " + CompetitionMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            //entries.add(RUBY);
            entries.add(MARSHMALLOW);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(MARSHMALLOW_STICK);
            entries.add(MARSHMALLOW_STICK_SLIGHTLY_COOKED);
            entries.add(MARSHMALLOW_STICK_COOKED);
            entries.add(MARSHMALLOW_STICK_PERFECT);
            entries.add(MARSHMALLOW_STICK_BURNT);
        });
    }
}
