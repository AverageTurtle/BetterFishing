package net.betterfishing.quilt;

import net.betterfishing.fabriclike.BetterFishingModFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class BetterFishingModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        BetterFishingModFabricLike.init();
    }
}
