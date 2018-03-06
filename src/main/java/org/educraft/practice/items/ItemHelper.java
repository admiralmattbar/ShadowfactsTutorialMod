package org.educraft.practice.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.educraft.practice.ModMain;

public class ItemHelper extends Item {

    protected String name;

    public ItemHelper(String name)
    {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModMain.ct);
    }

    public void registerItemModel()
    {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemHelper setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }
}
