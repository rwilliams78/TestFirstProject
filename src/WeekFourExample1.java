import java.util.Locale;

public class WeekFourExample1 {
    //PascalCase

    // public static void main(String args[]) {
    //      System.out.println("Replace Content");
    // }

    public static void main(String args[]) {
        // int, char, boolean, String
        //capitalize first letter in your first name

        String firstName = "john"; //camelCase

        String firstLetter = firstName.substring(0,1);
        String firstLetterCapitalized = firstLetter.toUpperCase();
        String remainingLetters = firstName.substring(1);

        System.out.println("First Letter:"+ firstLetter);
        System.out.println("First Letter Capitalized:"+firstLetterCapitalized);
        System.out.println("remainingLetters:"+remainingLetters);
        System.out.println("First name with first letter capitalized: "+firstLetterCapitalized.concat(remainingLetters));

}

}
