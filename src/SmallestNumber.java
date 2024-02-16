import java.util.Scanner;

public class SmallestNumber {
    public static void getSmallestNumber() {
        // pobieranie danych od uzytkownika
        Scanner scanner = new Scanner(System.in);
        // uzycie tablicy z pieciona miejscami
        double[] numbers = new double[5];

        // petla , jako ze liczymy od 0 to i + 1 zeby zajacz od jedynki
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter your number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        // napisac kod ktory przeswietli liczby
        // i wysszuka najmniejsza ...

        double smallestNumber = findSmallestNumber(numbers);
        System.out.println("The smallest number is: " + smallestNumber);
    }

    // znalazlem w necie takie rozwiazanie ale nie do konca
    // rozumiem jak to sie dzieje
    public static double findSmallestNumber(double[] numbers) {
        double smallest = numbers[0];
        for (double num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}
