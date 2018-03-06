package org.educraft.practice.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import org.educraft.practice.ModMain;

public class BlockHelper extends Block {

    protected String name;

    public BlockHelper(String name, Material materialIn)
    {
        super(materialIn);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ModMain.ct);
    }

    public void registerItemModel(Item itemBlock)
    {
        ModMain.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockHelper setCreativeTab(CreativeTabs ct)
    {
        super.setCreativeTab(ct);
        return this;
    }

}
