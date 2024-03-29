package Labs.lab03;
import java.util.Scanner;
import java.util.ArrayList;

public class sd {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        ArrayList<Integer> stdArray = new ArrayList<Integer>();

        // user defines size of array
        System.out.print("Enter size of array: ");
        int N = myObj.nextInt();


        // adding to array from one to user defined size
        for (int i = 1; i <= N; i ++){
            System.out.print("Enter a number: ");
            int newNumber = myObj.nextInt();
            stdArray.add(newNumber);
        }

        // Define length
        int length = N;

        // get sum
        double sum = 0.0;
        for (double i : stdArray){
            sum += i;
        }

        // get mean 
        double mean = sum / length; 

        // Standard Deviation values
        double standardDeviation = 0.0;
        for (double number: stdArray){
            standardDeviation += Math.pow(number - mean, 2);
        }

        System.err.println(Math.sqrt(standardDeviation / length));


        
        // close the scanner
        System.out.println("Closing Scanner...");
        myObj.close();
        System.out.println("Scanner Closed.");
    }
}
