
package p27;
import java.util.*;

public class P27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        if(age < 18){
            throw new ArithmeticException("Below 18");
        }
    }
    
}
