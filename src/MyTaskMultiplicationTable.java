import java.util.Scanner;

public class MyTaskMultiplicationTable {
    public static void getNumber() {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter your number or 'exit' to quit");
            input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Quit the program");
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number < 0) {
                    System.out.println("Number must be greater then 0");
                } else {
                    multiplicationTable(number);
                }
            } catch (NumberFormatException e) {
                System.out.println("You can entry only digit or 'exit'");
            }
        }
        scanner.close();
    }
    public static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}


// Metoda parseInt() parsuje ciąg znaków i próbuje zwrócić liczbę całkowitą typu integer1.
//Jeśli natknie się na znak, który nie jest cyfrą, ignoruje ten oraz wszystkie kolejne znaki1.
//Następnie zwraca wartość przetworzoną do tej pory1.
//Jeśli pierwszy znak nie może zostać skonwertowany na liczbę, funkcja ta zwraca NumberFormatException2.

//Metoda equalsIgnoreCase() w Javie służy do porównywania dwóch ciągów znaków, ignorując różnice w wielkości
// liter1. Oznacza to, że metoda ta nie rozróżnia między wielkimi a małymi literami.