/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afterSingleResp;

/**
 *
 * @author macbook
 */
public class VehicleDatabase {
    
    
     public void save(Vehicle vehicle) {
        System.out.println("Saving " + vehicle.getModel() + " details to database.");
        updateRepairHistory(vehicle);
    }

    private void updateRepairHistory(Vehicle vehicle) {
        System.out.println("Updating repair history for " + vehicle.getModel());
    }
    
}
