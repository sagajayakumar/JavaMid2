/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author S542392
 */
public class Shirt extends Costume {
    private int size;

    /** constructor for shirt
     * 
     * @param size
     * @param fabric
     * @param manufacture 
     */
    public Shirt(int size, String fabric, String manufacture) {
        super(fabric, manufacture);
        this.size = size;
    }

    /** getter method for size of costume
     * 
     * @return size
     */
    public int getSize() {
        return size;
    }

    /** setter method for size of costume
     * 
     * @param size 
     */
    public void setSize(int size) {
        this.size = size;
    }

    /** calculates bill of shirt
     * 
     * @return bill
     */
    @Override
    public double calCost(){
        double bill =0;
        bill = super.calCost() * 10;
        return bill;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", size=" + size ;
    }   
}
