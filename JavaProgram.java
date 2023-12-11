/*
** EPITECH PROJECT, 2023
** java
** File description:
** java
*/

public class JavaProgram {
    public static void main(String []args) {
        Vehicle kart1 = new Vehicle("Volkswagen", "Scirocco", 2008);
        Vehicle kart2 = new Car("Ferrari", "Testarossa", 1984, 1656, 4);
        Vehicle kart3 = new Truck("Scania", "Frostfire", 2022, 6000, 6);

        kart1.Describe();
        kart1.Accelerate();

        kart2.Describe();
        System.out.print("\n");
        kart3.Describe();
    }
}