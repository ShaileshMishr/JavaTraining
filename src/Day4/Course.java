//  Create a Course class witn courseId, courseName and fee fields. Create at least 5 course objects.
//  User can search for a course either by courseId or by course name. your output should display:
//  "Course is available" alongwith course details or "COURSE NOT FOUND"

package JavaBasics.src.Day4;

public class Course {
    private int courseId;
    private String courseName;
    private double fee;

    public Course(int courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", fee=" + fee +
                '}';
    }
}
