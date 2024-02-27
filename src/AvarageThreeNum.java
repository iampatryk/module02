import java.util.Scanner;

public class AvarageThreeNum {

    public void getThreeNumbersFromUserToCalculateAvarage() {

        //pobieram trzy liczby od uzytkownika
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double number2 = scanner.nextDouble();
        System.out.println("Enter third number: ");
        double number3 = scanner.nextDouble();
        System.out.println("First number: " + number1 + "\n" + "Second number: " + number2 + "\n" + "Third number: " + number3 );

        if (number1 > 0 && number2 > 0 && number3 > 0) {
            double avarage = (number1 + number2 + number3) / 3.0;;
            System.out.println("Avarage numbers: " + avarage);
        } else {
            System.out.println("All numbers must be greater than 0.");
        }
    }
}


// wszystko do linijki 27 usunac i zastosowac w jednej metodzie .
//POPRAWIONE
