package com.ultralesson.shoppingcart;

public class Customer {
    private String consumerName;
    private int consumerId;
    private MyWallet myWallet;
    private ShoppingCart shoppingCart;

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Customer(){
        this.myWallet = new MyWallet(500);
        this.shoppingCart = new ShoppingCart();
    }

    private ShoppingCart cart;

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public MyWallet getMyWallet() {
        return myWallet;
    }

    public void setEwallet(MyWallet myWallet) {
        this.myWallet = myWallet;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }
}
