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
public class OfficeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Answer for question 8: Jaya Kumar Saga");
        HeadOffice h = new BranchOffice("Ram", 50);
        System.out.println("Total amount of salary to be paid to employees: " + h.calculateSalaries());
        System.out.println(h.toString());
    }
}
