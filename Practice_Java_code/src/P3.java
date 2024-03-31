
public class P3 {

    public static void main(String[] args) {
        int n = 15;
        int a = 0;
        int b = 1;
        int c = a+b;
        System.out.print(a+", "+b+", ");
        for(int i=0;i<=n;i++){
            System.out.print((c)+", ");
            a = b;
            b = c;
            c = a+b;
        }
        
    }
    
}
