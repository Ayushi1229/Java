package lab2;
import java.util.Scanner;
public class Lab2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        System.out.println("Enter b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of numbers is "+sum);
    }
}
