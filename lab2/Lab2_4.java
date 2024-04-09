package lab2;
import java.util.Scanner;
public class Lab2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Fahrenheit temperature:");
        double f = sc.nextDouble();
        double c =(((f-32)*5)/9);
        
        System.out.println(c);
    }
}
