package net.betterfishing.mixin;

import net.betterfishing.BetterFishingMod;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingRodItem.class)
public class FishingRodMixin {

    @Inject(at = @At("HEAD"), cancellable = true, method = "use(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResultHolder;")
    public void betterfishing$use(Level level, Player player, InteractionHand usedHand, CallbackInfoReturnable<InteractionResultHolder<ItemStack> > cir) {
        ItemStack itemStack = player.getItemInHand(usedHand);
        BetterFishingMod.LOGGER.info("Fishing!");
        cir.setReturnValue( InteractionResultHolder.sidedSuccess(itemStack, level.isClientSide()) );
    }
}
