package Labs.Lab02;
import java.util.Scanner;

public class coffee {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        

        // get user input
        System.out.print("Enter the weight of a bag of coffee: ");
        double coffeeWeight = myScanner.nextDouble();

        System.out.print("Enter the number of bags sold: ");
        int bagsSold = myScanner.nextInt();

        // calculations
        double totalPrice = coffeeWeight * bagsSold * 5.99;
        double totalPriceTax = totalPrice + (totalPrice * 0.0725);

        // output
        System.out.println("\nNumber of bags sold: " + bagsSold);
        System.out.println("Weight per bag sold: " + coffeeWeight + " lb");
        System.out.println("Price per pound: $5.99");
        System.out.println("Sales tax: 7.25%");
        System.out.println("Total price: $ " + totalPriceTax);

        // close the scanner
        System.out.println("\nClosing Scanner...");
        myScanner.close();
        System.out.println("Scanner Closed.");
    }
}
