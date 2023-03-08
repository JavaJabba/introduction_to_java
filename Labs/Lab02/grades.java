package Labs.Lab02;
import java.util.Scanner;
import java.util.ArrayList;

public class grades {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        ArrayList<String> studentNames = new ArrayList<String>();
        ArrayList<Character> studentResults = new ArrayList<Character>();


        // get students
        System.out.print("Enter the number of students in the class: ");
        int noStudents = myScanner.nextInt();

        for (int i = 0; i <= (noStudents-1); i++){

            System.out.print("\nEnter Student Name: ");
            String name = myScanner.next();
            studentNames.add(name);
        // }
        
        // for (int i = 0; i <= (noStudents-1); i++){

            System.out.print("\nEnter Student Grade: ");
            int grade = myScanner.nextInt();
            grades.add(grade);

        }

        

        for (int i = 0; i <= (noStudents-1); i ++){
            int index = grades.get(i);
            if (index >= 80){
                studentResults.add('A');
            } else if (index >= 60){
                studentResults.add('B');
            } else if (index >= 40){
                studentResults.add('C');
            } else {
                studentResults.add('D');
            }
        }

        System.out.println("\nResults are as follows!");
        for (int i = 0; i <= (noStudents-1); i ++){
            System.out.println(studentNames.get(i) + " Scored: " + studentResults.get(i));
        }
        



        // close the scanner
        System.out.println("\nClosing Scanner...");
        myScanner.close();
        System.out.println("Scanner Closed.");        
    }
}
