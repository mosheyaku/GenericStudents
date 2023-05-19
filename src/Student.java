public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int score;

    public Student(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(score, other.score);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Score: " + score;
    }
}