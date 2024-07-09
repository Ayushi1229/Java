import java.util.io;
import java.util.*;

public class Lab10_2 {
    public static void main(String[] args) {
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";
        String wordToReplace = "word1";
        String replacementWord = "word2";

        try {
            // Read content from inputFile
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Write modified content to outputFile
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            int replacementsCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                // Replace word1 with word2 in each line
                line = line.replaceAll(wordToReplace, replacementWord);
                // Count replacements in each line
                replacementsCount += countOccurrences(line, replacementWord);
                // Write modified line to outputFile
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            // Close readers and writers
            bufferedReader.close();
            bufferedWriter.close();

            // Display number of replacements
            System.out.println("Number of replacements: " + replacementsCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to count occurrences of a word in a string
    private static int countOccurrences(String line, String word) {
        int count = 0;
        int index = line.indexOf(word);
        while (index != -1) {
            count++;
            index = line.indexOf(word, index + word.length());
        }
        return count;
    }
}