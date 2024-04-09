package lab2;
import java.util.Scanner;
public class Lab2_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter operation:");
        String operation = sc.next();
        switch(operation){
            case "+" : {
                System.out.println(a+b);
                break;
                }
            case "-" : {
                System.out.println(a-b);
                break;
                }
            case "*" : {
                System.out.println(a*b);
                break;
                }
            case "/" : {
                System.out.println((float)a/b);
                break;
                }
        }
        
    }
}
