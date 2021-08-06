/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author jaypr
 */
public class Item {

    private double price = 15.50;

    public Item(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;

    }
}

//        public void setPrice(Chapter9.Item cust) {
//            if (cust.hasLoyaltyDiscount()) {
//                price = price * .85;
//            }
//        

