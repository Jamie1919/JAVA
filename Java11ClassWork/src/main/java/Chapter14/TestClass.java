/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter14;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author jaypr
 */
//Method that throws an Exception
public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        
        try{
            testClass.testCheckedExecption();
        }catch(IOException e){
            System.out.println(e.getMessage());
            //System.out.println(e);
        }
    }
    public void testCheckedExecption() throws IOException{
        File testFile = new File("//testFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: " +testFile.exists());
    }
}
