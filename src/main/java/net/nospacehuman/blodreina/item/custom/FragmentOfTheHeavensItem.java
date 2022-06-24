package net.nospacehuman.blodreina.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;

public class FragmentOfTheHeavensItem extends Item {
    public FragmentOfTheHeavensItem(Settings settings) {
        super(settings);
    }

    public static int rand() {
        int min = 1;
        int max = 100;
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, @NotNull PlayerEntity user, @NotNull LivingEntity entity, Hand hand) {
        if(rand() > 50) { //50 percent chance
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION,20*20, 2, false, false, false));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,20*40, 2, false, false, false));
            user.sendMessage(Text.literal("bye"));
        } else {
            user.sendMessage(Text.literal("u are not worthy"));
        }
        return super.useOnEntity(itemStack, user, entity, hand);
    }
}


