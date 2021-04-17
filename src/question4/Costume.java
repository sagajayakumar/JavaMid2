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
public class Costume {
    private String fabric;
    private String type;

    /** Constructor class for the costume
     * 
     * @param fabric
     * @param type 
     */
    public Costume(String fabric, String type) {
        this.fabric = fabric;
        this.type = type;
    }

    /** getter method for fabric
     * 
     * @return fabric
     */
    public String getFabric() {
        return fabric;
    }

    /** setter method for fabric
     * 
     * @param fabric 
     */
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    /** getter method for manufacture 
     * 
     * @return type
     */
    public String gettype() {
        return type;
    }

    /** setter method for manufacture
     * 
     * @param type  
     */
    public void settype(String type) {
        this.type = type;
    }

    /** calculates cost of fabric
     * 
     * @return cost
     */
    public double calCost(){
        double cost =12;
        return cost;
    }
    
    @Override
    public String toString() {
        return  "fabric=" + fabric + ", type=" + type ;
    }
}
