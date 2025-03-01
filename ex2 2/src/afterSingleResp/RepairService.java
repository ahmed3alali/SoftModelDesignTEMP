/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afterSingleResp;

/**
 *
 * @author FSMVU
 */
public class RepairService {
    Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    
    public void repair() {
        System.out.println("Repairing " + vehicle.getModel());
        checkParts();
        orderParts();
    }
    public void checkParts() {
        System.out.println("Checking parts for " + vehicle.getModel());
    }
    public void orderParts() {
        System.out.println("Ordering parts for " + vehicle.getModel());
    }

}
