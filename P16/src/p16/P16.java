
package p16;
class add_2{
    int add_two(int a, int b){
        return a+b;
    }
}
public class P16 {
    public static void main(String[] args) {
        add_2 obj = new add_2();
        System.out.println(obj.add_two(1, 9));
    }
}
