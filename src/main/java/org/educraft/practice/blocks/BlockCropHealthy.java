package org.educraft.practice.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import org.educraft.practice.items.ModItems;

public class BlockCropHealthy extends BlockCrops
{
    public BlockCropHealthy()
    {
        String name = "crop_healthy";
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    protected Item getSeed()
    {
        return ModItems.healthy_seed;
    }

    @Override
    protected Item getCrop()
    {
        return ModItems.healthy;
    }
}
