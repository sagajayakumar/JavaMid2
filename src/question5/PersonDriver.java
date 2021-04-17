/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542392
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 5: Jaya Kumar Saga");
        Person p = new Person("sam", "Dallas", "8323293232", "samDallas@gmail.com");
        System.out.println( p);
        Student s = new Student(3.5, "billy", "Texas", "2324356576", "billy@gmail.com");
        System.out.println( s);
        Staff st = new Staff("Junior Assistance", "Human Resource", 2200, "04/10/2020",
                "Randy", "New york", "8239328493", "Randy@gmail.com");
        System.out.println( st);
        Employee e = new Employee("Finance", 2500, "04/11/2019", "John", 
                "Chicago", "9385423186", "John@gmail.com");
        System.out.println(e);
        Faculty f = new Faculty("10-4 PM", 3, "CS", 4000, "05/12/2015", 
                "Shelby", "DC", "3287237823", "shelby@gmail.com");
        System.out.println( f);
    }
}
