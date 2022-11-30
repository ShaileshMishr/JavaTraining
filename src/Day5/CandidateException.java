package JavaBasics.src.Day5;

public class CandidateException extends Exception{

    public CandidateException(String s){
        super(s);
    }

    @Override
    public String toString() {
        return "CandidateException{}";
    }
}
