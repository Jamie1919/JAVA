/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

import static javax.swing.UIManager.getColor;

/**
 *
 * @author jaypr
 */
public class Clothing {

    private int itemID;
    private String desc;
    private char colorCode;
    private double price;

    public void display() {
        System.out.println("itemID: " + getItemID());
        System.out.println("description: " + getDesc());
        System.out.println("colorCode: " + getColorCode());
        System.out.println("price: " + getPrice());

    }

    public Clothing(int itemID, String desc, char colorCode, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = colorCode;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public String getDesc() {
        return desc;
    }

    public char getColorCode() {
        return colorCode;
    }

    public double getPrice() {
        return price;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "This shirt is a " + desc + ";"
                + " price: " + getPrice() + ","
                + " color: " + getColor(getColorCode());
    }

    boolean tostring() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
