package com.teastall.interview;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FormatterTest {

    @Test
    public void showMenuCard() {
        String expectedDetails = "Tea which has taste of relaxation!!!!!\n"+
                "---------------------------------------------------------------\n"+
                "No.\t\tItem\t\t\tPrice\n"+
                "1. \t\tBlack Tea\t\t15.0\n"+
                "2. \t\tGreen Tea\t\t20.0\n"+
                "3. \t\tMasala Tea\t\t25.0\n";
        MenuItem blackTea = new MenuItem("Black Tea", 15.00);
        MenuItem greenTea = new MenuItem("Green Tea", 20.00);
        MenuItem masalaTea = new MenuItem("Masala Tea", 25.00);
        List<MenuItem> menuItems = Arrays.asList(blackTea, greenTea, masalaTea);

        Formatter formatter = new Formatter(menuItems);
        String menuCard = formatter.showMenuCard();

        assertEquals(expectedDetails, menuCard);
    }
}