package me.ifydev.core.spigot.items;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;

import java.util.Optional;

/**
 * @author Innectic
 * @since 10/5/2017
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class BaseItem {

    @Getter private final String name;
    @Getter private final Material material;
    @Getter private Optional<PotionData> potionData;

    public final ItemStack toItemStack() {
        return toItemStack(1);
    }

    public final ItemStack toItemStack(int amount) {
        ItemStack stack = new ItemStack(material, amount);

        potionData.ifPresent(data -> {
            PotionMeta meta = (PotionMeta) stack.getItemMeta();
            meta.setBasePotionData(data);
        });
        return stack;
    }
}
