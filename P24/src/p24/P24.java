package p24;

public class P24 {
    public static void main(String[] args) {
        int numm = 5573;
        System.out.print("\nSum of digits of "+numm+" is = ");
        String numm_str = String.valueOf(numm); 
        numm = 0;
        for(int i = 0; i <= numm_str.length()-1; i++)
            numm+=Integer.parseInt(numm_str.substring(i, i+1));
        System.out.println(numm);
    }
}

