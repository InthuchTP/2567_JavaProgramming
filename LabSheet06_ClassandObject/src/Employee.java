
public class Employee {
	
	private String name;
	private int hoursWorked;
	private double hourlyRate;
	
	public void setEmployeeDetails(String nameEmp, int hours, double rate) {
		name = nameEmp;
		hoursWorked = hours;
		hourlyRate = rate;
	}
	
	public double calculateSalary() {
		double salary = hoursWorked * hourlyRate;
		if(hoursWorked > 40) {
			double bonus = salary *0.10;
			salary += bonus;
		}
		return salary;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Name : "+ name);
		System.out.println("Hours Worked : "+ hoursWorked);
		System.out.println("Hourly Rate : "+ hourlyRate);
		System.out.println("Total Salary : "+ calculateSalary());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
