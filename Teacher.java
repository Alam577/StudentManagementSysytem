public class Teacher {

    private int t_id;
    private String t_name;
    private String t_subject;

    Teacher( int t_id,String t_name,String t_subject)
    {
        this.t_id=t_id;
        this.t_name=t_name;
        this.t_subject=t_subject;
    }
    public String get_subject() {
        return t_subject;
    }
    public int getT_id()
    {
        return this.t_id;
    }
    public String getTname()
    {
        return this.t_name;
    }
    @Override
    public String toString()
    {
        return " Teacher ID "+this.t_id+  "Teacher Name "+this.t_name +" course "+this.t_subject;
    }


    public static void main(String[] args) {
        Teacher t1=new Teacher(1,"OP","JAVA" );
       System.out.println(t1);
        
    }
}
