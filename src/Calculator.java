import java.util.Scanner;

public class Calculator {

    public void startCalc() {
        System.out.println("Hello in the Calculator!");
        System.out.println("You can choose different operators: +, -, *, / ");
        System.out.println("If you want to leave, enter: exit or quit .");

        while(true) {
            int firstNumber = getNumberFromUser("Enter your first number: ");
            int secondNumber = getNumberFromUser("Enter your second number: ");
            String operation = getOperationFromUser();
            int result = 0;

            if (operation.equals("+")) {
                result = add(firstNumber, secondNumber);
            }
            else if (operation.equals("-")) {
                result = subtract(firstNumber, secondNumber);
            }
            else if (operation.equals("*")) {
                result = multiply(firstNumber, secondNumber);
            }
            else if (operation.equals("/")) {
                result = divide(firstNumber, secondNumber);{
                    if ( isMoreThan0(secondNumber)) {
                        result = divide(firstNumber,secondNumber);
                    } else  {
                        System.out.println("You can't divide by 0");
                    }
                }
            } else {
                System.out.println("Error, try again");
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

    private String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you operation +, -, *, / : ");
        return scanner.nextLine();
    }

    private int getNumberFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }

    private boolean isMoreThan0(int number) {
        return number > 0;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private int multiply(int a, int b) {
        return a * b ;
    }

}
