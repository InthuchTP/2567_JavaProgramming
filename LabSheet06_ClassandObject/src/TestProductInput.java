import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product pdt1 = new Product();
		
		System.out.print("Enter product name  : ");
		String pdName = scan.nextLine();
		
		System.out.print("Enter product price : ");
		double pdPrice = scan.nextDouble();
		
		System.out.print("Enter VAT rate (%)  : ");
		double pdVat = scan.nextDouble();
		
		pdt1.setProductDetails(pdName, pdPrice, pdVat);
		
		System.out.println("");
		pdt1.displayProductDetails();

		scan.close();
	}


}
