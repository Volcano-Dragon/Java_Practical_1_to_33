/*
Create a class Person with attributes name and age. Derive a class Employee from 
Person with additional attributes employeeId and salary. Create objects
of both classes and demonstrate how inheritance works in accessing the attributes of the base class.


 */

class person{
int age;
String name;
}

class emp extends person{
int salary;
int id;
}
public class P8 {


    public static void main(String[] args) {
        emp e1 = new emp();
        e1.age = 15;
        e1.name = "Garv";
        e1.id = 456;
        e1.salary = 4500;
        
        System.out.println(e1.age+" "+e1.id+" "+e1.salary+" "+e1.name);
    }
    
}
