package lab4;
import java.util.Scanner;

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        String element = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < element.length(); i++) {
            if (Character.isUpperCase(element.charAt(i))) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The element is present in the list.");
        } else {
            System.out.println("The element is not present in the list.");
        }
    }
}