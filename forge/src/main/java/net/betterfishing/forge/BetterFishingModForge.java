package net.betterfishing.forge;

import dev.architectury.platform.forge.EventBuses;
import net.betterfishing.BetterFishingMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BetterFishingMod.MOD_ID)
public class BetterFishingModForge {
    public BetterFishingModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(BetterFishingMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        BetterFishingMod.init();
    }
}
