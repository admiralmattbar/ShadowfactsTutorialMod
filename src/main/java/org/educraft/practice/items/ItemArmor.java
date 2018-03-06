package org.educraft.practice.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import org.educraft.practice.ModMain;

public class ItemArmor extends net.minecraft.item.ItemArmor {

    private String name;

    public ItemArmor(ArmorMaterial materialIn, EntityEquipmentSlot slot, String name) {
        super(materialIn, 0, slot);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;
    }

    public void registerItemModel() {
        ModMain.proxy.registerItemRenderer(this, 0, name);
    }

}
