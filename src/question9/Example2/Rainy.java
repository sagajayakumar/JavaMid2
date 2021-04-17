/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.Example2;

/**
 *
 * @author S542392
 */
public class Rainy extends Summer{
  
    public double rainfall;

    public Rainy(double rainfall, double temp, double humidity) {
        super(temp, humidity);
        this.rainfall = rainfall;
    }

    @Override
    public double getDepth() {
        return DEPTH + rainfall - reduceInWaterLevel();
    }

    @Override
    public String toString() {
        return super.toString() +  ", rainfall=" + rainfall ;
    }  
}
