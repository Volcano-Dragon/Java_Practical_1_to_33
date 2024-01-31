package p20;

class Product{
    int ID;
    String name = "NULL";
    float price;
    void check_po(int a){
        System.out.println("Int wala hai");}
}
class books extends Product{
    String name = "NCERT";
    void check_po(float a){
        System.out.println("float wala hai");}
    int pages;
}
class Cloth extends Product{
    int size;
    void check_po(double f){
        System.out.println("double wla hai");  
    }
}
class electronic extends Product{
    String name;
    int power_consumtion;}

public class P20 {

    public static void main(String[] args) {
        Product p = new Product();
        books b = new books();
        Cloth c = new Cloth();
        b.check_po(0.0f);
        b.check_po(0);
        c.check_po(1.0);
    
    }
    
}
