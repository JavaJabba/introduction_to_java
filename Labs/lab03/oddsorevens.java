package Labs.lab03;
import java.util.ArrayList;
import java.util.Scanner;

public class oddsorevens {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        ArrayList<Integer> evens = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++){
            System.out.print("Enter a number: ");
            int newNumber = myObj.nextInt();
            numbers.add(newNumber);
        }
        System.out.println("Starting list: " + numbers);

        for (int i: numbers){
            
            if (i % 2 == 0){
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        System.out.println("odds: "+ odds);
        System.out.println("evens: "+ evens);

      // close the scanner
      System.out.println("Closing Scanner...");
      myObj.close();
      System.out.println("Scanner Closed.");
    }
}
