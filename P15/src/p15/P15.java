
package p15;

public class P15{

    public static void main(String[] args) {
        int s = 0;
        for(int i = 1; i < 5; i++){
            for(int c=1;c<=i;c++){
            System.out.print((s+1)+" ");
            s+=1;
            }
            System.out.println("");
        }
    }
}
