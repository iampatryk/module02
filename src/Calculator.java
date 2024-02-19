import java.util.Scanner;

public class Calculator {

    public static void start() {
        System.out.println("Hello in the Calculator!");
        System.out.println("You can choose different operators: +, -, *, / ");
        System.out.println("If you want to leave, enter: exit .");

        while(true) {
            int firstNumber = getFirstNumberFromUser();
            int secondNumber =getSecondNumberFromUser();
            String operation = getOperationFromUser();
            int result = 0;

            switch (operation) {
                case "+":
                    result = add(firstNumber, secondNumber);
                    break;
                case "-":
                    result = subtract(firstNumber, secondNumber);
                    break;
                case "*":
                    result = multiply(firstNumber, secondNumber);
                    break;
                case "/":
                    if (isMoreThan0(secondNumber)){
                        result = divide(firstNumber, secondNumber);
                    } else {
                        System.out.println("You can't divide by 0");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error, try again");
                    continue;
            }
            System.out.println("Result: " + " " + firstNumber + " " + operation + " " + secondNumber + " = " + result);
            System.out.println("Do you want to continue? Type 'yes' to continue. If not, type 'exit', 'quit' or 'no' ."); {
                Scanner scanner = new Scanner(System.in);
                String continueCommand = scanner.next();
                if (continueCommand.equals("no") || continueCommand.equals("exit") || continueCommand.equals("quit")) {
                    break;
                }
            }
        }
    }

    private static String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you operation +, -, *, / : ");
        return scanner.nextLine();
    }

    private static int getFirstNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        return scanner.nextInt();
    }
    private static int getSecondNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your second number: ");
        return scanner.nextInt();
    }

    private static boolean isMoreThan0(int number) {

        return number > 0;
    }

    private static int add(int a, int b) {

        return (int) (a + b);
    }

    private static int subtract(int a, int b) {
        return (int) (a - b);
    }

    private static int divide(int a, int b) {

        return (int) (a / b);
    }

    private static int multiply(int a, int b) {

        return (int) (a * b);
    }

}
