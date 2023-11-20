package net.betterfishing.fabriclike;

import net.betterfishing.client.BetterFishingClient;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class BetterFishingModFabricLikeClient {
    public static void init() {
        BetterFishingClient.init();
    }
}
