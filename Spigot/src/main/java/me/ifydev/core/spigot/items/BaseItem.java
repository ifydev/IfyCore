package me.ifydev.core.spigot.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * @author Innectic
 * @since 10/5/2017
 */
@AllArgsConstructor
@RequiredArgsConstructor
public class BaseItem {

    @Getter private final String name;
    @Getter private final Material material;
    @Setter private int data = 0;

    public final ItemStack toItemStack() {
        return toItemStack(1);
    }

    public final ItemStack toItemStack(int amount) {
        return new ItemStack(material, amount, (short) data);
    }

    public short getData() {
        return (short) data;
    }
}
