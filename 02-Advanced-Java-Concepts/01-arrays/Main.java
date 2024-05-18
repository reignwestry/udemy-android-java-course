
public class Main{

    public static void main(String[] args){
        /*
            Arrays are a list of containers
            arrays have length ( the distance from 0 to the end)
            .length shows the length of the array
            index = the location of a container in a array and always start at 0 not 1
         */

        //creates an integer array
        int[] myArray = {1, 2, 3, 4}; //array: myArray

        //creates an string array
        String[] myStringArray = {"Hello", "Hi", "What"};
//        System.out.println(myArray[0]);
//        System.out.println(myArray.length);

        int[] newArray = new int[5];// initializes the array and sets the length to 5
        String[] newStringArray = new String[5];

        //add to an array
        newArray[0] = 3;
        newArray[1] = 4;
        newArray[2] = 6;
        newArray[3] = 1;
        newArray[4] = 12;

        //assigning new values to the array
        newStringArray[0] = "Marco";
        newStringArray[1] = "James";
        newStringArray[2] = "Jason";
        newStringArray[3] = "Laura";
        newStringArray[4] = "Bonni";

        //Loop through the array
        for(int i = 0; i < myArray.length; i++){
            System.out.println("Item #: " + myArray[i]);
        }

    }

}
