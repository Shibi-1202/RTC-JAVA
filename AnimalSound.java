class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); 

        Dog myDog = new Dog();
        myDog.makeSound(); 
    }
}
