
package p7;
import java.util.Scanner;
public class P7 {

    public static void main(String[] args) {
        System.out.println("Enter the temp. : ");
        Scanner input = new Scanner(System.in);
        float temp = input.nextFloat();
        System.out.println("1 for C to F\n2 for F to C");
        int cho = input.nextInt();
        if(cho == 1)
            System.out.println("Temp in F: "+(temp*1.8f+32));
        else
            System.out.println("Temp in C: "+((temp-32)*(0.56f)));
    }
    
}
