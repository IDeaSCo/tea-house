package com.teastall.interview;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MenuCardTest {
    @Test
    public void displayMenuCard(){
        String expectedDetails = "Tea which has taste of relaxation!!!!!\n"+
                                 "---------------------------------------------------------------\n"+
                                 "No.\t\tItem\t\t\tPrice\n"+
                                 "1. \t\tBlack Tea\t\t15.0\n"+
                                 "2. \t\tGreen Tea\t\t20.0\n"+
                                 "3. \t\tMasala Tea\t\t25.0\n";

        MenuCard menuCard = new MenuCard();
        String menuCardDetails = menuCard.show();

        assertEquals(expectedDetails , menuCardDetails);
    }

    @Test
    public void getListOfMenuItems(){
        MenuItem blackTea = new MenuItem("Black Tea", 15.00);
        MenuItem greenTea = new MenuItem("Green Tea", 20.00);
        MenuItem masalaTea = new MenuItem("Masala Tea", 25.00);
        List<MenuItem> expectedMenuItems = Arrays.asList(blackTea, greenTea, masalaTea);

        MenuCard menuCard = new MenuCard();
        List<MenuItem> menuItems = menuCard.getMenuItems();

        assertEquals(expectedMenuItems, menuItems);
    }
}
