import java.util.Scanner;

public class WordPuzzle {
    public static void main(String[] args) {
        String[] words = {"JAVA", "PUZZLE", "CODE", "PROGRAM"};
        String[] scrambledWords = {"AVAJ", "UZLEPZ", "EDOC", "GRAMROP"};
        
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Word Puzzle Game!");
        
        for (int i = 0; i < words.length; i++) {
            System.out.println("Unscramble the letters to form a word: " + scrambledWords[i]);
            System.out.print("Your guess: ");
            String guess = scanner.nextLine().toUpperCase();
            
            if (guess.equals(words[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct word was: " + words[i]);
            }
        }
        
        System.out.println("Your final score is: " + score + "/" + words.length);
        scanner.close();
    }
}
