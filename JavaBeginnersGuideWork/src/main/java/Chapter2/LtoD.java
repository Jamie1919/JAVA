/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author jaypr
 */
// Demonstate automatic conversion from long to double. 
class LtoD {

    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L;
        //L = D; Illegal!!! will not compile
        System.out.println("L and D: " + L + " " + D);

    }
}