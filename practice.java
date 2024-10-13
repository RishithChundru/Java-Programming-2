import java.util.*;
import java.lang.*;
import java.io.*;
/*interface animal{
    void sound();
    default void display(){
        System.out.println("Animal makes sound");
    }
}
class Cat implements animal{
    public void sound(){
        System.out.println("Cat makes sound as meow meow!");
    }
}
class Dog implements animal{
    public void sound(){
        System.out.println("Dog makes sound as bow bow!");
    }
}
public class practice {
    public static void main(String[] args){
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.sound();
        dog.sound();
    }
}*/
/*interface shape{
    double getArea();
    double getPerimeter();
}
abstract class Quadrilateral implements shape{
    abstract double getLength();
    abstract double getWidth();
}
class Rectangle extends Quadrilateral{
    private double length;
    private double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
class Square extends Quadrilateral{
    private double side;
    Square(double side){
        this.side=side;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }
    public double getLength(){
        return side;
    }
    public double getWidth(){
        return side;
    }
}
public class practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length: ");
        double length=sc.nextDouble();
        System.out.println("Enter width: ");
        double width=sc.nextDouble();
        Rectangle r=new Rectangle(length, width);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println("Enter side: ");
        double side=sc.nextDouble();
        Square s=new Square(side);
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        System.out.println(s.getLength());
        System.out.println(s.getWidth());
    }
}*/


/*public class practice {
    public static void main(String[] args) {
        // Example 1: Basic lambda expression
        MyFunctionalInterface add = (a, b) -> a + b;
        int result1 = add.operation(10, 5);
        System.out.println("Result of addition: " + result1);
        
        // Example 2: Lambda expression with multiple lines of code
        MyFunctionalInterface multiply = (a, b) -> a*b;
        int result2 = multiply.operation(10, 5);
        System.out.println("Result of multiplication: " + result2);
        
        // Example 3: Lambda expression with no parameters
        NoArgInterface noArg = () -> {
            System.out.println("Hello, Lambda!");
        };
        noArg.sayHello();
    }
}

// Functional Interface with one abstract method
interface MyFunctionalInterface {
    int operation(int a, int b);
}

// Functional Interface with no abstract method
interface NoArgInterface {
    void sayHello();
}
*/
interface My{
    int operation(int a,int b);
}
public class practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        My add=(a,b)->a+b;
        int res=add.operation(x,y);
        System.out.println(res);
        My mul=(a,b)->a*b;
        int res1=mul.operation(x,y);
        System.out.println(res1);
    }
}