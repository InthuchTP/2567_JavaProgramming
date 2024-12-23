import javax.swing.*;

public class Lab402 {

    public static void main(String[] args) {
    	
    	int year;
    	
        String input = JOptionPane.showInputDialog("Input year:");
        year = Integer.parseInt(input);

            if (checkYear(year)) {
                if (isLeapYear(year)) {
                    JOptionPane.showMessageDialog(null, year + " is Leap year.", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, year + " is NOT Leap year.", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please input year between 1000 - 3000", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
    
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 3000;
    }
}