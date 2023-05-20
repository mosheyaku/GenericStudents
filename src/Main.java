public class Main {

    private static void printStudents(SortedGroup<Student> group) {
        for (Student student : group) {
            System.out.println(student.toString());
        }
    }

    private static void addNewStudent(SortedGroup<Student> group, String name, int id, int grade) {
        Student student = new Student(name, id, grade);
        group.add(student);
    }

    public static void main(String[] args) {
        SortedGroup<Student> group = new SortedGroup<>();

        addNewStudent(group, "Chris pratt", 111, 80);
        addNewStudent(group, "Dave Bautista", 222, 59);
        addNewStudent(group, "Zoe Saldana", 333, 70);
        addNewStudent(group, "Karen Gillan", 444, 90);
        addNewStudent(group, "Vin Diesel", 555, 55);
        addNewStudent(group, "Bradley Cooper", 666, 59);

        /*
        Student student1 = new Student("Chris pratt", 111, 80);
        Student student2 = new Student("Dave Bautista", 222, 60);
        Student student3 = new Student("Zoe Saldana", 333, 70);
        Student student4 = new Student("Karen Gillan", 444, 90);
        Student student5 = new Student("Vin Diesel", 555, 55);
        Student student6 = new Student("Bradley Cooper", 666, 60);


         group.add(student1);
        group.add(student2);
        group.add(student3);
        group.add(student4);
        group.add(student5);
        group.add(student6);
        */

        System.out.println("Original Collection:");
        printStudents(group);

        System.out.println("Remove all students with a 60 grade:");
        Student studentToRemove = new Student("William Poulter", 777, 59);
        int removedCount = group.remove(studentToRemove);
        System.out.println("\nRemoved " + removedCount + " students.");


        System.out.println("\nUpdated Collection:");
        printStudents(group);


        Student thresholdStudent = new Student("Sean Gunn", 888, 60);
        SortedGroup<Student> reducedGroup = OperationsOnCollections.reduce(group, thresholdStudent);

        System.out.println("\nReduced Collection (showing students that has grade greater than 60):");
        printStudents(reducedGroup);
    }
}
