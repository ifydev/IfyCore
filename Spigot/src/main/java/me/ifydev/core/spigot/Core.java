package me.ifydev.core.spigot;

import me.ifydev.core.spigot.enchant.EnchantRegistry;
import me.ifydev.core.spigot.items.BlockRegistry;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Innectic
 * @since 10/5/2017
 */
public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        BlockRegistry.setup();
        EnchantRegistry.setup();
    }

    @Override
    public void onDisable() {

    }
}
