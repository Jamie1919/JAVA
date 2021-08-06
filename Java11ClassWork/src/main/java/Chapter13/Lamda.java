/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter13;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jaypr
 */
public class Lamda {

    public static void main(String[] args) {
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"};
        ArrayList<String> mylist = new ArrayList(Arrays.asList(names));

//        for(String s: mylist){
//            System.out.println(s.toUpperCase()+", ");
//        }
        //UnaryOperator
        //mylist.replaceAll(s -> s.toUpperCase());
        //Predictive Lamda Type integer to boolean
        //mylist.removeIf(s -> s.equals("Rick"));
        mylist.removeIf(s -> s.length() < 5);
        System.out.println("After for loop: " + mylist);
    }
}
