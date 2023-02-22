package Inheritance;

class Address {
    String city;
    String country;

    Address (String city, String country) {
        this.city = city;
        this.country = country;
    }
}

class Employee {
    int id;

    String name;

    Address address;

    Employee(int id, String name, Address address){
        this.address = address;
        this.id = id;
        this.name = name;
    }

    void print(){
        System.out.println(id + " " + name);

        System.out.println(address.city + " " + " " + address.country);
    }
}

// HAS-A relationship
public class Aggregation {
    public static void main(String[] args) {

        Address emp1Address = new Address("Ahmedabad", "Gujarat");
        Employee employee1 = new Employee(1, "A", emp1Address);

        Address emp2Address = new Address("Surat", "Gujarat");
        Employee employee2 = new Employee(2, "B", emp1Address);

        employee1.print();

        employee2.print();
    }
}
