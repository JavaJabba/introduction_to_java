package Labs.lab03;
import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        

        //matrix data
        int[][] matrix = new int[3][3];
        System.out.println("Enter the matrix's data: "); 

        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                matrix[i][j] = myObj.nextInt();
            }
            System.out.println();
        }

        //output original matrix
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        //transpose
        int[][] martixT = new int[3][3];
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                martixT[i][j] = matrix[j][i];
            }
            System.out.println();
        }

        //output transposed matrix
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.print(martixT[i][j] + "\t");
            }
            System.out.println();
        }


        // close the scanner
        System.out.println("\nClosing Scanner...");
        myObj.close();
        System.out.println("Scanner Closed.");
    }
}
