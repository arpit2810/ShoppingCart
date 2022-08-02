package com.ultralesson.shoppingcart;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Billing shop = new Billing();
        Customer customer = new Customer();
        ArrayList<Items> itemList= new ArrayList<>();
        itemList.add(new Items("milk",52,2));
        itemList.add(new Items("apple",60,1));
        itemList.add(new Items("newspaper",5,1));

        ShoppingCart cart = new ShoppingCart();
        cart.setItems(itemList);
        customer.setCart(cart);

        shop.shopTransaction(customer);
    }
}