import java.util.*;
public class TestEmployeesInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		 
		//1
		
		System.out.println("Enter details from empolyee 1 : ");
		System.out.print("Name : ");
		String empName1 = scan.nextLine();
		
		System.out.print("Hours Worked : ");	
		int empHoursWorked1 = scan.nextInt();
		
		System.out.print("Hourly Rate : ");
		double empRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHoursWorked1, empRate1);
		
		System.out.println("\nEmployee 1 Details : ");
		emp1.displayEmployeeDetails();
		
		scan.nextLine(); //Consume leftover newline
		// 2
		
		System.out.println("\nEnter details from empolyee 2 : ");
		System.out.print("Name : ");
		String empName2 = scan.nextLine();
		
		System.out.print("Hours Worked : ");	
		int empHoursWorked2 = scan.nextInt();
		
		System.out.print("Hourly Rate : ");
		double empRate2 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName2, empHoursWorked2, empRate2);
		
		System.out.println("\nEmployee 2 Details : ");
		emp1.displayEmployeeDetails();
		
		
		
		
		
		
	}

}
