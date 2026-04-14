import java.util.ArrayList;

class StudentService {
    private ArrayList<Student> students;

    // Constructor
    StudentService() {
        students = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added: " + s);
    }

    // Display Students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // Delete Student
    public void deleteStudent(int id) {
        Student s = getStudentById(id);

        if (s != null) {
            students.remove(s);
            System.out.println("Student removed: " + s);
        } else {
            System.out.println("Student not found.");
        }
    }

    // Get Student by ID
    public Student getStudentById(int id) {
        for (Student s : students) {
            if (s.getRollNo() == id) {
                return s;
            }
        }
        return null;
    }
}