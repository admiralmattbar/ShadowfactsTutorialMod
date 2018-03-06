package org.educraft.practice.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import org.educraft.practice.ModMain;

public class ItemHealthy extends ItemFood {

    protected String name = "healthy";

    public ItemHealthy()
    {
        super(3, 0.6f, false);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModMain.ct);
    }

    public void registerItemModel()
    {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }

}
