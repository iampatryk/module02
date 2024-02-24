public class CheckPalindrom {
    public void palindrome() {

    String checkWord = "kajak";

        boolean checkEqual = true;

        for (int i = 0; i < checkWord.length(); i++) {
            char sign1 = checkWord.charAt(i);
            char sign2 = checkWord.charAt(checkWord.length() - 1 - i);
            System.out.print(sign1 + " " + sign2 + " ");

            if ( sign1 != sign2) {
                checkEqual = false;
                // if the loop finds the difference earlier, it will break the loop
                break;
            }
        }
        if (checkEqual) {
            System.out.println("The words are palindrome.");
        } else {
            System.out.println("The words is not palindrome.");
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