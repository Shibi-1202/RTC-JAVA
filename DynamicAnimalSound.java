class Animals {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animals {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class DynamicAnimalSound {
    public static void printSound(Animals a) {
        a.makeSound(); 
    }

    public static void main(String[] args) {
        Animals myAnimal = new Animals();
        printSound(myAnimal); 

        Animals myDog = new Dogs();
        printSound(myDog); 
    }
}
