import java.util.Scanner;

public class CheckPalindrom {
    public static void checker() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word to check: ");
        String checkString = scanner.nextLine();
//        String checkString = "kajak";    zamiest lini wyzej
        boolean isPalindrom = isPalindrome(checkString);
        System.out.println(checkString + (isPalindrom ? " is" : " is not") + " palindromem.");
    }

    public static boolean isPalindrome(String input) {
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}

//Jeśli isPalindrom (?) jest prawdziwe, to zostanie wydrukowany napis " is", w przeciwnym razie (:) " is not".
// Pamietam jak kiedys mialem takie zadanie na rozmowie :)
//Sprawdź, czy String podany na wejściu metody jest palindromem, czyli czyta
// się tak samo od przodu jak i od tyłu np. kajak.
//public boolean isPalindrome(String input);

//String clean = input.replaceAll("\\s+", "").toLowerCase(); usuwamy spacje i przeksztawcamy na male litery

//Porównujemy oryginalny ciąg z jego odwróconą wersją, używając new StringBuilder(clean).reverse().toString().