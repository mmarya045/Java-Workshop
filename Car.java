/*
** EPITECH PROJECT, 2023
** java
** File description:
** java
*/

public class Car extends Vehicle {
    int Weight;
    int Wheels;

    public Car(String brand, String model, int year, int weight, int wheels) {
        super(brand, model, year);
        Weight = weight;
        Wheels = wheels;
    }
    public void Describe() {
        System.out.print("I'm a Car, ");
        System.out.print("I weight" + " " + Weight);
        System.out.print(" kg and I have " + Wheels + " ");
        System.out.print("wheels.");
    }
}