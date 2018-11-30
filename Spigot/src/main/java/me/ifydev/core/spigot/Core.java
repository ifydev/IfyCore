package me.ifydev.core.spigot;

import me.ifydev.core.spigot.arrow.TippedArrowRegistry;
import me.ifydev.core.spigot.enchant.EnchantRegistry;
import me.ifydev.core.spigot.items.BlockRegistry;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Innectic
 * @since 10/5/2017
 */
public class Core extends JavaPlugin {

    private void runTaskWithMessages(Runnable runnable, String starting, String finished) {
        Bukkit.getScheduler().runTaskAsynchronously(this, () -> {
            getLogger().info(starting);
            runnable.run();
            getLogger().info(finished);
        });
    }

    @Override
    public void onEnable() {
        runTaskWithMessages(BlockRegistry::setup, "Initializing blocks...", "Done initializing blocks!");
        runTaskWithMessages(EnchantRegistry::setup, "Initializing enchants...", "Done initializing enchants!");
        runTaskWithMessages(TippedArrowRegistry::setup, "Initializing arrows...", "Done initializing arrows!");
    }

    @Override
    public void onDisable() {

    }
}
