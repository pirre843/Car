package se.iths.pierre;

public class Main {
    static void main() {

        Car car = new Car("Skoda", "Fabia", 350000);
        IO.print(" Bilmärke: " + " " + car.getBrand());
        IO.print(" " + car.getModel());
        IO.print(" " + car.getPrice());

        Car car1 = new Car("Subaru", "Impreza", 699999);
        IO.print(" Bilmärke: " + " " + car1.getBrand());
        IO.print(" " + car1.getModel());
        IO.print(" " + car1.getPrice());

    }
}
