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
public class Excercise01 {

    public class Customer {

        public String name;
        public String ssn;

        // Encapsulate this class.  Make ssn read only.

        public String setName() {
            return name;
        }

        public String setSsn() {
            return ssn;
           
        }

        public void getSsn(String ssn) {
            this.ssn = ssn;
        }
        
    }

}
