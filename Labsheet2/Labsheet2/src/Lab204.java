import java.util.Scanner;
public class Lab204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		System.out.print("Input value of X : ");
		int X = scanner.nextInt();
		int Y = 0;
		
		do{
			System.out.print("Input value of Y : ");
			Y = scanner.nextInt();
		}while(Y<X);
		int sum =X;
		 System.out.println();
		 for (int i = X; i<Y; i++) {
			 
			 System.out.println(sum + " + " + (X+1) +" = "+ (sum + (X+1)));
			 sum += ++X;
			 //System.out.println(sum);
		 }


	}

}
