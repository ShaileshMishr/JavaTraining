package JavaBasics.src.Day3;

public class Dog extends Animal{
//    public String getDogInfo() {
//        return getAnimalInfo();
// }

    Dog(String str, int age) {
        super(str , age);
        System.out.println("Dog Constructor ::");
    }

    public String getAnimalInfo() {    //method overriding
        return "Overriding getAnimalInfo method";
    }
}
