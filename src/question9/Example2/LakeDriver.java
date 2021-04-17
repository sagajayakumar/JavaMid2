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
public class LakeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 9: Jaya Kumar Saga");
        Rainy r = new Rainy(10, 45, 85);
        System.out.println(r.toString());
        double rd = Math.round(r.getDepth()*100)/100.00;
        System.out.println("Depth of river " + rd);
        
        Lake l = new Rainy(10, 45, 85);
        double ld = Math.round(l.getDepth()*100)/100.00;
        System.out.println("Depth of river " + ld);
    }
    
}
