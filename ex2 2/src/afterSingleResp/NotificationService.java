/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package afterSingleResp;

/**
 *
 * @author macbook
 */
public class NotificationService {
     public void sendRepairNotification(Vehicle vehicle) {
        System.out.println("Sending repair notification for " + vehicle.getModel());
        sendEmail(vehicle);
        sendSMS(vehicle);
    }

    private void sendEmail(Vehicle vehicle) {
        System.out.println("Sending email notification for " + vehicle.getModel());
    }

    private void sendSMS(Vehicle vehicle) {
        System.out.println("Sending SMS notification for " + vehicle.getModel());
    }
}
