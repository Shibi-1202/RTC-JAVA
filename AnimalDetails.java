import java.util.Scanner;
class Animal {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }
}

class Mammal extends Animal {
    private boolean hasFur;

    public Mammal(String species, boolean hasFur) {
        super(species);
        this.hasFur = hasFur;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String species, boolean hasFur, String breed) {
        super(species, hasFur);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void display() {
	System.out.println("----------------------------------------");
        System.out.println("Species: " + getSpecies());
        System.out.println("Has Fur: " + isHasFur());
        System.out.println("Breed: " + getBreed());
    }
}

public class AnimalDetails {
    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
        System.out.print("Enter Species name:");
	String speciesname = inp.nextLine();
	System.out.print("Does It have Fur(true/false):");
	boolean fur = inp.nextBoolean();
	inp.nextLine();
	System.out.print("Enter the Breed:");
	String breed = inp.nextLine();

    Dog dog = new Dog(speciesname, fur, breed);

        
    dog.display();
    inp.close();
    }
}