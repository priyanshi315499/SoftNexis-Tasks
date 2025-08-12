import java.util.Scanner;  // Import for user input
    public class Task2 {
        public static void main(String[] args) {
            // Basic version with fixed temperature
            double fahrenheit = 98.6;

            // Conversion formula: (F - 32) * 5/9
            double celsius = (fahrenheit - 32) * 5/9;

            // Formatted output with 2 decimal places
            System.out.printf("[Fixed Value] %.2f°F = %.2f°C\n", fahrenheit, celsius);

            // Enhanced version with user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nEnter temperature in Fahrenheit: ");
            double userFahrenheit = scanner.nextDouble();

            // Reuse conversion logic
            double userCelsius = (userFahrenheit - 32) * 5/9;
            System.out.printf("[User Input] %.2f°F = %.2f°C", userFahrenheit,
                    userCelsius);

            scanner.close();  // Resource cleanup
        }
    }

