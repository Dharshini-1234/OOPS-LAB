1.
import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (isPasswordValid(password)) {
                System.out.println("Password is valid. You're successful!");
                break;  // Exit the loop when a valid password is entered
            } else {
                System.out.println("Password is invalid. Please try again.");
            }
        }

        scanner.close();
    }

    public static boolean isPasswordValid(String password) {
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowercaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return uppercaseCount >= 2 && lowercaseCount >= 2 && digitCount >= 2;
    }
}

output:
Enter a password:passcode07
Password is invalid.please try again
Enter a password:passcode07
Password is invalid.please try again
Enter a password:PAsscode07@
Password is valid.you're successful!

2.
package com.mycompany.textanalysis;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.HashMap;
import java.util.Map;

public class TextAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String text = scanner.nextLine();
        int totalCharacters = text.replaceAll("\\s", "").length();
        String[] words = text.split("\\s");
        int totalWords = words.length;
        String[] sentences = text.split("[.!?]");
        int totalSentences = sentences.length;
        String longestWord = findLongestWord(words);
        double averageWordLength = (double) totalCharacters / totalWords;
        String mostFrequentWord = findMostFrequentWord(words);
        System.out.println("Total characters (excluding whitespace): " + totalCharacters);
        System.out.println("Total words: " + totalWords);
        System.out.println("Total sentences: " + totalSentences);
        System.out.println("Longest word: \"" + longestWord + "\"");
        System.out.println("Average word length: " + String.format("%.2f", averageWordLength));
        System.out.println("Most frequent word: \"" + mostFrequentWord + "\" (appears " + getWordFrequency(text, mostFrequentWord) + " times)");

        scanner.close();
    }
    private static String findLongestWord(String[] words) {
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
    private static String findMostFrequentWord(String[] words) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return mostFrequentWord;
    }

    private static int getWordFrequency(String text, String word) {
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
output:
Enter the text: 
java programming language
Total characters (excluding whitespace): 23
Total words: 3
Total sentences: 1
Longest word: "programming"
Average word length: 7.67
Most frequent word: "java" (appears 1 times)
