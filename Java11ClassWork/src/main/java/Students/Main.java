/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Students;

/**
 *
 * @author jaypr
 */
public class Main {

    public static void main(String[] args) {

        Student student01 = new Student("James", "Oliver");

        Student student02 = new Student("Sarah", "Parker", 16, "Parkerss@gmail.com");

        Student student03 = new Student("Ryan", "Wilson",74890432, 324);

        Student student04 = new Student("Lee", 17, "Stantheman@gmail.com", 107);

        Student student05 = new Student("Troy", "Baker", 18, 75432984, 675);

        Student[] students = {student01, student02, student03, student04, student05};

        for (Student student : students) {
            student.getStudentDetails();
         }
    }
}
