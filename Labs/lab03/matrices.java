package Labs.lab03;
import java.util.Scanner;

public class matrices {    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        

        //matrix 1
        int[][] matrix1 = new int[3][3];
        System.out.println("Enter the first matrix's data: "); 

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                matrix1[i][j] = myObj.nextInt();
            }
            System.out.println();
        }

        //matrix 2
        int[][] matrix2 = new int[3][3];
        System.out.println("Enter the second matrix's data: "); 

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                matrix2[i][j] = myObj.nextInt();
            }
            System.out.println();
        }        
        

        // print matrices
        System.out.println("First Matrix!\n");

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println("\n");
        }
        
        System.out.println("Second Matrix!\n");
        
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // adding matrices
        int[][] finalMatrix = new int [3][3];
        System.out.println("Time to add!\n");
        
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                finalMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(finalMatrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        // close the scanner
        System.out.println("\nClosing Scanner...");
        myObj.close();
        System.out.println("Scanner Closed.");
    }
}
