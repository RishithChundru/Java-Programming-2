import java.util.*;
import java.io.*;
/*public class EqualsTo1 {
    private String name;
    private int age;
    EqualsTo1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean equals(Object obj){
        if (this==obj) {
            return true;
        }
        if(!(obj instanceof EqualsTo1)){
            return false;
        }
        EqualsTo1 e=(EqualsTo1)obj;
        return this.name.equals(e.name) && this.age==e.age;
    }
    public static void main(String[] args){
        EqualsTo1 e1=new EqualsTo1("Alice",19);
        EqualsTo1 e2=new EqualsTo1("Alice",19);
        boolean result=e1.equals(e2);
        System.out.println(result);
    }
}
*/
class Rectangle{
    private int length;
    private int breadth;
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Rectangle)){
            return false;
        }
        Rectangle rec=(Rectangle)obj;
        return this.length==rec.length && this.breadth==rec.breadth;
    }
}
class Circle{
    private int radius;
    Circle(int radius){
        this.radius=radius;
    }
    public boolean equals(Object obj1){
        if(this==obj1){
            return true;
        }
        if(!(obj1 instanceof Circle)){
            return false;
        }
        Circle cir=(Circle)obj1;
        return this.radius==cir.radius;
    }
}
public class EqualsTo1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length1 of rectangle: ");
        int length=sc.nextInt();
        System.out.println("Enter breadth1 of rectangle: ");
        int breadth=sc.nextInt();
        Rectangle r=new Rectangle(length, breadth);
        System.out.println("Enter length2 of rectangle: ");
        int length2=sc.nextInt();
        System.out.println("Enter breadth2 of the rectangle: ");
        int breadth2=sc.nextInt();
        Rectangle r2=new Rectangle(length2, breadth2);
        boolean result=r.equals(r2);
        System.out.println(result);
        System.out.println("Enter radius1 of circle: ");
        int radius=sc.nextInt();
        Circle c=new Circle(radius);
        System.out.println("Enter radius2 of circle: ");
        int radius2=sc.nextInt();
        Circle c2=new Circle(radius2);
        boolean result2=c.equals(c2);
        System.out.println(result2);
    }
}