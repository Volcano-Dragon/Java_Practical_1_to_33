package p18;
class Person{
    int age;
    String name;
}

class Employee extends Person{
    int ID;
    float Salary;
}
public class P18 {
    public static void main(String[] args) {
        System.out.println("Creating the object for Person class...");
        Person p1 = new Person(); // p1 dont have access to the ID and Salary attributes of Employee class
        p1.age = 56;
        p1.name = "garv";
        System.out.println("Creating the object for Employee class...");
        Employee e1 = new Employee(); // e1 have access to the attributes [name, age] of person class
        e1.ID = 15;
        e1.Salary = 550.50f;
        e1.age = 56;
        e1.name = "Rabu";
    }
}