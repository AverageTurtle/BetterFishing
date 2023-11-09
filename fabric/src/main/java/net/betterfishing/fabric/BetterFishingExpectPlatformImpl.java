package net.betterfishing.fabric;

import net.betterfishing.BetterFishingExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class BetterFishingExpectPlatformImpl {
    /**
     * This is our actual method to {@link BetterFishingExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
