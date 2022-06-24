package net.nospacehuman.blodreina.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.nospacehuman.blodreina.lib0.Number;
import org.jetbrains.annotations.NotNull;

public class TanzaniteBomberItem extends Item {
    public TanzaniteBomberItem(Settings settings) {
        super(settings);
    }

    private int getRandomNumber() {
        return Random.createLocal().nextBetween(1, 48);
    }

    public double positioningX(@NotNull PlayerEntity user) {
        return user.getX() + getRandomNumber();
    }

    public double positioningY(@NotNull PlayerEntity user) {
        return user.getY() + getRandomNumber();
    }

    public double positioningZ(@NotNull PlayerEntity user) {
        return user.getZ() + getRandomNumber();
    }



    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.BLOCK_AMETHYST_BLOCK_BREAK, SoundCategory.NEUTRAL, 0.5F, 2);

        if(!world.isClient) {

            world.createExplosion(user, positioningX(user), positioningY(user), positioningZ(user), Number.number(), true, Explosion.DestructionType.BREAK);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if(!user.getAbilities().creativeMode) {
            itemStack.decrement(1);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
