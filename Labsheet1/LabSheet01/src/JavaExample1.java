import java.util.*;
import java.text.*;
public class JavaExample1 {
	public static void main(String[] args) {
		//Define object for scanner class
		Scanner scan = new Scanner(System.in);
		//define object for manage
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//name
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		//สั้งแสดงและรับจำนวนสินค้า
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		//รับราคาสินค้า
		System.out.print("Input price per unit : ");
		float productPrice = scan.nextFloat();
		
		System.out.println();
		System.out.println("Product name is : "+productName);
		
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total price is "+ frm.format(totalPriceProduct)+" baht.");
		
		//vat
		float totalVat = totalPriceProduct + (totalPriceProduct *7/100);
		System.out.println("Add VAT 7% is  "+frm.format(totalVat)+" baht.");
		
		System.out.println("********using print and Stirng.format********");
		System.out.printf("Product name is : %s",productName);
		System.out.printf("\nTotal price is %,.2f",totalPriceProduct);
		//String formatted = String.format("%,.2f",totalVat);
		System.out.printf("\nAdd VAT 7%% is %s baht",String.format("%.2f",totalVat));
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
