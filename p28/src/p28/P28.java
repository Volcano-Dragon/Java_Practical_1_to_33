
package p28;

import java.util.*;
public class P28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        try{
            if(age < 18){
                throw new ClassNotFoundException("Below 18");
            }
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
}
