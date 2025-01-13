
public class LoanCalculator {
	private String name;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String productName, double pricee, double interestRatee, int yearss) {
		name = productName;
		price = pricee;
		interestRate = interestRatee;
		years= yearss;
		
	}
	
	public double calculateMonthlyPayment() {
		double month = years *12;
		double interestRatee = (interestRate/12)/100;
		return (price*interestRatee*(Math.pow((1+interestRatee), month)))/((Math.pow((1+interestRatee), month))-1);
	}
	
	public void displayLoanDetails() {
		System.out.println("Product         : "+name);
		System.out.println("Price           : "+price);
		System.out.println("Interest Rate   : "+interestRate+"%");
		System.out.println("Loan Period     : "+years+" years");
		System.out.println("Monthly Payment : "+calculateMonthlyPayment());
		
		
		

		
	}

}
