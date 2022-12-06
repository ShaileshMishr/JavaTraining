package JavaBasics.src.Day10Thread;

public class TableMain {

    public static void main(String[] args) {

        TableObject obj = new TableObject();

        Table t1 = new Table(obj,"FIRST");
        Table t2 = new Table(obj,"SECOND");
    }
}
