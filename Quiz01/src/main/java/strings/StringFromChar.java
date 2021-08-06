/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author jaypr
 */
public class StringFromChar {
        public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        
        String newStr = null;
        for(char ch : myCharArr){
            newStr = newStr + ch;
        }
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
    }
}

