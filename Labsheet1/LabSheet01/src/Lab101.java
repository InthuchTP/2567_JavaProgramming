import java.util.*;
import java.text.*;
public class Lab101 {
	public static void main(String[] args) {
		//Define object for scanner class
		Scanner scan = new Scanner(System.in);
		//define object for manage
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//name
		System.out.print("Input product name    : ");
		String productName = scan.nextLine();
		//สั้งแสดงและรับจำนวนสินค้า
		System.out.print("Input product unit    : ");
		int productUnit = scan.nextInt();
		//รับราคาสินค้า
		System.out.print("Input price per unit  : ");
		float productPrice = scan.nextFloat();
		
		System.out.print("--------------------------------------");
		
		System.out.println();
		float totalPriceProduct = productUnit * productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceProduct)+" baht.");
		System.out.print("--------------------------------------");
		
		
		
		//vat
		float totalVat = totalPriceProduct + (totalPriceProduct *7/100);
		System.out.println("Add VAT 7% is  "+frm.format(totalVat)+" baht.");
		
	}
}
		