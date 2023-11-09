package net.betterfishing.fabric;

import net.betterfishing.BetterFishingExpectPlatform;
import org.quiltmc.loader.api.QuiltLoader;

import java.nio.file.Path;

public class BetterFishingExpectPlatformImpl {
    /**
     * This is our actual method to {@link BetterFishingExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return QuiltLoader.getConfigDir();
    }
}
