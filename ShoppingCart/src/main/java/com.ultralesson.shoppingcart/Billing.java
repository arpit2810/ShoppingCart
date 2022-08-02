package com.ultralesson.shoppingcart;

import java.util.ArrayList;

public class Billing {
    public void shopTransaction(Customer customer) {
        double amountPayable = 0;
        int milkQuantity = 0;
        ShoppingCart cart = new ShoppingCart();
        ArrayList<Items> items = new ArrayList<>();
        cart = customer.getCart();
        items = cart.getItems();

        for (Items item : items) {
            amountPayable += item.getItemPrice() * item.getQuantity();
            if (item.getItemName().compareTo("milk") == 0) {
                milkQuantity = item.getQuantity();
                milkQuantity += milkQuantity / 2;
                item.setQuantity(milkQuantity);
            }
        }

        if (customer.getMyWallet().getBalance() >= amountPayable && amountPayable >= 100) {
            amountPayable -= 0.05 * amountPayable;
        }

        System.out.println("Total amount payable: " + amountPayable);
        printItemList(items);
        customer.getMyWallet().setBalance(customer.getMyWallet().getBalance() - amountPayable);
        System.out.println("Remaining E-walllet Balance :" + (customer.getMyWallet().getBalance()));

    }


    public void printItemList(ArrayList<Items> items) {
        for (Items item : items) {
            System.out.println(item.getItemName() + " : " + item.getItemPrice() + " : " + item.getQuantity());
        }
    }
}
