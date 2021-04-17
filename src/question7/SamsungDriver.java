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
public class SamsungDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 7: Jaya Kumar Saga");
        String name = SamsungModels.MSERIES.name();
        String tech = SamsungModels.MSERIES.getTechnology();
        System.out.println("Model: " + name);
        System.out.println("Technology: " + tech);
        int batteryBackup = SamsungModels.MSERIES.getBatteryBackup();
        System.out.println("Battery: "+batteryBackup);
    }
}
