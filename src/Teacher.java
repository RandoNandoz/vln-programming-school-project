// The teacher class. Describes a teacher.
public class Teacher {
    // First name.
    private String firstName;
    // Last name.
    private String lastName;
    // Subject that the teacher is teaching.
    private String teachingSubject;

    // Teacher constructor. The parameter firstName is the first name,
    // lastName is the last name, teachingSubject is the teaching subject.
    public Teacher(String firstName, String lastName, String teachingSubject) {
        // Assign params to internal data structure.
        this.firstName = firstName;
        this.lastName = lastName;
        this.teachingSubject = teachingSubject;
    }

    // Override the toString() method so that we can print out the object itself with ease.
    @Override
    public String toString() {
        return "Teacher {" +
                "firstName: '" + firstName + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", teachingSubject: '" + teachingSubject + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
