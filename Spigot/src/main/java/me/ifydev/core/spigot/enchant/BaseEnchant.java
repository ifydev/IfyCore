package me.ifydev.core.spigot.enchant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bukkit.enchantments.Enchantment;

/**
 * @author Innectic
 * @since 10/5/2017
 */
@AllArgsConstructor
@Getter
public class BaseEnchant {
    private String name;
    private Enchantment enchantment;
}
