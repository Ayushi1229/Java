package lab4;
import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = str.length();
        System.out.println(i); 
        for(int j=i/2;j<i;j++){
            System.out.print(str.charAt(j));
        }
    }
}
