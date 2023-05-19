public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int grade;

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(grade, other.grade);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade;
    }
}