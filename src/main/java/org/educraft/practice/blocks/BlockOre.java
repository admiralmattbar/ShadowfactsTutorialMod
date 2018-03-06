package org.educraft.practice.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class BlockOre extends BlockHelper
{

    private String oreName;

    public BlockOre(String name, float hardness, float resistance, String oreName) {
        super(name, Material.ROCK);
        this.oreName = oreName;
        setHardness(hardness);
        setResistance(resistance);
    }

    public void initOreDict()
    {
        OreDictionary.registerOre(oreName, this);
    }

    @Override
    public BlockOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
