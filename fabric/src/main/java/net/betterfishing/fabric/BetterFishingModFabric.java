package net.betterfishing.fabric;

import net.betterfishing.fabriclike.BetterFishingModFabricLike;
import net.fabricmc.api.ModInitializer;

public class BetterFishingModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        BetterFishingModFabricLike.init();
    }
}
