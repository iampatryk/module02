import java.util.Scanner;

public class Fibonacci {
    public static void getNumberFromUser() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Fibonacci numbers to " + number + ":");
        System.out.println(firstNumber);

        while (secondNumber <= number) {
            System.out.println(secondNumber);
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}

//Ciąg Fibonacciego to ciąg liczb naturalnych, w którym pierwszy wyraz jest
// równy 0, drugi 1, a każdy kolejny jest sumą dwóch poprzedzających go wyrazów.

// Czyli a = 0 b = 1,  0+1=1 | 1+1=2 | 2+1=3 | 3+2=5 | 5+3=8 itd.
// Tylko jak zeby wszystkie wyswietlaly sie w jednej lini