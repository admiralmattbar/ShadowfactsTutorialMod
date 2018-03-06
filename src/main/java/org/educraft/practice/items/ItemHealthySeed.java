package org.educraft.practice.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import org.educraft.practice.ModMain;
import org.educraft.practice.blocks.ModBlocks;

public class ItemHealthySeed extends ItemSeeds
{
    String name = "healthy_seed";

    public ItemHealthySeed() {
        super(ModBlocks.crop_healthy, Blocks.FARMLAND);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModMain.ct);
    }

    public void registerItemModel()
    {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }


}
