class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;  
    }

    public String getName() {
        return name;
    }
}

abstract class AbstractClass {
    public abstract void display();  
}

class Child extends Parent {
    public Child(String name) {
        super(name); 
    }

    public void display() {
        System.out.println("Name: " + getName());
    }
}

public class ThisSupAbs {
    public static void main(String[] args) {
        Child child = new Child("Charlie");
        child.display();  
    }
}
