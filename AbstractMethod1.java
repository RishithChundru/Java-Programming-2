import java.util.Scanner;
abstract class Shape{
    abstract void show();
}
class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    void show(){
        System.out.println("Area: "+(Math.PI*radius*radius));
    }
}
class Rectangle extends Shape{
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    void show(){
        System.out.println("Area: "+length*width);
    }
}
public class AbstractMethod1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        int radius=sc.nextInt();
        System.out.println("Enter length and width: ");
        int length=sc.nextInt();
        int width=sc.nextInt();
        Circle c=new Circle(radius);
        c.show();
        Rectangle r=new Rectangle(length, width);
        r.show();

    }
}
