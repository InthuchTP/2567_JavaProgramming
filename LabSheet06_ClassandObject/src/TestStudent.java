
public class TestStudent {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		
		std1.setStudentDetails("Inthuch", new double[] {85.0,67.0,78.5});
		std2.setStudentDetails("Sukonlawat", new double[] {90.0,59.8});
		line('#');
		System.out.println("Student#1 Details: ");
		std1.displayStudentDetails();
		line('#');

		System.out.println("Student#2 Details: ");
		std2.displayStudentDetails();
		line('#');

	}
	public static void line(char ch) {
		/*System.out.println("****************************");*/
		for(int i = 1 ; i<35;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

}
