package JavaBasics.src.Day3;

public abstract class Toy {

    String name;
    String category;

   // public abstract void canPlay();

    protected abstract void canPlay();

    public void getToyDetails() {
        System.out.println("Toy Details : "+name +":"+category);
    }
}
