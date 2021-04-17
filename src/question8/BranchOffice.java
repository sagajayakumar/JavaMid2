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
public class BranchOffice extends HeadOffice {
    private String manager;
    private double numberOfEmployees;

    public BranchOffice(String manager, double numberOfEmployees) {
        this.manager = manager;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public double calculateSalaries() {
       return 5000*this.numberOfEmployees;
    }

    @Override
    public String toString() {
        return "BranchOffice{" + "manager=" + manager + ", numberOfEmployees=" + numberOfEmployees + '}';
    }
}
