package me.ifydev.core.spigot.items;

import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

/**
 * @author Innectic
 * @since 11/29/2018
 */
public class PotionConstants {

     /*
            POSITIVE EFFECTS
     */

    public static final PotionData PLAIN = new PotionData(PotionType.WATER, false, false);
    public static final PotionData AWKWARD = new PotionData(PotionType.AWKWARD, false, false);
    public static final PotionData THICK = new PotionData(PotionType.THICK, false, false);

    public static final PotionData MUNDANE = new PotionData(PotionType.MUNDANE, false, false);
    public static final PotionData MUNDANE_EXTENDED = new PotionData(PotionType.MUNDANE, true, false);

    public static final PotionData REGEN = new PotionData(PotionType.REGEN, false, false);
    public static final PotionData REGEN_EXTENDED = new PotionData(PotionType.REGEN, true, false);
    public static final PotionData REGEN_II = new PotionData(PotionType.REGEN, false, true);

    public static final PotionData SWIFTNESS = new PotionData(PotionType.SPEED, false, false);
    public static final PotionData SWIFTNESS_EXTENDED = new PotionData(PotionType.SPEED, true, false);
    public static final PotionData SWIFTNESS_II = new PotionData(PotionType.SPEED, false, true);

    public static final PotionData FIRE_RESIST = new PotionData(PotionType.FIRE_RESISTANCE, false, false);
    public static final PotionData FIRE_RESIST_EXTENDED = new PotionData(PotionType.FIRE_RESISTANCE, true, false);

    public static final PotionData HEALING = new PotionData(PotionType.INSTANT_HEAL, false, false);
    public static final PotionData HEALING_II = new PotionData(PotionType.INSTANT_HEAL, false, true);

    public static final PotionData NIGHT_VISION  = new PotionData(PotionType.NIGHT_VISION, false, false);
    public static final PotionData NIGHT_VISION_EXTENDED = new PotionData(PotionType.NIGHT_VISION, true, false);

    public static final PotionData STRENGTH = new PotionData(PotionType.STRENGTH, false, false);
    public static final PotionData STRENGTH_EXTENDED = new PotionData(PotionType.STRENGTH, true, false);
    public static final PotionData STRENGTH_II = new PotionData(PotionType.STRENGTH, false, true);

    public static final PotionData LEAPING = new PotionData(PotionType.JUMP, false, false);
    public static final PotionData LEAPING_EXTENDED = new PotionData(PotionType.JUMP, true, false);
    public static final PotionData LEAPING_II = new PotionData(PotionType.JUMP, false, true);

    public static final PotionData WATER_BREATHING = new PotionData(PotionType.WATER_BREATHING, false, false);
    public static final PotionData WATER_BREATHING_EXTENDED = new PotionData(PotionType.WATER_BREATHING, true, false);

    public static final PotionData INVISIBILITY = new PotionData(PotionType.INVISIBILITY, false, false);
    public static final PotionData INVISIBILITY_EXTENDED = new PotionData(PotionType.INVISIBILITY, true, false);

    public static final PotionData SLOW_FALLING = new PotionData(PotionType.SLOW_FALLING, false, false);
    public static final PotionData SLOW_FALLING_EXTENDED = new PotionData(PotionType.SLOW_FALLING, true, false);

    public static final PotionData LUCK = new PotionData(PotionType.LUCK, false, false);

    /*
            NEGATIVE EFFECTS
     */

    public static final PotionData POISON = new PotionData(PotionType.POISON, false, false);
    public static final PotionData POISON_EXTENDED = new PotionData(PotionType.POISON, true, false);
    public static final PotionData POISON_II = new PotionData(PotionType.POISON, false, true);

    public static final PotionData WEAKNESS = new PotionData(PotionType.WEAKNESS, false, false);
    public static final PotionData WEAKNESS_EXTENDED = new PotionData(PotionType.WEAKNESS, true, false);
    public static final PotionData WEAKNESS_II = new PotionData(PotionType.WEAKNESS, false, true);

    public static final PotionData SLOWNESS = new PotionData(PotionType.SLOWNESS, false, false);
    public static final PotionData SLOWNESS_EXTENDED = new PotionData(PotionType.SLOWNESS, true, false);
    public static final PotionData SLOWNESS_IV = new PotionData(PotionType.SLOWNESS, false, true);

    public static final PotionData HARMING = new PotionData(PotionType.INSTANT_DAMAGE, false, false);
    public static final PotionData HARMING_II = new PotionData(PotionType.INSTANT_DAMAGE, false, true);
}
