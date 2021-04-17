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
public class Property {
    private String typeOfProperty;  //movable and non movable
    private String date;

    public Property(String typeOfProperty, String date) {
        this.typeOfProperty = typeOfProperty;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Property:" + "typeOfProperty=" + typeOfProperty + ", date=" + date ;
    }
}
