package me.ifydev.core.spigot.enchant;

import lombok.Getter;
import me.ifydev.core.spigot.items.BaseItem;
import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Innectic
 * @since 10/5/2017
 */
public class EnchantRegistry {

    @Getter private static List<BaseEnchant> enchants = new ArrayList<>();

    private static boolean setup = false;

    public static void setup() {
        if (setup) return;
        setup = true;

        enchants.add(new BaseEnchant("Aqua Affinity", Enchantment.WATER_WORKER));
        enchants.add(new BaseEnchant("Bane of Athropods", Enchantment.DAMAGE_ARTHROPODS));
        enchants.add(new BaseEnchant("Blast Protection", Enchantment.PROTECTION_EXPLOSIONS));
        enchants.add(new BaseEnchant("Curse of Binding", Enchantment.BINDING_CURSE));
        enchants.add(new BaseEnchant("Curse of Vanishing", Enchantment.VANISHING_CURSE));
        enchants.add(new BaseEnchant("Depth Strider", Enchantment.DEPTH_STRIDER));
        enchants.add(new BaseEnchant("Efficiency", Enchantment.DIG_SPEED));
        enchants.add(new BaseEnchant("Feather Falling", Enchantment.PROTECTION_FALL));
        enchants.add(new BaseEnchant("Fire Aspect", Enchantment.FIRE_ASPECT));
        enchants.add(new BaseEnchant("Fire Protection", Enchantment.PROTECTION_FIRE));
        enchants.add(new BaseEnchant("Flame", Enchantment.ARROW_FIRE));
        enchants.add(new BaseEnchant("Fortune", Enchantment.LOOT_BONUS_BLOCKS));
        enchants.add(new BaseEnchant("Frost Walker", Enchantment.FROST_WALKER));
        enchants.add(new BaseEnchant("Infinity", Enchantment.ARROW_INFINITE));
        enchants.add(new BaseEnchant("KnockBack", Enchantment.KNOCKBACK));
        enchants.add(new BaseEnchant("Looting", Enchantment.LOOT_BONUS_MOBS));
        enchants.add(new BaseEnchant("Luck of the Sea", Enchantment.LUCK));
        enchants.add(new BaseEnchant("Lure", Enchantment.LURE));
        enchants.add(new BaseEnchant("Mending", Enchantment.MENDING));
        enchants.add(new BaseEnchant("Power", Enchantment.ARROW_DAMAGE));
        enchants.add(new BaseEnchant("Projectile Protection", Enchantment.PROTECTION_PROJECTILE));
        enchants.add(new BaseEnchant("Protection", Enchantment.PROTECTION_ENVIRONMENTAL));
        enchants.add(new BaseEnchant("Punch", Enchantment.ARROW_KNOCKBACK));
        enchants.add(new BaseEnchant("Respiration", Enchantment.OXYGEN));
        enchants.add(new BaseEnchant("Sharpness", Enchantment.DAMAGE_ALL));
        enchants.add(new BaseEnchant("Silk Touch", Enchantment.SILK_TOUCH));
        enchants.add(new BaseEnchant("Smite", Enchantment.DAMAGE_UNDEAD));
        enchants.add(new BaseEnchant("Sweeping Edge", Enchantment.SWEEPING_EDGE));
        enchants.add(new BaseEnchant("Thorns", Enchantment.THORNS));
        enchants.add(new BaseEnchant("Unbreaking", Enchantment.DURABILITY));
    }

    public static Optional<BaseEnchant> find(String name) {
        List<BaseEnchant> items = enchants.stream().filter(item -> item.getName()
                .equalsIgnoreCase(name)).collect(Collectors.toList());
        if (items.size() > 1) {
            System.out.println("Somehow got multiple enchants from search result? " + name);
            return Optional.empty();
        }
        return items.size() == 1 ? Optional.of(items.get(0)) : Optional.empty();
    }

}
