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
		System.out.println();
		
		System.out.print("How many discount     : ");
		float discount = scan.nextFloat();
		discount = discount/100;
		float discountFrom = totalPriceProduct * discount;
		System.out.print("Discount from"+discount+"%       "+frm.format(discountFrom)+" baht.");
		System.out.println();
		float amount = totalPriceProduct-discountFrom;
		System.out.print("Amount to be paid       "+frm.format(amount)+" baht.");

		

	}
}
		