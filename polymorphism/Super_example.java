package polymorphism;

class Person{
    int id;

    String name;

    Person(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class Employee extends Person{
    float salary;

    Employee(int id,String name,float salary){

        // To initialize all the property, we are using parent class constructor from child class.
        super(id,name);

        this.salary=salary;
    }

    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}

public class Super_example {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "Manas", 15000);

        employee.display();
    }
}
