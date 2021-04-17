/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Jaya Kumar Sagas
 */
public abstract class HeadOffice {
    private String manager;
    private int numberOfEmployees;

    public HeadOffice() {
    }
    
    public abstract double calculateSalaries();    
}
