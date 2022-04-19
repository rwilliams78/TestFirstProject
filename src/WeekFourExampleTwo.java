public class WeekFourExampleTwo {
    public static void main(String args[]) {
        String firstName = "";
       // sayHello();
        printHello("John argument");

    }

    //[Return type] [Name of method][arguments or parameters within()] { body}

    //[void|int|String|boolean|char] [sayHello]

   public static void sayHello(){
        System.out.println("Hello");
        System.out.println("World");
    }

    //Method return void but takes arguments
    public static void printHello(String inputString){
       System.out.println(" In method printHello : Value passed to method is:" +inputString);

    }

}
