package Labs.Lab02;
import java.util.Scanner;
import java.util.ArrayList;

public class perfectNumber {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Integer> divisors = new ArrayList<Integer>();


        // get input
        System.out.print("Enter a numnber between 20 and 30: ");
        int newNumber = myScanner.nextInt();

        while (newNumber > 1){
            newNumber = newNumber / 2;
            divisors.add(newNumber);
            System.out.println(newNumber);
        }
        divisors.add(2);
        System.out.println(divisors);

        int sum = 0;
        int length = divisors.size();
        System.out.println(length);
        for (int i = 0; i <= (length-1); i++){
            int index = divisors.get(i);
            sum = sum + index;
            System.out.println(sum);
        }

        // close the scanner
        System.out.println("Closing Scanner...");
        myScanner.close();
        System.out.println("Scanner Closed.");
    }
}
