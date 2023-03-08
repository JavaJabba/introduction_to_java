package Labs.lab03;
import java.util.Scanner;

public class threeD {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // initialise array
        int[][][] array = {
            {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            },
            {
                {23,45,26},
                {76,43,78},
                {34,667,32}      
            },
            {
                {343,232,678},
                {34,78,43},
                {33,876,45}
            }
        };

        //user input number to find
        System.out.print("\nEnter a number: ");
        int number = myObj.nextInt();
        // create a boolean for determining whether or not number has been found.
        boolean find = false;

        //find number in array
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                for (int k = 0; k <= 2; k++){
                    if (array[i][j][k] == number){
                        System.out.println("\nThe Array contains: " + number);
                        find = true;
                    }
                }
            }
        }
        if (find != true){
            System.out.println("\nThe Array does not contain: " + number);
        }

        // output 3D array
        System.out.println("Printing 3D Array!\n");
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                for (int k = 0; k <= 2; k++){
                System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }


        // close the scanner
        System.out.println("\nClosing Scanner...");
        myObj.close();
        System.out.println("Scanner Closed.");
    }
}
