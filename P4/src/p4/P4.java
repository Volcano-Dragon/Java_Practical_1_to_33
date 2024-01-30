package p4;

public class P4 {

    public static void main(String[] args) {
        int a,b,c;
        a = 100;
        b = -80;
        c = 30;
        if(a < b)
            if(a < c)
                System.out.println("A is lowest");
            else
                System.out.println("C is lowest");
        else if(b < a && b < c)
            System.out.println("B is lowest");
        else
            System.out.println("C is lowest");
    }
    
}
