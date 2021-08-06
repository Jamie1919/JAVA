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
public class ShoppingCart {
   public static void main(String args[]) {
        // Declare, instantiate, and initialize a Customer object

        Customer customer01 = new Customer("Peter Parker", "ssn");

	// Print the customer object name
        System.out.println("Customer " +customer01.getName());
    }
}
