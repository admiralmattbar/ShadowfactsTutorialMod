package org.educraft.practice.reipces;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.educraft.practice.blocks.ModBlocks;
import org.educraft.practice.items.ModItems;

public class ModRecipes
{

    public static void init()
    {
        GameRegistry.addSmelting(ModBlocks.blocky_ore, new ItemStack(ModItems.thingy), 0.5f);
        ModBlocks.blocky_ore.initOreDict();
        ModItems.thingy.initOreDict();
    }

}
