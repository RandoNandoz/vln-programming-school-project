public class Teacher {
    private String firstName;
    private String lastName;
    private String teachingSubject;

    public Teacher(String firstName, String lastName, String teachingSubject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teachingSubject = teachingSubject;
    }

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
