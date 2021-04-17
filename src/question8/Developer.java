/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Jaya Kumar Saga
 */
public abstract class Developer {
   private int id;
   private String project;

    public Developer(int id, String project) {
        this.id = id;
        this.project = project;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Developer" + "id=" + id + ", project=" + project ;
    }
   
    public abstract double estimatedHours();
}
