/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam.question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S542392
 */
public class LoanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 3: Jaya Kumar Saga");
        ArrayList<Object> loans = new ArrayList<>();
        Date d = new Date();
        Circle c = new Circle("Maryville", "MO");
        Loan l = new Loan(1234556, 23000);
        String name =  "Billings";
        loans.add(l);
        loans.add(c);
        loans.add(d);
        loans.add(name);
        for(Object o: loans){
        System.out.println(o.toString().replace("[", "").replace("]", ""));
        }
    }
    
}
