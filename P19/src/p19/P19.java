package p19;
        
class Shape{
    float length;
}
class triangle extends Shape{
    void area(float h){
        System.out.println("Area of Triangle: "+(length*h*0.5));
    }
    void perimeter(){
        System.out.println("Perimeter of Triangle: "+(length*3));
}
}
class Rectangle extends Shape{
    void area(float h){
        System.out.println("Area of Rectanlge: "+(length*h));
    }
    void perimeter(float h){
        System.out.println("Perimeter of Rectangle: "+((length*2)+(h*2)));
}
}
    
class Circle extends Shape{
    void area(){
        System.out.println("Area of Circle: "+(3.14*length*0.5*length*0.5));
    }
    void perimeter(){
        System.out.println("Perimeter of Circle: "+(2*3.14*length*0.5));
    }
}

public class P19 {
    public static void main(String[] args) {
        Circle cir = new Circle();
        Rectangle rect = new Rectangle();
        triangle tri = new triangle();
        cir.length = 10;
        rect.length = 20;
        tri.length = 30;
        cir.area();
        cir.perimeter();
        rect.area(10);
        rect.perimeter(10);
        tri.area(50);
        tri.perimeter();
        
    }
    
}
