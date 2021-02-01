package com.javalesson.inheritance;

public class Bus extends FuelAuto {

    private int passengerNumber;

    public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp() {
        int volume = getTankVolume() - getAvailablePetrol();
        fuelUp(volume);
    }


    //Перезаписываем заправку под Bus
    @Override
    public void fuelUp(int petrolVolume) {
        int volume = getAvailablePetrol() + petrolVolume;
        if (volume > getTankVolume()) {
            setAvailablePetrol(getTankVolume());
        }
        System.out.println("Adding DIESEL");
    }

    @Override
    public void start() {
        isRunning = true;
        setCurrentSpeed(10);
        System.out.println("Bus is starting");
    }

    @Override
    public void stop() {
        isRunning = false;
        setCurrentSpeed(0);
        System.out.println("Bus has stopped");
    }

    @Override
    public void energize() {
        fuelUp(getTankVolume() - getAvailablePetrol());
    }

    //Подбираем пассажиров
    public void pickPassengers(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up " + passengerNum + " passengers");
    }

    //Высаживаем пассажиров
    public void releasePassengers() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passengers released");
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
