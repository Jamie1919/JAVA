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
public class Student {
    
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private int cellNumber;
    private int idNum;

    public Student(String firstname, String lastname, int age, String email, int cellNumber, int idNum) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.cellNumber = cellNumber;
        this.idNum = idNum;
    }
    
     public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
     
      public Student(String firstname, String lastname, int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }
    
     public Student(String firstname, String lastname, int cellNumber, int idNum) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cellNumber = cellNumber;
        this.idNum = idNum;
    }
     public Student(String lastname, int age, String email,  int idNum) {
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.idNum = idNum;
    }
      public Student(String firstname, String lastname, int age, int cellNumber, int idNum) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.cellNumber = cellNumber;
        this.idNum = idNum;
    }
    
    
    
  public void getStudentDetails() {
        System.out.println("Student:" + firstname);
        System.out.println("Student:" + lastname);
        System.out.println("NumberID:" + idNum);
        System.out.println("Email:" + email);
        System.out.println("Age:" + age);
        System.out.println("Cell Number:" + cellNumber);

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public int getIdNum() {
        return idNum;
    }
  
    
}
