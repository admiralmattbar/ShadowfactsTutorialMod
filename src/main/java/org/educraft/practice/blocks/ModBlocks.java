package org.educraft.practice.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import org.educraft.practice.ModMain;
import org.educraft.practice.blocks.counter.BlockCounter;
import org.educraft.practice.blocks.pedestal.BlockPedestal;

public class ModBlocks
{

    public static BlockHelper blocky = new BlockHelper("blocky", Material.IRON);
    public static BlockCropHealthy crop_healthy = new BlockCropHealthy();
    public static BlockOre blocky_ore = new BlockOre("blocky_ore", 0.8f, 1.2f, "oreBlocky").setCreativeTab(ModMain.ct);
    public static BlockPedestal pedestal = new BlockPedestal();
    public static BlockCounter counter = new BlockCounter().setCreativeTab(ModMain.ct);

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll(
                blocky,
                crop_healthy,
                blocky_ore,
                pedestal,
                counter
        );

        GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
        GameRegistry.registerTileEntity(pedestal.getTileEntityClass(), pedestal.getRegistryName().toString());

    }

    public static void registerItemBlock(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                blocky.createItemBlock(),
                blocky_ore.createItemBlock(),
                pedestal.createItemBlock(),
                counter.createItemBlock()
        );

    }

    public static void registerModels()
    {
        blocky.registerItemModel(Item.getItemFromBlock(blocky));
        blocky_ore.registerItemModel(Item.getItemFromBlock(blocky_ore));
        pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
        counter.registerItemModel(Item.getItemFromBlock(counter));
    }
}
