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
public class RetailerDiscount extends WholesaleDiscount{
    private double specialDiscount ;

    public RetailerDiscount(double specialDiscount, String retailerName) {
        super(retailerName);
        this.specialDiscount = specialDiscount;
    }

    @Override
    public String toString() {
        return super.toString() + ", RetailerDiscount:" + "specialDiscount=" + specialDiscount ;
    }
    
      @Override
    public double calPrice() {
        return PRICE - (super.getDiscount() + specialDiscount);
    }

    @Override
    public double calTaxRate() {
       return calPrice()* TAX_RATE /100;
    }

    @Override
    public double calPriceAfterTaxs() {
        return calPrice()- calTaxRate() ;
    }    
}
