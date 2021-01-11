import java.util.ArrayList;
import java.util.UUID;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<String> courses;
    private String name;
    private String languageOfInstruction;
    private String level;


    public School(ArrayList<Teacher> teachers, ArrayList<Student> students, ArrayList<String> courses, String name, String languageOfInstruction, String level) {
        this.teachers = teachers;
        this.students = students;
        this.courses = courses;
        this.name = name;
        this.languageOfInstruction = languageOfInstruction;
        this.level = level;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Remove a teacher by their name.
    public void removeTeacherByName(String firstName, String lastName) {
        // Iterate through the arraylist of teachers,
        for (int i = 0; i < this.teachers.size(); i++) {
            // If the teacher at position i's name has the same name as the inputted name of the parameters,
            if (this.teachers.get(i).getFirstName().equals(firstName) && this.teachers.get(i).getLastName().equals(lastName)) {
                // remove them.
                this.teachers.remove(i);
            }
        }
    }

    // Find the UUID of the student, and remove them from the arraylist.
    public void removeStudentById(UUID uuid) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getStudentId() == uuid) {
                this.students.remove(i);
            }
        }
    }

    // Get the UUID of the student with their name and grade.
    public UUID getStudentUUIDByNameAndGrade(String firstName, String lastName, int grade) {
        UUID returnVal = null;
        // Iterate through the length of the list of students.
        for (int i = 0; i < this.students.size(); i++) {
            // The current student is the student being iterated through.
            Student currentStudent = this.students.get(i);
            // If their name and grade correlate to the requested name and grade, return their UUID.
            if (currentStudent.getFirstName().equals(firstName) && currentStudent.getLastName().equals(lastName) && currentStudent.getGrade() == grade) {
                returnVal = currentStudent.getStudentId();
            }
        }
        return returnVal;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public String getLanguageOfInstruction() {
        return languageOfInstruction;
    }

    public String getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLanguageOfInstruction(String languageOfInstruction) {
        this.languageOfInstruction = languageOfInstruction;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
