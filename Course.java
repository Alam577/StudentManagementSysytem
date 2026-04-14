public class Course {
    private int courseId;
    private String courseName;

    // Constructor
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // Getters
    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    // toString
    @Override
    public String toString() {
        return "Course ID: " + courseId +
               ", Course Name: " + courseName;
    }
}