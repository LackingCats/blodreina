package net.nospacehuman.blodreina.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;

public class FragmentOfTheHeavensItem extends FishingRodItem {
    public FragmentOfTheHeavensItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, @NotNull PlayerEntity user, @NotNull LivingEntity entity, Hand hand) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,20*20, 2, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,20*40, 2, false, false, false));
        user.sendMessage(Text.literal("bye"));

        return super.useOnEntity(itemStack, user, entity, hand);
    }
}

/*
    @Override
    public ActionResult useOnEntity(ItemStack itemStack, @NotNull PlayerEntity user, @NotNull LivingEntity entity, Hand hand) {
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,20*20, 2, false, false, false));
        entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,20*40, 2, false, false, false));
        user.sendMessage(Text.literal("bye"));

        itemStack.isDamageable();
        itemStack.damage(1, user, (p) -> p.sendToolBreakStatus(hand));

        return super.useOnEntity(itemStack, user, entity, hand);
 */

