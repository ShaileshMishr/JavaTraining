package JavaBasics.src.Day7;

public class IDExistException extends Exception{

    public IDExistException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "IDExistException{}";
    }
}

