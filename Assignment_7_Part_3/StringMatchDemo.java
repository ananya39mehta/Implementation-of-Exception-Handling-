package Assignment_7.Assignment_7_Part_3;
import java.util.Scanner;

public class StringMatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a string: ");
            String input = scanner.nextLine();
            if (!input.equals("India"))
                throw new NOMATCHEXCP(getLineNumber(), input);
            System.out.println("Input string matches 'India'.");
        } catch (NOMATCHEXCP e) {
            System.out.println(e);
        }
    }

    // Method to get line number where exception occurred
    private static int getLineNumber() {
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
