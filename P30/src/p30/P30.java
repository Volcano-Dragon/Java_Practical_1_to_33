
package p30;


public class P30 {

    
    public static void main(String[] args) {
        String ten = "10";
        int num = Integer.parseInt(ten);
        
        String one = "1";
        int num1 = Integer.valueOf(one);
        
        System.out.println("str to int: "+num);
        System.out.println("str to int: "+num1);
        System.out.println("Max: "+Integer.max(num, num1));
        System.out.println("Min: "+Integer.min(num, num1));
        System.out.println("Sum: "+Integer.sum(num, num1));
    }
    
}
