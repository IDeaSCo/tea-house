package com.teastall.interview;

import java.util.Arrays;
import java.util.List;

public class MenuCard {
    private final List<MenuItem> menuItems;
    private final Formatter formatter;

    public MenuCard() {
        MenuItem blackTea = new MenuItem("Black Tea", 15.00);
        MenuItem greenTea = new MenuItem("Green Tea", 20.00);
        MenuItem masalaTea = new MenuItem("Masala Tea", 25.00);
        menuItems = Arrays.asList(blackTea, greenTea, masalaTea);
        formatter = new Formatter(menuItems);
    }

    public String show() {
           return formatter.showMenuCard();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
