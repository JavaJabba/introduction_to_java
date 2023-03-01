package Labs.Lab02;
import java.util.Scanner;
import java.lang.reflect.Array;
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
        System.out.println(divisors);

        int length = Array.getLength(divisors);

        for (int i = 0; i == length; i++){
            int sum = divisors.get(i);        
            
        }
    }
}
