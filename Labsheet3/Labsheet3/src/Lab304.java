import java.util.Scanner;

public class Lab304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        if (fullName.trim().contains(" ") && fullName.trim().indexOf(" ") == fullName.trim().lastIndexOf(" ")) {
            int spaceIndex = fullName.indexOf(" ");
            String firstName = fullName.substring(0, spaceIndex);
            String lastName = fullName.substring(spaceIndex + 1);

            System.out.println("First Name: " + firstName.toUpperCase());
            System.out.println("Last Name: " + lastName.toLowerCase());
        } 
        else {
            System.out.println("Incorrect Name");
        }

        scanner.close();
    }
}