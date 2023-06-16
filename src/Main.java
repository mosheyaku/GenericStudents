/*Main class that implements the operations of SortedGroup
and OperationsOnCollections classes on objects of Student type.*/
public class Main {
    private static SortedGroup<Student> group;

    /*A static method that adds few students to the collection.*/
    private static void addStudentsCollection() {
        addNewStudent("Chris pratt", 111, 80);
        addNewStudent("Dave Bautista", 222, 59);
        addNewStudent("Zoe Saldana", 333, 70);
        addNewStudent("Karen Gillan", 444, 90);
        addNewStudent("Vin Diesel", 555, 55);
        addNewStudent("Bradley Cooper", 666, 59);
    }

    /*A static method that adds a new student to the collection*/
    private static void addNewStudent(String name, int id, int grade) {
        Student student = new Student(name, id, grade);
        group.add(student);
    }


    /*A static method that prints all members of the collection.*/
    private static void printCollection(SortedGroup<Student> group, String message) {
        System.out.println(message);
        printStudents(group);
    }

    /*An auxiliary static method for printing all members of the collection.*/
    private static void printStudents(SortedGroup<Student> group) {
        for (Student student : group) {
            System.out.println(student.toString());
        }
    }

    /*A static method that receives details of a student and removes all students
    in the collection whose grades are equal to the grade that the method received.*/
    private static void removeStudentsWithSameGrade(String name, int id, int grade){
        System.out.printf("\nRemove all students with a %d grade:",grade);
        Student removeSameGrade = new Student(name, id, grade);
        int removedCount = group.remove(removeSameGrade);
        System.out.println("\nRemoved " + removedCount + " students.");
    }

    /*main method that implements the operations of SortedGroup
    and OperationsOnCollections classes on objects of Student type.*/
    public static void main(String[] args) {
        group = new SortedGroup<>();
        addStudentsCollection();

        printCollection(group,"Original Collection:");

        removeStudentsWithSameGrade("William Poulter", 777, 59);

        printCollection(group,"\nUpdated Collection:");

        Student thresholdStudent = new Student("Sean Gunn", 888, 60);
        SortedGroup<Student> reducedGroup = OperationsOnCollections.reduce(group, thresholdStudent);

        printCollection(reducedGroup,"\nReduced Collection (showing students that has grade greater than 60):");

    }
}
