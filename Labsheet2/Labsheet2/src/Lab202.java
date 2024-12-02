import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int previousNumber = Integer.MIN_VALUE; // กำหนดค่าเริ่มต้นให้น้อยที่สุด
        int currentNumber;

        while (true) {
            System.out.print("Input number: ");
            currentNumber = scanner.nextInt();

            // เช็คว่าเลขปัจจุบันน้อยกว่าเลขก่อนหน้า
            if (currentNumber < previousNumber) {
                break;
            }

            previousNumber = currentNumber; // อัปเดตเลขก่อนหน้า
        }
        System.out.println();
        System.out.println("BYE BYE");
    }
}