package JavaBasics.src.Day2;

public class EnumTest {
    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY
    }
    public static void main(String[] args) {
        Level val = Level.LOW;
        System.out.println(val);

//        Days day = Days.WEDNESDAY;
//        System.out.println(day);

        for(Days day : Days.values()) {
            System.out.println(day);
        }
    }
}
