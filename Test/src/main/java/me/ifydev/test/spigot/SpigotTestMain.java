package me.ifydev.test.spigot;

import me.ifydev.core.spigot.items.BaseItem;
import me.ifydev.core.spigot.items.BlockRegistry;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionData;

/**
 * @author Innectic
 * @since 4/3/2020
 */
public class SpigotTestMain extends JavaPlugin implements Listener, CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(this);
    }

    @Override
    public void onDisable() {

    }

    private boolean check(Player player, Material material, PotionData data) {
        ItemStack item = player.getInventory().getItem(1);
        System.out.println("A");
        if (item == null  || item.getData() == null || item.getData().getItemType() == Material.AIR) return false;
        System.out.println("A");

        System.out.println(item.getData().getItemType());
        System.out.println(material);
        if (item.getData().getItemType() != material) return false;
        System.out.println("A");
        if (data != null) {
            System.out.println("A");
            PotionMeta meta = (PotionMeta) item.getItemMeta();
            System.out.println("A");
            if (meta == null) return false;
            System.out.println("A");
            return meta.getBasePotionData() == data;
        }
        System.out.println("C");
        return true;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (!(sender instanceof Player)) return false;

        Player player = (Player) sender;
        player.getInventory().clear();

        Bukkit.getScheduler().runTaskAsynchronously(this, () -> {
            for (Object o : BlockRegistry.getRegistered().stream().toArray()) {
                BaseItem item = (BaseItem) o;
                player.getInventory().setItem(1, item.toItemStack());
                if (!check(player, item.getMaterial(), item.getPotionData())) {
                    player.sendMessage(item.getName() + " is broken!");
                }
                player.getInventory().setItem(1, new ItemStack(Material.AIR));
                break;
            }
        });

        return false;
    }
}
