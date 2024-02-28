package p25;

public class P25 {

    public static void main(String[] args) {
        try{
            int a = 0/0;
        }
        catch(Exception e){
            System.out.println("Division by 0");
            System.out.println("Original msg: \n"+e);
        }
    }
    
}
