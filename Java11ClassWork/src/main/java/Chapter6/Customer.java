/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author jaypr
 */
public class Customer {

    public String name;
    public int custID;
    public String address;
    public int orderNum;
    public int age;

    public Customer(String name, int custID, String address, int orderNum, int age) {
        this.name = name;
        this.custID = custID;
        this.address = address;
        this.orderNum = orderNum;
        this.age = age;
    }

    public void displayCustomer() {
        //Accessing fields
        System.out.println("Customer:" + name);
        System.out.println("CustomerID:" + custID);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);
        System.out.println("Order Number:" + orderNum);

    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getCustID() {
//        return custID;
//    }
//
//    public void setCustID(int custID) {
//        this.custID = custID;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getOrderNum() {
//        return orderNum;
//    }
//
//    public void setOrderNum(int orderNum) {
//        this.orderNum = orderNum;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;

    public boolean hasLoyaltyDiscount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


