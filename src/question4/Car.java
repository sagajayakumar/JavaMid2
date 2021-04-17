/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Jaya Kumar Saga
 */
public class Car extends Property{
    private String name;
    private double price;
    
    public Car(String name, double price, String typeOfProperty, String date) {
        super(typeOfProperty, date);
        this.name = name;
        this.price = price;
    }

    public double resaleValue(){
        double cost = price*0.2;
        return cost;
    }
    @Override
    public String toString() {
        return super.toString() + ", Car:" + "name=" + name + ", price=" + price ;
    }
}
