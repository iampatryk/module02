import java.util.Scanner;

public class SmallestNumber {
    public void getSmallestNumber() {
        Scanner sc = new Scanner(System.in);

        int num1 = askUser("Enter first number: ");
        int num2 = askUser("Enter second number: ");
        int num3 = askUser("Enter third number: ");
        int num4 = askUser("Enter fourth number: ");
        int num5 = askUser("Enter fifth number: ");

        int smallest = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);
        System.out.println("Smallest digit: " + smallest);
    }

    private int askUser(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();
    }
}




//
//
//// pobieranie danych od uzytkownika
//Scanner scanner = new Scanner(System.in);
//// uzycie tablicy z pieciona miejscami
//double[] numbers = new double[5];
//
//// petla , jako ze liczymy od 0 to i + 1 zeby zajacz od jedynki
//        for (int i = 0; i < 5; i++) {
//        System.out.print("Enter your number " + (i + 1) + ": ");
//numbers[i] = scanner.nextDouble();
//        }
//// napisac kod ktory przeswietli liczby
//// i wysszuka najmniejsza ...
//
//double smallestNumber = findSmallestNumber(numbers);
//        System.out.println("The smallest number is: " + smallestNumber);
//    }
//
//// znalazlem w necie takie rozwiazanie ale nie do konca
//// rozumiem jak to sie dzieje
//public double findSmallestNumber(double[] numbers) {
//    double smallest = numbers[0];
//    for (double num : numbers) {
//        if (num < smallest) {
//            smallest = num;
//        }
//    }
//    return smallest;