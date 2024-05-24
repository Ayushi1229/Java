package lab4;
import java.util.Scanner;
public class Lab4_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int sum = 0;
        for(int i=0;i<4;i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (sum/4.0);
        System.out.println(avg);
    }
}
