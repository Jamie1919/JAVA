/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jaypr
 */
public class Hyphen2 {

    public static void main(String args[])
            throws IOException {
        int i;

        // First make sure that both files have been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile From To");
            return;
        }

        // Copy file and substitute hyphens.
        // Use the try-with-resources statement.
        try ( FileReader fin = new FileReader(args[0]);  FileWriter fout = new FileWriter(args[1])) {
            do {
                i = fin.read();

                // convert space to a hypen
                if ((char) i == ' ') {
                    i = '-';
                }

                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
