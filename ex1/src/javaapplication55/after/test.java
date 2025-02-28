/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication55.after;

/**
 *
 * @author FSMVU
 */
public class test {
    public static void main(String[] args) {
        Car c=new Car((IColor) new SetColorBlue());
        c.displayColor();
        Bike b=new Bike(new SetColorRed());
        b.displayColor();
        Car c1=new Car(()->{System.out.println("my coloc is yellow");});
        c1.displayColor();

    }
}
