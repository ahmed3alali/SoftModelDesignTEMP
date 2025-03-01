/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeforeInversionOfControl;

/**
 *
 * @author macbook
 */
public class Repairer {
    
        private Car car;

    public Repairer(Car car) {
        this.car = car;
    }

    public String repair() {
        return "Repairing " + car.getModel() + ". The car is now fixed.";
    }
}


