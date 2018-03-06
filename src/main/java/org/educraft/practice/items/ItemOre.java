package org.educraft.practice.items;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOre extends ItemHelper
{
    String oreName;

    public ItemOre(String name, String oreName)
    {
        super(name);
        this.oreName = oreName;
    }

    public void initOreDict()
    {
        OreDictionary.registerOre(oreName, this);
    }
}
