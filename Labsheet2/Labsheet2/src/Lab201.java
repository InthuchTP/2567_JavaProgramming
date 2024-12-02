import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		double discount;
		int numberOfCustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill?"));
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int isMember;
		
		double totalprice = numberOfCustomer * BUFFET;
		
		do {		 isMember = JOptionPane.showConfirmDialog(null,
				"Total Price is " + frm.format(totalprice) + "baht."+
				"\nDo you have a member card?");
			
		}while(isMember == 2);
		

		if (isMember == 0) {
			discount = totalprice*0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discount) +" baht.");
		}
		else if (isMember == 1) {
			JOptionPane.showMessageDialog(null, "Amount ot be paid is "+frm.format(totalprice)+" baht.");
			
		}
	}

}
