

import java.util.*;
public class P1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        System.out.println(""+((num%2==0) ? "Even" : "Odd"));
    }
    
}

