import java.util.ArrayList;
import java.util.UUID;

public class School {
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();
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

    public void removeTeacherByName(String firstName, String lastName) {
        for (int i = 0; i < this.teachers.size(); i++) {
            if (this.teachers.get(i).getFirstName().equals(firstName) && this.teachers.get(i).getLastName().equals(lastName)) {
                this.teachers.remove(i);
            }
        }
    }

    public void removeStudentById(UUID uuid) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getStudentId() == uuid) {
                this.students.remove(i);
            }
        }
    }

    public UUID getStudentUUID(String firstName, String lastName, int grade) {
        UUID returnVal = null;
        for (int i = 0; i < this.students.size(); i++) {
            Student currentStudent = this.students.get(i);
            if (currentStudent.getFirstName().equals(firstName) && currentStudent.getLastName().equals(lastName) && currentStudent.getGrade() == grade) {
                returnVal = currentStudent.getStudentId();
            }
        }
        return returnVal;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }
}
