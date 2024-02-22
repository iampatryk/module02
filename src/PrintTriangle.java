import java.util.Scanner;

public class PrintTriangle {
    public void getNumberFromUserToPrintTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number to print triangle: ");
        int number = scanner.nextInt();

        String star = "*";

        for (int i = 0; i < number; i++) {
            star += "*";
            System.out.println(star);
        }
    }
}

// ogolnie to zadanie jest dla mnie bardziej trudne do zrozumienia niz np. kalkulator |
// tak mi sie wydaje ...



//
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the height of the triangle: ");
//    int height = scanner.nextInt();
//
//        if (height <= 0) {
//        System.out.print("The height must be greater than 0");
//    } else {
//        printYourTriangle(height);
//    }
//}
//
//public static void printYourTriangle(int height) {
//    //petla trwa do monentu az i osiagnie height np. height 9 = 9nowych wierszy
//    for (int i = 1; i <= height; i++) {
//        // petla j spacle przed gwiazdkoami ( ale ustawiami bez spacji )
//        //Pętla zaczyna się od j = 1 i trwa do momentu, gdy j osiągnie wartość height - i.
//        for (int j = 1; j <= height - i; j++) {
//            System.out.print("");
//        }
//        // petla k = ilosc gwiazdek Pętla zaczyna się od k = 1 i trwa do momentu,
//        // gdy k osiągnie wartość 2 * i - 1.
//        for (int k = 1; k <= 2 * i - 1; k++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//}