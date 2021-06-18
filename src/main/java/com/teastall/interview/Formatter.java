package com.teastall.interview;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Formatter {
    private static final String NEW_LINE_CHARACTER = "\n";
    private static final String PUNCH_LINE = "Tea which has taste of relaxation!!!!!";
    private static final String SEPERATING_LINE = "---------------------------------------------------------------";
    private static final String TITLE = "No.\t\tItem\t\t\tPrice";
    private List<MenuItem> menuItems;

    public Formatter(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String showMenuCard() {
        final StringBuilder menuCardDetails = new StringBuilder();
        menuCardDetails.append(PUNCH_LINE);
        menuCardDetails.append(NEW_LINE_CHARACTER);
        menuCardDetails.append(SEPERATING_LINE);
        menuCardDetails.append(NEW_LINE_CHARACTER);
        menuCardDetails.append(TITLE);
        menuCardDetails.append(NEW_LINE_CHARACTER);

        AtomicInteger counter = new AtomicInteger();
        menuItems.forEach(menuItem -> {
            menuCardDetails.append(counter.incrementAndGet()+". \t\t"+menuItem.getName()+"\t\t"+menuItem.getPrice());
            menuCardDetails.append(NEW_LINE_CHARACTER);
        });

        return menuCardDetails.toString();
    }
}
