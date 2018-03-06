package org.educraft.practice.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import org.educraft.practice.items.tool.ItemSword;
import net.minecraftforge.registries.IForgeRegistry;
import org.educraft.practice.ModMain;

public class ModItems
{

    public static ItemOre thingy = new ItemOre("thingy", "oreThingy");
    public static ItemHealthySeed healthy_seed = new ItemHealthySeed();
    public static ItemHealthy healthy = new ItemHealthy();
    public static ItemSword thingy_sword = new ItemSword("thingy_sword", ModMain.thingyToolMaterial).setCreativeTab(ModMain.ct);
    public static ItemArmor thingy_helmet = new ItemArmor(ModMain.thingyArmorMaterial, EntityEquipmentSlot.HEAD, "thingy_helmet");
    public static ItemArmor thingy_chestplate = new ItemArmor(ModMain.thingyArmorMaterial, EntityEquipmentSlot.CHEST, "thingy_chestplate");
    public static ItemArmor thingy_leggings = new ItemArmor(ModMain.thingyArmorMaterial, EntityEquipmentSlot.LEGS, "thingy_leggings");
    public static ItemArmor thingy_boots = new ItemArmor(ModMain.thingyArmorMaterial, EntityEquipmentSlot.FEET, "thingy_boots");


    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(
                thingy,
                healthy_seed,
                healthy,
                thingy_sword,
                thingy_helmet,
                thingy_chestplate,
                thingy_leggings,
                thingy_boots
        );
    }

    public static void registerModels()
    {
        thingy.registerItemModel();
        healthy_seed.registerItemModel();
        healthy.registerItemModel();
        thingy_sword.registerItemModel();
        thingy_helmet.registerItemModel();
        thingy_chestplate.registerItemModel();
        thingy_leggings.registerItemModel();
        thingy_boots.registerItemModel();
    }
}
