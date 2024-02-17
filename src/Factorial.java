import java.util.Scanner;

public class Factorial {
    public static void getFactorialNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digit to calculate factorial: ");
        int digit = scanner.nextInt();

        if (digit < 0) {
            System.out.println("Please enter correct number, number must be greater then 0.");
        } else {
            long sum = calculateFactorial(digit);
            System.out.println("Factorial from digit " + digit + " is " + sum);
        }
    }
    public static long calculateFactorial(int n) {
        if ( n==0 ) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
               return factorial;
            }
        }
    }


// Przykład: silnia z 5 wynosi: 5! = 5 * 4 * 3 * 2 * 1 = 120.
// Silnię taką oznaczamy jako 5! (wykrzyknik).

//Napisz funkcję, która jako argument przyjmuje liczbę naturalną
///większą od zera i zwróć silnię podanej liczby.

//factorial


// long - typy danych   8 bajtów - zakres od -2^63 do (2^63)-1 (posiadają przyrostek L , lub l)