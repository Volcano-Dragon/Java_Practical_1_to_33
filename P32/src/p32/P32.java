
package p32;


public class P32 {

    public static void main(String[] args) {
        char[] c = {'a','b'};
        System.out.println("int to str: "+String.valueOf(1234));
        System.out.println("Message: "+String.join("hello,"," hi,"," bye,"));
        System.out.println("one: "+String.format("%d", 1));
        System.out.println("array to str: "+String.copyValueOf(c));
        System.out.println("Length of \"ab\": "+"ab".length());
    }
    
}
