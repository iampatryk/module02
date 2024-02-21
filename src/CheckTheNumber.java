import java.util.Scanner;

public class CheckTheNumber {

    public static void getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if ( num > 0){
            System.out.println("the number is greater than 0.");
        } else if (num < 0) {
            System.out.println("the number is smaller than 0.");
        } else {
            System.out.println("the number is equal 0.");
        }
    }
}

