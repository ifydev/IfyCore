package me.ifydev.core.spigot.book;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Innectic
 * @since 10/15/2017
 */
@Getter
public class BookBuilder {
    private String title;
    private String author;
    private List<String> pages;

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder pages(List<String> pages) {
        this.pages = pages;
        return this;
    }

    public BookBuilder pages(String... pages) {
        this.pages = new ArrayList<>(Arrays.asList(pages));
        return this;
    }

    public ItemStack build() {
        ItemStack itemStack = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta meta = (BookMeta) itemStack.getItemMeta();
        meta.setTitle(title);
        meta.setAuthor(author);
        meta.setPages(pages);
        itemStack.setItemMeta(meta);
        return itemStack;
    }
}
