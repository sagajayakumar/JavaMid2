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
public abstract class WholesaleDiscount implements CompanyProduct{
    private String retailerName;
    private double discount = 10;

    public WholesaleDiscount(String retailerName) {
        this.retailerName = retailerName;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public double getDiscount() {
        return discount;
    }
    
    @Override
    public double calPrice() {
        return PRICE - discount;
    }

    @Override
    public double calTaxRate() {
       return calPrice()* TAX_RATE /100;
    }

    @Override
    public double calPriceAfterTaxs() {
        return calPrice()- calTaxRate() ;
    }

    @Override
    public String toString() {
        return "WholesaleDiscount:" + "retailerName=" + retailerName + ", discount=" + discount ;
    }    
}
