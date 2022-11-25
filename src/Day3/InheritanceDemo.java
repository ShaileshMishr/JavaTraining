package JavaBasics.src.Day3;

public class InheritanceDemo {
    public static void main(String[] args) {

      //  Animal dog1 = new Dog();  // Parent class reference can refer to child class object

        Dog dog1 = new Dog("Test", 2);

        dog1.name = "Ted";
        dog1.hairColor = "Brown";
        System.out.println(dog1.getAnimalInfo());  // Dynamic Polymorphism
    }
}
