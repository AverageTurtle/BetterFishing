package net.betterfishing.client;

import net.betterfishing.BetterFishingMod;
import net.betterfishing.mixin.GuiMixin;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Environment(EnvType.CLIENT)
public class BetterFishingReloadListener extends SimplePreparableReloadListener {
    @Override
    protected Object prepare(ResourceManager resourceManager, ProfilerFiller profiler) {
        return null;
    }

    @Override
    protected void apply(Object object, ResourceManager resourceManager, ProfilerFiller profiler) {

    }
}
