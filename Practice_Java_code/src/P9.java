/*
9. Develop a simple online shopping system. Create a base class Product with attributes 
productId, productName, and price. Derive classes Electronics, Clothing, and Books from 
Product. Add specific attributes for each product type. 
Create objects for each class and demonstrate polymorphism by displaying product details.
 */

class Product{
    int ID;
    String name = "NULL";
    float price;
    void check_po(int a){
        System.out.println("Product wala hai");}
}
class books extends Product{
    String name = "NCERT";
    void check_po(int a){
        System.out.println("books wala hai");}
    int pages;
}
class Cloth extends Product{
    int size;
    void check_po(int a){
        System.out.println("cloth wla hai");  
    }
}
class electronic extends Product{
    String name;
    int power_consumtion;}

public class P9 {

    public static void main(String[] args) {
        Product p = new Product();
        books b = new books();
        Cloth c = new Cloth();
        p.check_po(6);
        b.check_po(4);
        c.check_po(5);
    
    }
    
}