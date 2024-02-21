import java.util.Scanner;

public class CheckPalindrom {
    public static void checker() {

    String checkWord = "kajakasdddad";

    int lenght = checkWord.length();
    checkWord.charAt(0);

        for(int i = 0; i < checkWord.length(); i++) {
            if (checkWord.charAt(i) != checkWord.charAt(lenght - i - 1)) {
             System.out.println("It is not a palindrome");
             } else {
                System.out.println("Is a palindrome");
            }
        }
    }
}

//String napis = „kajak”;
//        System.out.println(new StringBuilder(napis).reverse().toString().equals(napis));

//Jeśli isPalindrom (?) jest prawdziwe, to zostanie wydrukowany napis " is", w przeciwnym razie (:) " is not".
// Pamietam jak kiedys mialem takie zadanie na rozmowie :)
//Sprawdź, czy String podany na wejściu metody jest palindromem, czyli czyta
// się tak samo od przodu jak i od tyłu np. kajak.
//public boolean isPalindrome(String input);

//String clean = input.replaceAll("\\s+", "").toLowerCase(); usuwamy spacje i przeksztawcamy na male litery

//Porównujemy oryginalny ciąg z jego odwróconą wersją, używając new StringBuilder(clean).reverse().toString().

// Co potrzebuje :
//





//
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your word to check: ");
//    String checkString = scanner.nextLine();
//    //        String checkString = "kajak";    zamiest lini wyzej
//    boolean isPalindrom = isPalindrome(checkString);
//        System.out.println(checkString + (isPalindrom ? " is" : " is not") + " palindromem.");
//}
//
//public static boolean isPalindrome(String input) {
//    String clean = input.replaceAll("\\s+", "").toLowerCase();
//    return clean.equals(new StringBuilder(clean).reverse().toString());
//}