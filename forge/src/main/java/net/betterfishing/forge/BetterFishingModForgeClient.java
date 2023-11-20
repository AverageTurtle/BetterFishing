package net.betterfishing.forge;

import net.betterfishing.BetterFishingMod;
import net.betterfishing.client.BetterFishingClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BetterFishingMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterFishingModForgeClient {
    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        BetterFishingClient.init();
    }
}
