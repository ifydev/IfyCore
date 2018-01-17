package me.ifydev.core.api.commands.annotation;

/**
 * @author Innectic
 * @since 01/16/2018
 */
public @interface Command {
    String name();
    String[] permissions() default {};
    String description() default "This command is missing a description";
    String[] alias() default {};
}
