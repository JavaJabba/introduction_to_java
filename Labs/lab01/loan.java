package Labs.lab01;

public class loan {


    public static void main(String[] args) {

        double loanAmount = 0;
        int[] empIncomes = {1500, 700, 100};
        int loan;
        int i = 0;
        String name = "oops";

        while (i <= 2){

            if (i == 0){
                name = "Alice";
            } else if (i == 1){
                name = "Bob";
            } else if (i == 2){
                name = "Clive";
            }


            if (empIncomes[i] > 1000){
                loan = 1;
            } else if (empIncomes[i] > 500){
                loan = 2;
            } else if (empIncomes[i] > 200){
                loan = 3;
            } else {
                loan = 4;
            }

            switch(loan){
                case 1: loanAmount = empIncomes[i] * 3.5;
                        break;
                case 2: loanAmount = empIncomes[i] * 2.5;
                        break;  
                case 3: loanAmount = empIncomes[i] * 2;
                        break;
                case 4: loanAmount = 0;
                        break;
            }

            System.out.println(name + "'s income is: " + empIncomes[i] + " and their loan will be : " + loanAmount);
            i++;

        }
    }
}
