package factory;

public class WithoutConFactory extends Factory{
    @Override
    Car chooseCar(String requestedType) {
        if ("A".equals(requestedType)) {
            return new UpCar(140, "gasoline", "grey");
        } else {
            return new KwidCar(105, "alcohol", "orange");
        }
    }
}
