import java.util.Scanner;

public class AvarageThreeNum {

    public static double getThreeNumbers() {
        //pobieram trzy liczby od uzytkownika
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double number3 = scanner.nextDouble();

        if (number1 > 0 && number2 > 0 && number3 > 0) {
            double avarage = calcAvarage(number1,number2,number3);
            System.out.println("Avarage numbers: " + avarage);
        } else {
            System.out.println("All numbers must be greater than 0.");
        }
        return 0;
    }
    public static double calcAvarage(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3.0;
    }
}
