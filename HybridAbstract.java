abstract class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

abstract class FourWheeler extends Vehicle {
    private int numberOfDoors;

    public FourWheeler(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

abstract class TwoWheeler extends Vehicle {
    private boolean hasCarrier;

    public TwoWheeler(String make, String model, boolean hasCarrier) {
        super(make, model);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }
}

class Car extends FourWheeler {

    public Car(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
    }

    public void printCarDetails() {
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Number of Doors: " + getNumberOfDoors());
    }
}

class Bike extends TwoWheeler {

    public Bike(String make, String model, boolean hasCarrier) {
        super(make, model, hasCarrier);
    }

    public void printBikeDetails() {
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
        System.out.println("Has Carrier: " + hasCarrier());
    }
}

public class HybridAbstract {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 4);
        Bike bike = new Bike("Suzuki", "Hayabusa", false);

        car.printCarDetails();
        System.out.println("-----------------");
        bike.printBikeDetails();
    }
}
