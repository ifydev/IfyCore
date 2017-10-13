package me.ifydev.core.spigot.arrow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

/**
 * @author Innectic
 * @since 10/13/2017
 */
@AllArgsConstructor
@Getter
public class TippedArrowBuilder {
    private PotionType type;
    private boolean extended;
    private boolean amplified;

    /**
     * Get the itemstack from the provided data
     *
     * @return a tipped arrow containing all the extra meta
     */
    public ItemStack get() {
//        ItemStack item = new ItemStack(Material.TIPPED_ARROW);
//        PotionMeta meta = (PotionMeta) item.getItemMeta();
//        meta.addCustomEffect(new PotionEffect(type, time * 20, amplifier), true);
//        item.setItemMeta(meta);
//        return item;
        ItemStack item = new ItemStack(Material.TIPPED_ARROW);
        PotionMeta meta = (PotionMeta) item.getItemMeta();
        meta.setBasePotionData(new PotionData(type, extended, amplified));
        item.setItemMeta(meta);
        return item;
    }
}
