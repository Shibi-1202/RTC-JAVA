import java.util.Scanner;

class Vehicle {
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

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public int getDoors() {
        return numDoors;
    }

    public void display() {
        System.out.println("Car Make: " + getMake());
        System.out.println("Car Model: " + getModel());
        System.out.println("Number of Doors: " + getDoors());
    }
}

class Bike extends Vehicle {
    private String type;

    public Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("Bike Make: " + getMake());
        System.out.println("Bike Model: " + getModel());
        System.out.println("Bike Type: " + getType());
    }
}

public class VehicleDetails {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Car Make: ");
        String carMake = inp.nextLine();

        System.out.print("Enter Car Model: ");
        String carModel = inp.nextLine();

        System.out.print("Enter Number of Doors: ");
        int numDoors = inp.nextInt();
        inp.nextLine(); 

        Car car = new Car(carMake, carModel, numDoors);

        System.out.print("Enter Bike Make: ");
        String bikeMake = inp.nextLine();

        System.out.print("Enter Bike Model: ");
        String bikeModel = inp.nextLine();

        System.out.print("Enter Bike Type: ");
        String bikeType = inp.nextLine();

        Bike bike = new Bike(bikeMake, bikeModel, bikeType);

        System.out.println("-----------------------");
        car.display();

        System.out.println("-----------------------");
        bike.display();

        inp.close();
    }
}