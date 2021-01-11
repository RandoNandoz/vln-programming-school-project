import java.util.UUID;

// This is the class for the student.
public class Student {
    // The student's first name.
    private String firstName;
    // The student's last name.
    private String lastName;
    // The student's grade.
    private int grade;
    // The student's UUID, assigned on creation of the student in the data schema.
    private UUID studentId;

    // Constructor for class.
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

    // Override the toString() method so that we can easily print this object.
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
