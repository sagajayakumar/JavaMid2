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
public enum SamsungModels {
    MSERIES("4g", 32, 6000), ASERIES("5g", 32, 7000);
    private String technology;
    private int cameraPixels;
    private int batteryBackup;

    private SamsungModels(String technology, int cameraPixels, int batteryBackup) {
        this.technology = technology;
        this.cameraPixels = cameraPixels;
        this.batteryBackup = batteryBackup;
    }

    public String getTechnology() {
        return technology;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }

    public int getBatteryBackup() {
        return batteryBackup;
    }
}
