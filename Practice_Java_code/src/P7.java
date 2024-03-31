/*
. Write a Java program to create class Student. The class should have attributes student ID, 
student name, marks for 3 subjects and the member functions are setdata() and displaydata(). 
Calculate the average marks for student. 
 */

class Student{
        int stu_id;
        String name;
        double m1;
        double m2;
        double m3;
        double m4;
        
        void setdata(int id, String n, double m1,double m2,double m3,double m4){
        stu_id = id;
        name = n;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        }
        
        void getdata(){
            System.out.println("Name: "+name);
            System.out.println("ID: "+stu_id);
            System.out.println("Avg. marks: "+((m1+m2+m3+m4)/4));
      
        }
   
    }


public class P7 {    

    public static void main(String[] args) {
        Student s = new Student();
        s.setdata(1, "Garv",40, 39, 39, 39);
        s.getdata();
      

        
    }
    
}
