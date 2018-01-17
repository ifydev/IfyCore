package me.ifydev.core.api.commands.annotation;

import me.ifydev.core.api.commands.CoreCommand;

/**
 * @author Innectic
 * @since 01/16/2018
 */
public @interface SubCommand {
    Class<? extends CoreCommand> value();
}
