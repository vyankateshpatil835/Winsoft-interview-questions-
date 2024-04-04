package classobject;
import java.util.HashMap;
import java.util.Scanner;

public class Pen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        scanner.close();

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "");
            word = word.toLowerCase();
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        int totalWords = 0;
        for (int count : wordCountMap.values()) {
            totalWords += count;
        }

        System.out.println("Total Number of Words: " + totalWords);
    }
}
