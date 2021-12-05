package com.company;
import java.util.ArrayList;  // allows me to use arrays
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Inventory> wholeinventory = new ArrayList<Inventory>();  // setting arrays up
        ArrayList<String> wholepurchases = new ArrayList<>();

        Inventory inventory = new Inventory();

        inventory.setProduct("Bison Bumper sticker"); // adding inventory and prices
        inventory.setPrice(4.99);
        wholeinventory.add(inventory);

        inventory.setProduct("Bison Tee");
        inventory.setPrice(14.99);
        wholeinventory.add(inventory);

        inventory.setProduct("Bison Hoodie");
        inventory.setPrice(23.99);
        wholeinventory.add(inventory);

        inventory.setProduct("Bison Sweater");
        inventory.setPrice(55.99);
        wholeinventory.add(inventory);


        Scanner keyboard = new Scanner(System.in);  // setting user input up
        String purchaseditem;
        double sum = 0.0;
        int index = -1;
        do {
            System.out.println("What item did you buy? If you did not buy anything or are done purchasing type complete: ");
            purchaseditem = keyboard.nextLine();
            wholepurchases.add(purchaseditem);
            for (int i = 0; i < wholeinventory.size(); i++) {
                if (purchaseditem.equals(wholeinventory.get(i))) {
                    index = i;
                }
            }
            wholepurchases.add(wholepurchases.get(index));
        } while (!purchaseditem.equalsIgnoreCase("complete"));  // checks for user being done, the ! being the not function


        for (int i = 0; i < wholepurchases.size() - 1; i++) {
            System.out.println("Items purchased: " + wholepurchases.get(i));
            sum += wholepurchases;
        }

        System.out.println("Total Spent: " + sum);

    }

}