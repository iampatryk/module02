import java.util.Scanner;

public class SumNumbers {

    public void getNumberFormUserToCalculateSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

        int sum = 0;
        if (number < 0) {
            System.out.println("Please enter correct number, number must be greater then 0.");
        } else {
            for (int i = 0; i <= number; i++) sum += i;
        }
        System.out.println("Sum numbers form 0 to " + number + ", wynosi: " + sum);
    }
}
