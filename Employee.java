import java.util.Scanner;
public class Employee {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Employee ID: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.print("Employee name: ");
        String name=sc.nextLine();
        System.out.print("Monthly salary: ");
        double salary=sc.nextDouble();
        System.out.println("Employee ID: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Monthly Salary: "+salary);
        System.out.println("Annnual Salary: "+(12*salary));
    }
}
