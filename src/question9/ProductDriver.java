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
public class ProductDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 9: Jaya Kumar Saga");
        CompanyProduct cp = new RetailerDiscount(5, "Shaw");
        System.out.println("Tax rate " + cp.calTaxRate());
        System.out.println("Prica after tax " + cp.calPriceAfterTaxs());
        
        WholesaleDiscount wd = new RetailerDiscount(10, "Sanjay");
        System.out.println("Retail name " + wd.getRetailerName());
        System.out.println("Retail discount " + wd.getDiscount());
        System.out.println("Final price " + wd.calPriceAfterTaxs());
        
    }
    
}
