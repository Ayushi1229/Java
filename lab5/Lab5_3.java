import java.util.Scanner;

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalVowels = 0;
        int[] vowelCounts = new int[5];

        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String input = sc.nextLine().toLowerCase();

            if (input.equals("quit")) {
                break;
            }

            for (char ch : input.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    switch (ch) {
                        case 'a':
                            vowelCounts[0]++;
                            totalVowels++;
                            break;
                        case 'e':
                            vowelCounts[1]++;
                            totalVowels++;
                            break;
                        case 'i':
                            vowelCounts[2]++;
                            totalVowels++;
                            break;
                        case 'o':
                            vowelCounts[3]++;
                            totalVowels++;
                            break;
                        case 'u':
                            vowelCounts[4]++;
                            totalVowels++;
                            break;
                    }
                }
            }
        }

        System.out.println("\nTotal vowel counts:");
        System.out.println("a: " + vowelCounts[0]);
        System.out.println("e: " + vowelCounts[1]);
        System.out.println("i: " + vowelCounts[2]);
        System.out.println("o: " + vowelCounts[3]);
        System.out.println("u: " + vowelCounts[4]);
        System.out.println("Total vowels across all sentences: " + totalVowels);
    }
}