
public class Student {
	
	private String name;
	private double[] score;
	
	public void setStudentDetails(String stdName, double[] stdScores) {
		name = stdName;
		score = stdScores;
	}
	
	public double calculateAverageScore() {
		
		double total = 0;
		/*for(int i =0 ; i<score.length;i++) {
			total += score[i];
		}*/
		for(double _score:score) {
			total += _score;
		}
		return total / score.length;
	}
	
	public String getGrade() {
		double average = calculateAverageScore();
		if(average>=80) {
			return "A";
		}else if (average>=70) {
			return "B";
		}else if (average>=60) {
			return "C";
		}else if (average>=50) {
			return "D";
		}else {
			return "F";
		}
		
	}
	
	public void displayStudentDetails() {
		System.out.println("Name : "+ name);
		/*for(int i =0 ; i<score.length;i++) {
			System.out.print(score[i]+" ");
		}*/
		for(double _score:score) {
			System.out.print(_score+" ");
		}
		System.out.println("\nAverage Score : "+ calculateAverageScore());
		System.out.println("Grade : "+ getGrade());
	}
	
	
	
}
