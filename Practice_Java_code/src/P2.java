

import java.util.*;

public class P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        System.out.println("Enter choice.\n1 for km to mile\n2 for mile to km\nEnter: ");
        int ch = input.nextInt();
        
        System.out.println("Enter distance: ");
        Double dis = input.nextDouble();
        
        System.out.println("Result: "+((ch==1)?(dis/1.6):dis*1.6));
    }
    
}
