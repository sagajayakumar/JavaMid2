/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Jaya Kumar
 */
public class Manager extends Developer {
    private String name;

    public Manager(String name, int id, String project) {
        super(id, project);
        this.name = name;
    }

    @Override
    public double estimatedHours() {
      return 50;
    }

    @Override
    public String toString() {
        return "Manager: " + "name=" + name + " Developer: " + super.toString() ;
    }
}
