// Create a Student class with id, name and grade fields, while creating student objects
// if an id already exist and user tries to create another object with same id then a custom
// exception should be thrown which displays "USERID ALREADY EXIST"

package JavaBasics.src.Day5;

public class Student {

    private int id;
    private String name;
    private char grade;

    public Student(int id, String name, char grade) throws CandidateException {

        if(!(this.id == id))
            this.id=id;
        else
            throw new CandidateException("ID ALREADY EXIST ");

        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws CandidateException {
        if(!(this.id == id))
            this.id=id;
        else
            throw new CandidateException("ID ALREADY EXIST ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
