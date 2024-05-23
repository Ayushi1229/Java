package lab3;
import java.util.Scanner;
public class Lab3_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a,b,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(b>c){
                System.out.println("a is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
        else if(b>a){
            if(a>c){
                System.out.println("b is greatest");
            }
            else{
                System.out.println("c is greatest"); 
            }
        }
    }
}

