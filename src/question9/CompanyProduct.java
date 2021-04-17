/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Jaya Kumar Saga
 */
public interface CompanyProduct {
    
    public static final double PRICE = 100;
    public static final double TAX_RATE = 10;
    public abstract double calPrice();
    public abstract double calTaxRate();
    public abstract double calPriceAfterTaxs();
}
