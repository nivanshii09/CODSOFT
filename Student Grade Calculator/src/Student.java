public class Student {

    private final String name;
    private final int rollNumber;
    private final String[] subjects;
    private final int[] marks;

    public Student(String name, int rollNumber, String[] subjects, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int[] getMarks() {
        return marks;
    }
}
