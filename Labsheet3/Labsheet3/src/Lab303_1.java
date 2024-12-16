import javax.swing.JOptionPane;

public class Lab303_1 {
    public static void main(String[] args) {
        String sentence;

        sentence = JOptionPane.showInputDialog("Input a sentence :");

        while (!sentence.endsWith(".")) {
            sentence = JOptionPane.showInputDialog("Input a sentence, again :");
        }

        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        String result = 
                       "This sentence has " + spaceCount + " spacebar(s).\n"
                      + "This sentence has " + wordCount + " word(s).";

        JOptionPane.showMessageDialog(null, result);
    }
}