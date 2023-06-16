/*A Student class that preserves details about students.*/
public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int grade;

    /*A constructor that receives the student's name, ID and his grade.*/
    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    /*A method that returns the name of the student.*/
    public String getName() {
        return name;
    }

    /*A method that returns the id of the student.*/
    public int getId() {
        return id;
    }

    /*A method that returns the grade of the student.*/
    public int getGrade() {
        return grade;
    }

    /*A method that compares two students (The comparison is made between their grades).*/
    @Override
    public int compareTo(Student other) {
        return Integer.compare(grade, other.grade);
    }

    /*A method that prints the student's name, ID and grade*/
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade;
    }

    /*A method that receives an object of Object type, checks whether it is an
    instance of Student and if so, returns true if the grades of the current
    student and the received student are equal, otherwise it returns false.*/
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student))
            return false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return grade == student.grade;
    }
}