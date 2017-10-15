package me.ifydev.core.spigot.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SpawnEggMeta;

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
        // HACK: Make llama eggs work...
        if (material == Material.MONSTER_EGG && data == 103) {
            ItemStack item = new ItemStack(Material.MONSTER_EGG, amount);
            SpawnEggMeta meta = (SpawnEggMeta) item.getItemMeta();
            meta.setSpawnedType(EntityType.LLAMA);
            item.setItemMeta(meta);
            return item;
        }
        return new ItemStack(material, amount, (short) data);
    }

    public short getData() {
        return (short) data;
    }
}
