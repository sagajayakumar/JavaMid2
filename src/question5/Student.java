/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author S542392
 */
public class Student extends Person{
    private double grade;
    private final String classStatus = "Graduate";

    public Student(double grade, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return  "ClassName: Student\n"+super.toString() + ",grade=" + grade + ", classStatus=" + classStatus ;
    }
}
