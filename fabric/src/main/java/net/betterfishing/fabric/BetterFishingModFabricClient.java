package net.betterfishing.fabric;

import net.betterfishing.fabriclike.BetterFishingModFabricLikeClient;
import net.fabricmc.api.ClientModInitializer;

public class BetterFishingModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BetterFishingModFabricLikeClient.init();
    }
}
