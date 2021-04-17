/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author S542392
 */
public class Triangle extends GeometricObject{

     private double firstSide;
     private double secondSide;
     private double thirdSide;
     private String color;
     private boolean filled;

    public Triangle(double firstSide,double secondSide,double thirdSide, String color, boolean filled) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea() {
       return (firstSide *secondSide)/2;
    }

    @Override
    public double getPerimeter() {
       return firstSide +secondSide+thirdSide;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public boolean isFilled() {
       return filled;
    }

    @Override
    public String toString() {
        return "Traingle{" + "firstSide=" + firstSide + ", secondSide=" + secondSide + ", thirdSide=" + thirdSide + ", color=" + color + ", filled=" + filled + '}';
    }
}
