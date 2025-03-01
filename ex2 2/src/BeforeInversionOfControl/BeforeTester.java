/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BeforeInversionOfControl;

/**
 *
 * @author macbook
 */
public class BeforeTester {
      public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        Repairer repairer = new Repairer(myCar);

        System.out.println(myCar.needsRepair());
        System.out.println(repairer.repair());
    }
}
