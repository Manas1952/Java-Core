package Encapulation;

public class Student{

    private String college="VGEC";

    public String getCollege(){
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

class Student1 {
    public static void main(String[] args) {
        Student student = new Student();

        // error
        // student.college = "GEC";

        student.setCollege("GEC");

        System.out.println(student.getCollege());
    }
}