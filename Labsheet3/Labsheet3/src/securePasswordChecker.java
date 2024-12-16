import java.util.*;
public class securePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit): ");
			String password = scan.nextLine();
			
			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminate...");
				break;
			}
			
			String error ="";
			if (password.length()<8) {
				error += "- Password must be at least 8 characters long. \n";
				
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigitCase = false;

			for (int i = 0;i<password.length();i++) {
			
				char ch = password.charAt(i);
				if (ch>= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				}
				else if (ch>= 'a' && ch <= 'z') {
					hasLowerCase = true;
				}
				if (ch>= '0' && ch <= '9') {
					hasDigitCase = true;
				}
			}//end for
			
			if(!hasUpperCase) {
				error += "- Password must be contain at least one uppercase letter (A-Z). \n";
			}
			if(!hasLowerCase) {
				error += "- Password must be contain at least one lowwercase letter (A-Z). \n";
			}
			if(!hasDigitCase) {
				error += "- Password must be contain at least one digit (0-9). \n";
			}
			
			if(error.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			}
			else {
				System.out.println("Password validation error.");
				System.out.println(error);
			}
			
		}//end while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}