package me.ifydev.core.spigot;

import lombok.Getter;
import me.ifydev.core.api.CoreAPI;
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
    }

    @Override
    public void onDisable() {

    }
}
