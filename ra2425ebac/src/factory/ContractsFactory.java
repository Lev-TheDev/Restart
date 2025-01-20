package factory;

public class ContractsFactory extends Factory{
    @Override
    Car chooseCar(String requestedType) {
        if ("A".equals(requestedType)) {
            return new CorollaCar(200, "gasoline", "white pearl");
        } else {
            return new FusionCar(215, "electric", "black panther");
        }
    }
}
