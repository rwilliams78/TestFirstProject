public class WeekFourHW{

    public static void main(String args[]) {
        String firstName = "abraham";
        String lastName = "lincoln";

        String firstLetter = firstName.substring(0,1);
        String firstLetterUpperCase = firstLetter.toUpperCase();
        String restOfString = firstName.substring(1);
        String lastFirstLetter = lastName.substring(0,1);
        String lastFirstLetterUpperCase = lastFirstLetter.toUpperCase();
        String restOfOtherString = lastName.substring(1);


        System.out.println("First Name : " +firstLetterUpperCase.concat(restOfString));
        System.out.println("Last Name : "+lastFirstLetterUpperCase.concat(restOfOtherString));


        String primaryPhone = "555-123-1245";
        String secondaryPhone = "555.123.1246";
        System.out.println("Phone Number : "+primaryPhone.replace('_', ' '));


        // Call to methods that sanitize input.

        // Print results.
    }

    public static void phone(String phoneNumber){
        String primaryPhone = "555-123-1245";
        System.out.println(primaryPhone);


    }
    //method to sanitize names

    //method to sanitize phone numbers (???)


}
