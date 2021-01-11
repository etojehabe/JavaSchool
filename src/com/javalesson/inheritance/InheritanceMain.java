package com.javalesson.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "VNL 300", EngineType.PATROL, 300, 500, 1000);
        truck.start();
        truck.accelerate(40);
        truck.stop();
        truck.fuelUp(50);
        truck.load();
        truck.unload();

        System.out.println("\n");

        ElectricCar car = new ElectricCar("Tesla", "Model S", 4, 100500);
        car.start();
        car.stop();
        car.charge();

        System.out.println("\n");

        Bus bus = new Bus("VAZ", "2112", EngineType.DIESEL, 30, 75, 12);

        bus.fuelUp();
        bus.pickPassengers(5);
        bus.start();
        bus.releasePassengers();

    }
}
