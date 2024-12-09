import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence="";
		System.out.print("Input the sentence : ");
		sentence = scan.next();
		while(!(sentence.endsWith("."))) {
			
				System.out.print("Input the sentence, again : ");
				sentence = scan.next();
				
		}
		
		int spb = 0;
		int wor = 1;
		for (int i=0; i<sentence.length();i++) {
			if (sentence.charAt(i)== ' ') {
				spb++;
				wor++;
			}
		}
		
		System.out.println("This sentence has "+spb+" spacebar.");
		System.out.println("This sentence has "+wor+" word.");
		
		scan.close();

	}
}
		