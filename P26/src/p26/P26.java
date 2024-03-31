
package p26;

public class P26 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
        arr[6]=55;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            //e.printStackTrace();
        }
    }
    
}
