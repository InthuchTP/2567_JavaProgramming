import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        String sentence;

        System.out.print("Input a sentence : ");
        sentence = scan.nextLine();

        while (!sentence.endsWith(".")) {
            System.out.print("Input a sentence, again : ");
            sentence = scan.nextLine();
        }

        
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("This sentence has " + spaceCount + " spacebar(s).");
        System.out.println("This sentence has " + wordCount + " word(s).");
    }
}