package Assignment_7.Assignment_7_Part_2;
public class Assignment7_Part2 {

    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (String arg : args) {
            try {
                int n = Integer.parseInt(arg);
                if (n < 0 || n > 15)
                    throw new FactorialException("Value out of range (0 to 15) for " + n);
                System.out.println("Factorial of " + n + " is " + factorial(n));
            } catch (FactorialException fe) {
                System.out.println("Number is out of the range 0 to 15.");
                System.out.println(fe.getMessage());
            } catch (NumberFormatException ne) {
                ne.printStackTrace();
                System.out.println("Number entered is of invalid format.");
            }
        }
    }
}
