package org.educraft.practice;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import org.educraft.practice.blocks.ModBlocks;
import org.educraft.practice.gui.PracticeTab;
import org.educraft.practice.items.ModItems;
import org.educraft.practice.network.PacketRequestUpdatePedestal;
import org.educraft.practice.network.PacketUpdatePedestal;
import org.educraft.practice.proxy.CommonProxy;
import org.educraft.practice.reipces.ModRecipes;
import org.educraft.practice.world.ModWorldGen;

@Mod(modid = References.modId, name = References.name, version = References.version)
public class ModMain {

    @Mod.Instance(References.modId)
    public static ModMain instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS_, serverSide = References.SERVER_PROXY_CLASS_)
    public static CommonProxy proxy;


    public static final Item.ToolMaterial thingyToolMaterial = EnumHelper.addToolMaterial(
            "THINGY", 2, 500, 6, 2, 14
    );

    public static final ItemArmor.ArmorMaterial thingyArmorMaterial = EnumHelper.addArmorMaterial(
            "THINGY", References.modId + ":thingy", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5f
    );

    public static SimpleNetworkWrapper network;

    public static PracticeTab ct = new PracticeTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());
        network = NetworkRegistry.INSTANCE.newSimpleChannel(References.modId);
        network.registerMessage(new PacketUpdatePedestal.Handler(), PacketUpdatePedestal.class, 0, Side.CLIENT);
        network.registerMessage(new PacketRequestUpdatePedestal.Handler(), PacketRequestUpdatePedestal.class, 1, Side.SERVER);
        proxy.registerRenderers();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlock(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event)
        {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            ModBlocks.register(event.getRegistry());
        }

    }
}
