import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hi there, Get ready to calculate:" );
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Temperature Conversion");
            System.out.println("8. Currency Conversion");
            System.out.println("9. Quit");

            System.out.print("Enter number: ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1 :
                    doAddition(scanner);
                    break;
                case 2 :
                    doSubtraction(scanner);
                    break;
                case 3 :
                    doMultiplication(scanner);
                    break;
                case 4 :
                    doDivision(scanner);
                    break;
                case 5 :
                    doSquareRoot(scanner);
                    break;
                case 6 :
                    doExponentiation(scanner);
                    break;
                case 7 :
                    doTemperatureConversion(scanner);
                case 8 :
                    doCurrencyConversion(scanner);
                case 9 :
                    System.out.println("Sorted? Okay, Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid choice. Please enter a number between 1 and 9");

            }

        }
    }

    private static void doAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:" );
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void doSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:" );
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void doMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:" );
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void doDivision(Scanner scanner){
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.println("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Division by Zero!");
        } else {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        }

    }

    private static void doSquareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double result = Math.sqrt(num);
        System.out.println("Square root: " + result);
    }

    private static void doExponentiation(Scanner scanner) {
        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: "  + result);
    }

    private static void doTemperatureConversion(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
    private static void doCurrencyConversion(Scanner scanner) {
        System.out.print("Enter amount in USD: ");
        double zar = scanner.nextDouble();
        double usd = zar * 18.47;
        System.out.println("Amount in USD: R" + usd);
    }
}
