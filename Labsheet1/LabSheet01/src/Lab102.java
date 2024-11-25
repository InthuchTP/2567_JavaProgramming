import java.util.*;
import java.text.*;
public class Lab102 {
	public static void main(String[] args) {
		//Define object for scanner class
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Input the number of minutes : ");
		int minutes = scan.nextInt();
		
		int day = minutes / 1440;
		
		int realDay = day % 365;
		System.out.println(realDay);
		
		int year = day / 365;
		System.out.println(year);
		
		

		

	}
}
		