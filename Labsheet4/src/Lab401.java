import javax.swing.*;
public class Lab401 {
	
	static String varEmail;

	public static void main(String[] args) {
		inputEmail();

	}
	
	public static void inputEmail() {
	    String ans = "";
	    do {
	    	varEmail = JOptionPane.showInputDialog("Input your e-mail : ");
	    	if(varEmail!=null && !varEmail.isEmpty()) {
	    		checkEmailError(varEmail);
	    	}
	    	else {
				JOptionPane.showMessageDialog(null,"E-mail cannot be empty!");
			}
	    	ans = JOptionPane.showInputDialog("Continue?(y||Y to continue)");
	    	
	    }while(ans!=null && ans.equalsIgnoreCase("y"));
	}
	
	public static void checkEmailError(String email) {
		while(email.startsWith("@")||email.contains(" ")){
			email = JOptionPane.showInputDialog("Input your e-mail again : ");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null,checkEmail(email)
				?"Your e-mail is "+email
				:"Your e-mail is not gmail or hotmail address."
				);
	}
	
	public static boolean checkEmail(String email) {
		/*if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;
		}
		else {
			return false;
		}*/
		return email.endsWith("@gmail.com")||email.endsWith("@hotmail.com");
		
	}

}
