import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		String productName =JOptionPane.showInputDialog("Input product name : ");
		
		String productUnitStr = JOptionPane.showInputDialog("Input product unit : ");
		int productUnit = Integer.parseInt(productUnitStr);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input price per unit"));

		double totalPrice = productPrice * productUnit;
		
		
		//format
		String frmTotalPrice = String.format("%,.2f",totalPrice);
				
		double totalVat = productPrice + (productPrice *7/100);
		
		
		//display
		JOptionPane.showMessageDialog(null,"Total price is "+frmTotalPrice+" baht.\n"+"Add VAT 7%  is "+totalVat+" baht.\n");
		//JOptionPane.showMessageDialog(null,"Add VAT 7%  is "+totalVat+" baht.\n");
		
		
		
		
		
		
	}

}
