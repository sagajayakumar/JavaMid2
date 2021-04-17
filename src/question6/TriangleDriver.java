/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author S542392
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 6: Jaya Kumar Saga");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter triangle first side: ");
        double firstSide = sc.nextDouble();
        System.out.print("Enter triangle second side: ");
        double secondSide = sc.nextDouble();
        System.out.print("Enter triangle third side: ");
        double thirdSide = sc.nextDouble();
        System.out.print("Enter triangle color: ");
        String color = sc.next();
        System.out.print("Enter triangle filled: ");
        boolean filled = sc.nextBoolean();
        Triangle t = new Triangle(firstSide, secondSide, thirdSide,color, filled);
        System.out.println("Area of Triangle: "+ t.getArea());
        System.out.println("Perimeter of Triangle: " + t.getPerimeter());
        System.out.println("Color of Triangle: " + t.color());
        System.out.println("isFilled: " + t.isFilled());
    }
    
}
