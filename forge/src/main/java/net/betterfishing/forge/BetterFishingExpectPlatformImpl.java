package net.betterfishing.forge;

import net.betterfishing.BetterFishingExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class BetterFishingExpectPlatformImpl {
    /**
     * This is our actual method to {@link BetterFishingExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
