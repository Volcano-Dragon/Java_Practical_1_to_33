package p33;

public class P33 {

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        System.out.println("append: "+str.append(" World"));
        System.out.println("index 1: "+str.charAt(1));
        System.out.println("index 0 to 2: "+str.substring(0, 2));
        System.out.println("index of e: "+str.indexOf("e"));
        System.out.println("Reverse: "+str.reverse());
                
}
    
    
}
