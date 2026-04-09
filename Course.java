public class Course {
    private int course_id;
    private String courseName;

    Course(int course_id, String courseName )
    {
        this.course_id=course_id;
        this.courseName=courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getCourse_id() {
        return course_id;
    }
    public String toString()
    {
        return "Course ID : " +this.course_id+" Course Name " +this.courseName;
    }
    public static void main(String[] args) {
        Course c1=new Course(22, "JAVA");
        System.out.println(c1.toString());
        
    }
    
}
