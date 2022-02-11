package academy.learnprogramming;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        System.out.println("====MENU ITEMS----");
        String[] foodItems = {"\n -Pizza $2.00\n", "-Steak $4.00\n", "-Hamburger $5.00\n", "-Potato Soup $2.00\n", "-Hot Wings $6.00\n"};
        System.out.println(Arrays.toString(foodItems).replace("[", "").replace("]", "").replace(",", ""));
        MenuItems();

    }



    static void MenuItems(){

        boolean isFlag = false;

        //ArrayList<String> menu = new ArrayList<String>();
        //List<Integer> orderCost = new ArrayList<Integer>();
do {
    try {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your menu items:");
        String menuChoice = input.nextLine();
        // System.out.println(menuChoice);
        isFlag = true;

        if (menuChoice.equalsIgnoreCase("Pizza")) {
            System.out.println("You ordered : \n -Pizza $2.00\n");
        }
        else if (menuChoice.equalsIgnoreCase("Steak")) {
            System.out.println("You ordered : -Steak $4.00\n");
        }
        else if (menuChoice.equalsIgnoreCase("Hamburger")) {
            System.out.println("You ordered : -Hamburger $5.00\n");
        }
        else if (menuChoice.equalsIgnoreCase("Potato Soup")) {
            System.out.println("You ordered : -Potato Soup $2.00\n");
        }
        else if (menuChoice.equalsIgnoreCase("Hot Wings")) {
            System.out.println("You ordered : -Hot Wings $6.00\n");
        }
        else {
            System.out.println("That is not a food item. Start the program again.");
            break;
        }


    } catch (InputMismatchException e) {
        System.out.println("Wrong input.");
    }


}while(!isFlag);

 }

}


