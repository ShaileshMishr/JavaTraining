package JavaBasics.src.Day3;

public class Animal {

    String name;
    String hairColor;

    Animal(String name, int age) {
        System.out.println("Animal Constructor ");
    }

    public String getAnimalInfo(){
        return name+ ": " +hairColor;
    }
}
