package org.educraft.practice.items.tool;

import net.minecraft.creativetab.CreativeTabs;
import org.educraft.practice.ModMain;

public class ItemSword extends net.minecraft.item.ItemSword {

    private String name;

    public ItemSword(String name, ToolMaterial material) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemSword setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }
}
