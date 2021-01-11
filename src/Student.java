import java.util.UUID;

public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private UUID studentId;

    public Student(String firstName, String lastName, int grade, UUID studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student {" +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", grade: '" + grade + '\'' +
                ", studentId: '" + studentId + '\'' +
                '}';
    }
}
