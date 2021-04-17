/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Jaya Kumar Saga
 */
public class ManagerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 8: Jaya Kumar Saga");
        Manager m = new Manager("Samuel", 123, "Zango");
        System.out.println(m);
        System.out.println("estimated hours: "+ m.estimatedHours()); 
    }
}
