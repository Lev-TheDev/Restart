package factory;

public abstract class Factory {
    public void createCar(String requestedType) {
        Car car = chooseCar(requestedType);
        car = prepareCar(car);
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        car.startEngine();
        return car;
    }

    abstract Car chooseCar(String requestedType);
}
