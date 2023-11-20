package net.betterfishing.mixin;

import net.betterfishing.BetterFishingMod;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(Gui.class)
public class GuiMixin {
    @Shadow
    @Final
    private Minecraft minecraft;

    @Shadow
    private int screenWidth;
    @Shadow
    private int screenHeight;

    private static final ResourceLocation BACKGROUND_SPRITE = new ResourceLocation(BetterFishingMod.MOD_ID, "fishing_game/background");

    @Inject(at = @At("TAIL"), method = "renderHotbar")
    private void betterfishing$renderHotbar(float partialTick, GuiGraphics guiGraphics, CallbackInfo ci) {
        final Player player = minecraft.player;
        if(player == null)
            return;

        ItemStack stack =  ItemStack.EMPTY;
        if (!player.getMainHandItem().isEmpty() && player.getMainHandItem().getItem() == Items.FISHING_ROD) {
            stack = player.getMainHandItem();
        } else if (!player.getOffhandItem().isEmpty() && player.getOffhandItem().getItem() == Items.FISHING_ROD) {
            stack = player.getOffhandItem();
        }

        if(stack != ItemStack.EMPTY) {
            guiGraphics.drawString(minecraft.font, "Hello from BetterFishing!", 20, 20, 0xFFFFFF);
            guiGraphics.blitSprite(BACKGROUND_SPRITE, ((this.screenWidth - 16) / 2)-20, (this.screenHeight - 96) / 2,  16, 96);
        }

    }
}
