package lab4;
import java.util.Scanner;
public class Lab4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        if(str=="a" || str=="e" || str=="i" || str=="o" || str=="u"){
            
            System.out.println("str is vowel");
        }
        else{
            System.out.println("str is consonant");
        }
    }
}