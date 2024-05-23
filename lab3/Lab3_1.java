package lab3;
import java.util.Scanner;
public class Lab3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m1 : ");
        double m1 = sc.nextDouble();
        System.out.println("Enter m2 : ");
        double m2 = sc.nextDouble();
        System.out.println("Enter m3 : ");
        double m3 = sc.nextDouble();    
        System.out.println("Enter m4 : ");
        double m4 = sc.nextDouble();
        System.out.println("Enter m5 : ");
        double m5 = sc.nextDouble();   
        double sum = (m1 + m2 + m3 + m4 + m5);
        double per = (sum/500)*100;
        System.out.println("Percentage is : "+per);
        if(per>=60){
            System.out.println("First Division");
        }
        else if(per>50){
            System.out.println("Second Division");
        }
        else if(per>40){
            System.out.println("Third Division");
        }
        else if(per<=40){
            System.out.println("Fourth Division");
        }
    }
}
