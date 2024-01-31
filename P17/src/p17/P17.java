package p17;

class stu{
private int no;
private String name;
private float marks1 = 10;
private float marks2 = 10;
private float marks3 = 10;

public void setNo(int num){
    no = num;
}
public void setName(String nam){
    name = nam;
}
public int getNo(){
return no;
}
public String getName(){
return name;
}
public String displayData(){
    return("Stu no.: "+getNo()+" Stu name: "+getName());
}
public float avg_marks(){
    return((marks1+marks2+marks3)/3.0f);

}
}
public class P17 {
    public static void main(String[] args) {
        stu s1 = new stu();
        s1.setNo(20);
        s1.setName("Garv"); 
        System.out.println("Students Detials:\n"+s1.displayData());
        System.out.println("Avg. Student marks: "+s1.avg_marks());
    }
    
}
