/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author S542392
 */
public class NumbersDriver {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
    One hippo = new Three();
    hippo.guess(4);
    System.out.println(hippo.guess(4));
    hippo.apply(12);
    System.out.println(hippo.apply(12));

    One lion = new One(-1);
    lion.guess(5);
    System.out.println(lion.guess(5));
    lion.apply(6);
    System.out.println(lion.apply(6));        
} // end

    
}
