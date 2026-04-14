public class Student {

    private int rollNo;
    private String name;
    private int age;
    private String course;
    private int marks;

    public Student(int rollNo, String name, int age, String course, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public int getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(int marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "Name: " + name +
               ", Roll No: " + rollNo +
               ", Age: " + age +
               ", Course: " + course +
               ", Marks: " + marks;
    }
}