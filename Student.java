public class Student {

   private int roll_no;
   private String name;
   private int age;
   private String course;
   private int marks;

    public Student( int roll_no,String name,int age,String course,int marks)
    {
        this.roll_no= roll_no;
         this.name=name;
         this.age=age;
         this.course=course;
        this.marks=marks;
    }
    
    public int getRollNo() { return roll_no; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public int getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setCourse(String course) { this.course = course; }
    public void setMarks(int marks) { this.marks = marks; }



    protected String getDetails()
    {
        return "Name"+this.name + " roll_no "+this.roll_no+ " age " + this.age+" course "+this.course+" marks "+this.marks;
    }


    public static void main(String args [])
    {
        Student s1=new Student(1,"Aa", 20, "MCA", 78);
        System.out.println(s1.getDetails());
    }

    
}