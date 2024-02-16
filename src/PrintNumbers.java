import java.util.Scanner;

public class PrintNumbers {

    public static void getNumberFromUser() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Please enter correct number, number must be greater then 0.");
            } else {
                System.out.println("Numbers form 0 to " + number);
                // na samym poczatku jak uruchomilem IntelliJ byl taki program :) tzn ta petla
                for (int i = 0; i <= number; i++) {
                    System.out.println(i);
                }
            }
        }
    }


// Napisz program, który przyjmie od użytkownika liczbę
// naturalną większą lub równą zeru, a następnie wydrukuj
// każdą liczbę (zaczynając od zera) aż do liczby podanej przez użytkownika;