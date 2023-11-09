package net.betterfishing;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("UnstableApiUsage")
public class BetterFishingMod {
    public static final String MOD_ID = "betterfishing";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    // We can use this if we don't want to use DeferredRegister
    // public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    // Registering a new creative tab
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> BETTERFISHING_TAB = TABS.register("betterfishing_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".betterfishing_tab"),
                    () -> new ItemStack(BetterFishingMod.TEST_ITEM.get())));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> TEST_ITEM = ITEMS.register("test_item", () ->
            new Item(new Item.Properties().arch$tab(BetterFishingMod.BETTERFISHING_TAB)));
    
    public static void init() {
        TABS.register();
        ITEMS.register();
        
        System.out.println(BetterFishingExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
