package lab3;
import java.util.Scanner;
public class Lab3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");

        int n = sc.nextInt();
        int i;
        for(i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                System.out.println("Not Prime");    
                break;
            }
        }
            if(n%i!=0){
                System.out.println("Prime");
            }
        }
        
    }
