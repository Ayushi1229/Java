package lab3;
import java.util.Scanner;
public class Lab3_2 {
            public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a character string : ");
            String input = sc.nextLine();
            String st = "abcd";
            String rev = "";
            int length = input.length();
            for(int i=length-1;i>=0;i--){
                rev = rev + input.charAt(i);
            }
            if(input.equals(rev)){
                System.out.println("Palindrom");
            }
            else{
                System.out.println("Not Palindrom");
            }
        }        
}
