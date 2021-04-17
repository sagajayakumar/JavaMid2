/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Jaya Kumar Saga
 */
public class OceansDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 7: Jaya Kumar Saga");
        double area = Oceans.PACIFIC.getArea();
        System.out.println("Area of Pacific: " + area);
        double depthP = Oceans.PACIFIC.getDepth();
        System.out.println("Depth of Pacific: " + depthP);
        double depthA = Oceans.ATLANTIC.getDepth();
        if(depthP>depthA){
            System.out.println("Pacific ocean has more depth than Atlantic ocean with " +depthP );
        }
    }
    
}
