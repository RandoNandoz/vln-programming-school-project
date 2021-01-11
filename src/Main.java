import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        ArrayList<String> courses = new ArrayList<>();
        School mySchool = new School(teachers, students, courses, "Hypothetical Secondary", "English", "Secondary");
        // Let's hire some teachers!
        mySchool.addTeacher(new Teacher("Evangeline", "Hess", "English"));
        mySchool.addTeacher(new Teacher(" Abdirahman", "Keeling", "Science"));
        mySchool.addTeacher(new Teacher("Joe", "Rush", "Math"));

        // There's nobody to teach.
        mySchool.addStudent(new Student("Alice", "Graves", 9, UUID.randomUUID()));
        mySchool.addStudent(new Student("Bill", "Hussain", 10, UUID.randomUUID()));
        mySchool.addStudent(new Student("Charlie", "Wilson", 11, UUID.randomUUID()));
        mySchool.addStudent(new Student("David", "Brown", 10, UUID.randomUUID()));
        mySchool.addStudent(new Student("Ella", "Oneal", 10, UUID.randomUUID()));
        mySchool.addStudent(new Student("Frank", "Burke", 8, UUID.randomUUID()));
        mySchool.addStudent(new Student("Garry", "Cruz", 12, UUID.randomUUID()));
        mySchool.addStudent(new Student("Hector", "Hagan", 8, UUID.randomUUID()));
        mySchool.addStudent(new Student("Ivy", "Rossi", 8, UUID.randomUUID()));
        mySchool.addStudent(new Student("Jennifer", "Lee", 9, UUID.randomUUID()));

        // Performance review for the faculty.
        System.out.println(mySchool.getTeachers());
        // Seems like some of the teachers are not performing as expected.
        // Let's fire Joe Rush, in the Mathematics department.
        mySchool.removeTeacherByName("Joe", "Rush");
        // Let's also fire an English teacher, because English is a boring class.
        // Say goodbye to Evangeline Hess of the English department.
        mySchool.removeTeacherByName("Evangeline", "Hess");

        // See if they've been fired...
        System.out.println(mySchool.getTeachers());

        // Let's check attendance this morning.
        System.out.println(mySchool.getStudents());
        // It seems like David has passed away. Time to remove him.
        mySchool.removeStudentById(mySchool.getStudentUUIDByNameAndGrade("David", "Brown", 10));
        System.out.println(mySchool.getStudents());
    }
}
