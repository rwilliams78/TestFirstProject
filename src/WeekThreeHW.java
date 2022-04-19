public class WeekThreeHW {
    public static void main(String args[]) {

        String firstName = "rebecca williams";
        String firstLetter = firstName.substring(0,1);
        String firstLetterUpperCase = firstLetter.toUpperCase();
        String restOfString = firstName.substring(1);

        System.out.println("First Name : " +firstLetterUpperCase.concat(restOfString));

        String fullName = "Rebecca_Williams";
        System.out.println("Full Name : "+fullName.replace('_', ' '));

    }

}
