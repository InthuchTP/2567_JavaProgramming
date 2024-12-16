import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
			inputStudent();

	}
	
	public static void inputStudent() {
		Scanner sc = new Scanner(System.in);
		String studentId,subjectId;
		
		while(true) {
		System.out.print("Enter Student Id: ");
        studentId = sc.nextLine();
        
        System.out.print("Enter Subject Id: ");	
        subjectId = sc.nextLine();
        
        //check length
        if(isLength(studentId, subjectId)) 
             {break;}  
        else {continue;}
        
		}//end of while
		
		boolean isITStudent = isITStudent(studentId);
		boolean isITSubject = isITSubject(subjectId);
        
		displayData(isITStudent, isITSubject, studentId);
	}
	
	public static boolean isLength(String sdId, String sjId) {
		return sdId.length() == 10 && sjId.length() == 7;
	}
	
	public static boolean isITStudent(String studentID) {
		
		if (studentID.substring(3,5) == "311");{
			return true;
		}
	}
	
	public static boolean isITSubject(String subjectID) {
		if (subjectID.substring(0,1) == "21"&& subjectID.substring(4) == "1");{
			return true;
		}
	}
	
	public static void displayData(boolean isITStudent,boolean isITSubject,String studentId) {
		if ((isITStudent&&isITSubject) == true) {
			System.out.println("Student Id: "+studentId+" 1st year student in IT");
			System.out.println("Enroll in course for Year 1");
		}
		else if (isITStudent == true && isITSubject == false) {
			System.out.println("Student Id: "+studentId+" 1st year student in IT");
			System.out.println("not enroll in course for Year 1");
		}
		else if (isITStudent == false && isITSubject == true) {
			System.out.println("Student Id: "+studentId+" is not 1st year student in IT");
			System.out.println("Enroll in course for Year 1");
		}
		else {
			System.out.println("Student Id: "+studentId+" 1st year student in IT");
			System.out.println("Enroll in course for Year 1");
		}
	}

}
