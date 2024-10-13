import java.util.Scanner;
public class RemoveVowels{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String res=input.replaceAll("[aeiouAEIOU]","");
        System.out.println(res);
    }
}