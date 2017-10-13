package me.ifydev.core.spigot.arrow;

import org.bukkit.potion.PotionType;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Innectic
 * @since 10/13/2017
 */
public class TippedArrowRegistry {
    private static  Map<String, TippedArrowBuilder> registered = new HashMap<>();

    public static void setup() {
        registered.put("poison arrow", new TippedArrowBuilder(PotionType.POISON, true, false));
        registered.put("weakness arrow", new TippedArrowBuilder(PotionType.WEAKNESS, false, false));
        registered.put("slowness arrow", new TippedArrowBuilder(PotionType.SLOWNESS, false, false));
    }

    public static Optional<TippedArrowBuilder> find(String name) {
        return Optional.ofNullable(registered.getOrDefault(name.toLowerCase(), null));
    }
}
