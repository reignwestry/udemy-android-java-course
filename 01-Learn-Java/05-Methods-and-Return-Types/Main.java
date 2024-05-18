public class Main {
    public static void main(String[] args){

        //Methods and Return Types


        myName( "Reign");

        int finalResult = addNums(4,5);
//        System.out.println(addNums(4,5));
        System.out.println( finalResult);

        System.out.println( fullName("Reign", "Daemon") );
        System.out.println( showChar('h') );

    }

    //Method
    public static void myName(String mName){
        System.out.println(mName);
    }

    // Return an integer
    public static int addNums( int a, int b){
//
        int result = 0;
        result = a + b;
//        System.out.println("Sum = " + (a + b));
        return result; //(a + b)
    }

    public static String fullName(String firstName, String lastName){
//        System.out.println("Another method");
        return firstName + " " + lastName;
    }

    public static char showChar(char specialChar){
        return specialChar;
    }
}
