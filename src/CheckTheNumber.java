import java.util.Scanner;

public class GetNumber {
    public GetNumber(int num) {

    }

    public static void getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        GetNumber newNumber = new GetNumber(num);


        if ( newNumber < 0){
            System.out.println(num + "jest wieksze ");
        }
    }
}
