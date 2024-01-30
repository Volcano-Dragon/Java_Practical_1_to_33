
package p5;
import java.util.Scanner;
public class P5 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        String s = a%2==0?"even":"odd";
        System.out.println(s);
    }
}

