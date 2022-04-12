public class WeekThreeMethods {

    public static void main(String args[]) {

        String reallyLongString = "ldijhdsfiursanfxivlxznvcxi cxjdofjsniusafgnfdg234567nsrfnds";
        int lengthOfString = reallyLongString.length();
        System.out.println("Length of String :"+lengthOfString);

        String firstName = "Rebecca";
        String capitalizedFirstName = firstName.toUpperCase();
        System.out.println("Capitalized value is :"+capitalizedFirstName);

        String subStringOutputFromMethod = firstName.substring(3);
        System.out.println("Output of substring operation :"+subStringOutputFromMethod);

    }
}