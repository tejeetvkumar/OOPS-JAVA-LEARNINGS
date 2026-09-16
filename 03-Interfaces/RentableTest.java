interface Rentable {
    double calculateRent(int days);
}

class Car implements Rentable {

    static int totalVehiclesRented = 0;
    public static final double TAX_RATE = 0.05;

    @Override
    public double calculateRent(int days) {
        totalVehiclesRented++;
        return 1500 * days;
    }
}

class Bike implements Rentable {

    @Override
    public double calculateRent(int days) {
        Car.totalVehiclesRented++;
        return 500 * days;
    }
}

public class RentableTest {
    public static void main(String[] args) {
        Rentable[] rentables = new Rentable[2];

        rentables[0] = new Car();
        rentables[1] = new Bike();

        for (Rentable r : rentables) {
            System.out.println("Rent = " + r.calculateRent(5));
        }

        System.out.println("Total vehicles rented = " + Car.totalVehiclesRented);
    }
}