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
public class PropertyDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4: Jaya Kumar Saga");
        Property p = new Property("non-movable", "04/12/2015");
        System.out.println(p);
        Car c = new Car("Tesla", 30000, "movable", "04/12/2018");
        System.out.println(c);
        //polymorpic substitution
        Property pc = new Car("Benz", 25000, "movable", "04/12/2018");
        ////late binding polumorphism
        System.out.println(pc);
    }
}
