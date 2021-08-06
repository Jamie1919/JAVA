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
public class Main {

    public static void main(String[] args) {
        Customer customer01 = new Customer("Chuck Barry", 79, "Mississipi", 255, 32);

        Customer customer02 = new Customer("Barry White", 69, "Texas", 300, 23);

        Customer customer03 = new Customer("Steven Dale", 50, "LA", 199, 55);

        Customer customer04 = new Customer("Marry Smith", 25, "Dallas", 432, 11);

        Customer customer05 = new Customer("John Wayne", 66, "California", 132, 45);
        
        Customer [] customers = {customer01,customer02,customer03,customer04,customer05};
        
         for (Customer customer : customers ){
            System.out.println("Customer Name: "+customer.name);
         }
        //customer01.name = "Keagen";
        // customer01.age = 40;
        // customer01.custID = 250;
        // customer01.address = "Woodmeed";
        //customer01.orderNum = 25;
//       customer01.setName("James Brown");
//       customer01.setAddress("Woodmead");
//       customer01.setAge(40);
//       customer01.setCustID(250);
//       customer01.setOrderNum(25);
//       
//       
//        System.out.println(customer01.getName());
//        System.out.println(customer01.getAddress());
//        System.out.println(customer01.getAge());
//        System.out.println(customer01.getCustID());
//        System.out.println(customer01.getOrderNum());
//        
        //Calling Methods
        //customer01.displayCustomer();
    }
}
