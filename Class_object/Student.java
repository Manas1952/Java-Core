package Class_object;

public class Student {
    static int id;
    int age;

    int computeId() {
        return id ++;
    }
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.age = 21;

        System.out.println(student1.computeId());

        Student student2 = new Student();

        student2.age = 22;

        System.out.println(student1.computeId());

        // print last updated value
        System.out.println(Student.id);
        System.out.println(Student.id);
    }
}
