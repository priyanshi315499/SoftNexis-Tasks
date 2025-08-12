import java.util.Scanner;
    public class Task3 {
        public static void main(String[] args) {
            // Static value version
            int staticNumber = 27;
            checkAndPrint(staticNumber);

            // Interactive version
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter an integer: ");
            int userNumber = scanner.nextInt();
            checkAndPrint(userNumber);

            scanner.close();
        }

        // Modular method demonstrating ternary operator
        private static void checkAndPrint(int number) {
            String result = (number % 2 == 0) ? "Even" : "Odd";
            System.out.printf("%d is %s\n", number, result);
        }
    }
