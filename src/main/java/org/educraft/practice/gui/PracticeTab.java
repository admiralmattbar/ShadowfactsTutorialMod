package org.educraft.practice.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.educraft.practice.References;
import org.educraft.practice.items.ModItems;

public class PracticeTab extends CreativeTabs {

    public PracticeTab() {
        super(References.modId);
        setBackgroundImageName("item_search.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.thingy);
    }

    @Override
    public boolean hasSearchBar()
    {
        return true;
    }
}
