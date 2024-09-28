package net.nikolas2k2020.competition.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.nikolas2k2020.competition.CompetitionMod;

public class ModBoats {
    public static final Identifier AZALEA_BOAT_ID = Identifier.of(CompetitionMod.MOD_ID, "azalea_boat");
    public static final Identifier AZALEA_CHEST_BOAT_ID = Identifier.of(CompetitionMod.MOD_ID, "azalea_chest_boat");

    public static final RegistryKey<TerraformBoatType> AZALEA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AZALEA_BOAT_ID);

    public static void registerBoats() {
    }
}
