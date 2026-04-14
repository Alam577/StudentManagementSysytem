public class Teacher {

    private int tId;
    private String name;
    private String subject;

    // Constructor
    public Teacher(int tId, String name, String subject) {
        this.tId = tId;
        this.name = name;
        this.subject = subject;
    }

    // Getters
    public int getTId() {
        return tId;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    // toString
    @Override
    public String toString() {
        return "Teacher ID: " + tId +
               ", Name: " + name +
               ", Subject: " + subject;
    }
}