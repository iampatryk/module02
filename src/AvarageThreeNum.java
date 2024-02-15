import java.util.Scanner;

public class AvarageThreeNum {
    private static double number1;
    private static double number2;
    private static double number3;

    public AvarageThreeNum(double number1, double number2, double number3){
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public static double getNumber1() {
        return number1;
    }

    public static double getNumber2() {
        return number2;
    }

    public static double getNumber3() {
        return number3;
    }
    private static void print() {
        System.out.println("First number: " + number1 + "\n" + "Second number: " + number2 + "\n" + "Third number: " + number3 );
    }

    public static void getThreeNumbers() {


        //pobieram trzy liczby od uzytkownika
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter third number: ");
        double number3 = scanner.nextDouble();

        AvarageThreeNum nums = new AvarageThreeNum(number1,number2,number3);
        print();

        if (number1 > 0 && number2 > 0 && number3 > 0) {
            double avarage = calcAvarage(number1,number2,number3);
            System.out.println("Avarage numbers: " + avarage);
        } else {
            System.out.println("All numbers must be greater than 0.");
        }
    }


    public static double calcAvarage(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3.0;
    }

}
