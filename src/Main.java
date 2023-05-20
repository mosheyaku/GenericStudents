public class Main {

    private static SortedGroup<Student> group;

    private static void addStudentsCollection() {
        addNewStudent("Chris pratt", 111, 80);
        addNewStudent("Dave Bautista", 222, 59);
        addNewStudent("Zoe Saldana", 333, 70);
        addNewStudent("Karen Gillan", 444, 90);
        addNewStudent("Vin Diesel", 555, 55);
        addNewStudent("Bradley Cooper", 666, 59);
    }

    private static void addNewStudent(String name, int id, int grade) {
        Student student = new Student(name, id, grade);
        group.add(student);
    }


    private static void printCollection(SortedGroup<Student> group, String message) {
        System.out.println(message);
        printStudents(group);
    }

    private static void printStudents(SortedGroup<Student> group) {
        for (Student student : group) {
            System.out.println(student.toString());
        }
    }

    private static void removeStudentsWithSameGrade(String name, int id, int grade){
        System.out.printf("\nRemove all students with a %d grade:",grade);
        Student removeSameGrade = new Student(name, id, grade);
        int removedCount = group.remove(removeSameGrade);
        System.out.println("\nRemoved " + removedCount + " students.");
    }

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
