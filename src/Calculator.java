import java.util.Scanner;

public class Calculator {

    public void start() {
        System.out.println("Hello in the Calculator!");
        System.out.println("You can choose different operators: +, -, *, / ");
        System.out.println("If you want to leave, enter: exit or quit.");
    }

    private String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you operation +, -, *, / : ");
        return scanner.nextLine();
    }

    private int getNumberFromUser() {
        return 0;
    }

    private boolean isMoreThan0(int number) {
        return number > 0;
    }

    private int add(int a, int b) {
        return (int) (a + b);
    }

    private int subtract(int a, int b) {
        return (int) (a - b);
    }

    private int divide(int a, int b) {
        return (int) (a / b);
    }

    private int multiply(int a, int b) {
        return (int) (a * b);
    }

}
