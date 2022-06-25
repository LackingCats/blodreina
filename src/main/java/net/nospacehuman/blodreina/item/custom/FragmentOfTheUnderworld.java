package net.nospacehuman.blodreina.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class FragmentOfTheUnderworld extends Item {
    public FragmentOfTheUnderworld(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(@NotNull World world, @NotNull PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        world.breakBlock(user.getBlockPos(), true, user, 140);

        return TypedActionResult.success(itemStack, world.isClient());
    }
}
