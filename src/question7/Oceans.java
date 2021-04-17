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
public enum Oceans {
    PACIFIC(36161, 6380000), ATLANTIC(27841, 4100000);
    private double depth;
    private long area;

    private Oceans(double depth, long area) {
        this.depth = depth;
        this.area = area;
    }

    public double getDepth() {
        return depth;
    }

    public long getArea() {
        return area;
    }
}
