import java.util.*;
import java.util.regex.*;
public class P4 {

    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       String c = inp.next();
       Pattern p = Pattern.compile("[aeiou]");
       Matcher m = p.matcher(c.toLowerCase());
       Pattern ab = Pattern.compile("[a-z]");
       Matcher m2 = ab.matcher(c.toLowerCase());
       if (!(m2.matches() && c.length()==1)){
           System.out.println("Invalid input");
           System.exit(1);
       }
       System.out.println((m.matches()) ? "Vowel":"Consonants");
       
    }
    
}
