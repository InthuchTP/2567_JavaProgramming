import java.util.*;
import java.text.DecimalFormat;
public class Lab504 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		double[] score = new double [5];
		Scanner scan = new Scanner(System.in);
		double avg = 0;
		double sum = 0;
		for(int i = 0;i<score.length;i++) {
			System.out.print("Input score of student No. "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			sum += score[i];
		}
		System.out.println();
		
		avg = sum/score.length;
		System.out.printf("Average of 5 student is %.2f%n",avg);
		int a =1;
		for(double _score : score) {
			if(avg<_score) {
				System.out.print("> Student "+a+" "+"("+(df.format(_score))+")\n");
				a++;
			}
			
		};
		scan.close();

	}

}
