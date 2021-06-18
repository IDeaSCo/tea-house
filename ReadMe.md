# Menu Card for Tea stall
Raj has a tea stall located near Baner.

He sells ‘*Black tea*’, ‘*Masala tea*’, ‘*Green tea*’. His stall has a tag line – “**Tea which has taste of relaxation!!!!!**”

He approached you to create a program to display the menu-card.


## Program to display menu card
This project aims to display menu card for this vendor.

Read and understand the code.
 

## Exercise
Modify the code to fix the below test in ```` MenuCardTest.java ````

````  
  
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
````