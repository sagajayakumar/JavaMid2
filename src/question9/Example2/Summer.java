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
public abstract class Summer implements Lake{
    public double temp;
    public double humidity;
    
    public Summer(double temp, double humidity) {
        this.temp = temp;
        this.humidity = humidity;
    }

    public double getTemp() {
        return temp;
    }

    public double getHumidity() {
        return humidity;
    }
    
    public double reduceInWaterLevel(){
        return 0.5;
    }
    
    @Override
    public abstract double getDepth();

    @Override
    public String toString() {
        return "Summer{" + "temp=" + temp + ", humidity=" + humidity + '}';
    }
    
}
