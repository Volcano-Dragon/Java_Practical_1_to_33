
package p10;
import java.util.Scanner;
import java.util.regex.Pattern;
public class P10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String c = input.next();
        String vow = "aeiou";
        if(c.length()!= 1)
            System.out.println("Invalid length");
        else if(!Pattern.matches("[a-zA-Z]", c))
            System.out.println("Only char is allowed");
        else if(vow.contains(c))
            System.out.println("Vowel");
        else
            System.out.println("Consonants");
        
    }
    
}
