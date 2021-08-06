/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter11;

/**
 *
 * @author jaypr
 */
public class twoDArray {

    public static void main(String[] args) {
        int year = 1;
        
        int[][] yearlySales = new int[4][4];
        yearlySales[0][0] = 100;
        yearlySales[0][1] = 200;
        yearlySales[0][2] = 300;
        yearlySales[0][3] = 400;
        yearlySales[1][0] = 500;
        yearlySales[1][1] = 600;
        yearlySales[1][2] = 700;
        yearlySales[1][3] = 800;
        yearlySales[2][1] = 900;
        yearlySales[2][2] = 1000;
        yearlySales[2][3] = 1100;
        yearlySales[3][0] = 1200;
        yearlySales[3][1] = 1300;
        yearlySales[3][2] = 1400;
        yearlySales[3][3] = 1500;
        
        for (int[] yearlySale : yearlySales) {
            System.out.println("Year" + year + ":");
            year = year + 1;
            for (int j = 0; j < yearlySale.length; j++) {
                System.out.println("\tQ"+(j+1)+":" + yearlySales[1][j]);
            }
        }
                
                
    }

}
