/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author jaypr
 */
public class Main {

    public static void main(String[] args) {
//        
        Shirt shirt01 = new Shirt(15, "Hawaiain", 'R', 55.9, 'M', "Short sleeve");
        
        Jeans jeans01 = new Jeans ('L', "Long", 16, "Cut", 'B', 60.9 );
        shirt01.display();
         System.out.println("............\n");
        jeans01.display();
        
        System.out.println("............\n");
        Clothing jeans02 = new Jeans ('M', "Long", 12, "Cut", 'R', 70.0 );
        if (jeans02 instanceof Jeans){
        //char jeanssize = (((Jeans)jeans02).getSize());
        System.out.println("Medium Jeans Size: " + ((Jeans)jeans02).getSize());
    }else{
            System.out.println("Item ia not a jean");
            }
        
        System.out.println("............\n");
        jeans02.display();
       
        System.out.println(jeans02.tostring());
    }

}
