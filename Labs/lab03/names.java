package Labs.lab03;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class names {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        ArrayList<String> namesArray = new ArrayList<String>();


        //User input
        for (int i = 1; i <= 10; i++){
            System.out.print("Enter a name: ");
            String newName = myObj.nextLine();
            namesArray.add(newName);
        }

        // Output and sort
        System.out.println("Before Sort\n" + namesArray);

        Collections.sort(namesArray);

        System.out.println("After Sort\n" + namesArray);


        // close the scanner
        System.out.println("Closing Scanner...");
        myObj.close();
        System.out.println("Scanner Closed.");
    }
}
