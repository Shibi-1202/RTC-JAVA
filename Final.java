final class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public final String getModel() {
        return model;
    }
}

// Attempting to extend the final class Car
// This will cause a compile-time error
/* 
class SportsCar extends Car {
    public SportsCar(String model) {
        super(model);
    }

    // Trying to override the final method getModel()
    public String getModel() {
        return "Sports " + super.getModel();
    }
}
*/

public class Final {
    public static void main(String[] args) {
        
        Car myCar = new Car("Tesla Model S");
        System.out.println("Car model: " + myCar.getModel()); 

        // The following line would cause an error if SportsCar is defined
        // SportsCar mySportsCar = new SportsCar("Tesla Model S");
    }
}
