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
public class CostumeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4: Jaya Kumar Saga");
        Costume c = new Costume("Silk", "handloom");
        Shirt s = new Shirt(42, "cotton", "powerloom");
        //polymorpic substitution
        Costume cp = new Shirt(44, "Silk", "handloom");
        //late binding polumorphism
        System.out.println(cp);
    }
}
