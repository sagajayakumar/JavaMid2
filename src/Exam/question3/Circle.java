/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam.question3;

/**
 *
 * @author S542392
 */
public class Circle {
    private String region;
    private String state;

    /** Constructor for circle
     * 
     * @param region
     * @param state 
     */
    public Circle(String region, String state) {
        this.region = region;
        this.state = state;
    }

    /** getter method for region
     * 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /** setter method for region
     * 
     * @param region 
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /** getter method for state
     * 
     * @return state
     */
    public String getState() {
        return state;
    }

    /** setter method for state
     * 
     * @param state 
     */
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  "region=" + region + ", state=" + state ;
    }    
}
