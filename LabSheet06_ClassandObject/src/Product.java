
public class Product {
	
	private String name;
	private double price;
	private double vat;
	
	public void setProductDetails(String namee, double pricee, double vatRate) {
		name = namee;
		price = pricee;
		vat = vatRate;
	}
	
	public double calculateTotalPrice() {
		return price += price*(vat/100);
	}
	
	public void displayProductDetails() {
		System.out.println("Product Details : ");
		System.out.println("Product Name : "+name);
		System.out.println("Price (Before VAT): "+price);
		System.out.println("Price (After  VAT): "+calculateTotalPrice());

	}
	 
}

