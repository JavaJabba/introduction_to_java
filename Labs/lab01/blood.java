package Labs.lab01;

public class blood {

    public static void main(String[] args) {
        String name = "oops";
        int weight, age;
        int[] weights = {50, 36, 45, 100};
        int[] ages = {19, 20, 17, 80};
        int i = 0; 

        while (i < 3){

            weight = weights[i];
            age = ages[i];

            if (i == 0){
                name = "Alice";
            } else if (i == 1){
                name = "Bob";
            } else if (i == 2){
                name = "Jemmy";
            } else if (i == 3){
                name = "Clive";
            }

            if (weight < 40){
                System.out.println(name + " Cannot give blood due to weight.");
            } else if (age < 18){
                System.out.println(name + " is too young to give blood.");
            } else if (age > 60){
                System.out.println(name + " is too old to give blood.");
            } else {
                System.out.println(name + " can give blood!");
            }

            i++;


        }

    }  
}


