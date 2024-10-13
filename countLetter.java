import java.util.*;
public class countLetter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char let=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==let){
                count++;
            }
        }
        System.out.println(count);
    }
}