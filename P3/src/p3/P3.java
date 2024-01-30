package p3;

public class P3 {

    public static void main(String[] args) {
        int a,b,c;
        a = 100;
        b = 80;
        c = 30;
        if(a > b)
            if(a > c)
                System.out.println("A is greatest");
            else
                System.out.println("C is greatest");
        else if(b > a && b > c)
            System.out.println("B is greatest");
        else
            System.out.println("C is greatest");
    }
    
}
