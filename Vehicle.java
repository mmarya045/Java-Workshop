/*
** EPITECH PROJECT, 2023
** java
** File description:
** java
*/

public class Vehicle {
    String Brand;
    String Model;
    int Year;

    public Vehicle(String brand, String model, int year) {
        Brand = brand;
        Model = model;
        Year = year;
    }
    public void Accelerate() {
        System.out.println("I'm putting the pedal to the metal");
    }
    public void Brake() {
        System.out.println("Woah! Slow down boy!");
    }
    public void Describe() {
        System.out.print("I'm a ");
        System.out.print(Brand + " ");
        System.out.print(Model + " ");
        System.out.print("made in ");
        System.out.println(Year + " ");
    }
}
