package Labs;

public class weights {
    double earthWeight = 50;
    double mercuryWeight;
    double venusWeight;
    double jupiterWeight;
    double saturnWeight;
    
    public weights(){
        mercuryWeight = earthWeight * 0.4;
        venusWeight = earthWeight * 0.9;
        jupiterWeight = earthWeight * 2.5;
        saturnWeight = earthWeight * 1.1;
    }

    public static void main(String[] args) {
        weights newWeight = new weights();
        System.out.print("Alice's weight on Mercury is: " + newWeight.mercuryWeight + "kg\n");
        System.out.print("Alice's weight on Venus is: " + newWeight.venusWeight + "kg\n");
        System.out.print("Alice's weight on Jupiter is: " + newWeight.jupiterWeight + "kg\n");
        System.out.print("Alice's weight on Saturn is: " + newWeight.saturnWeight + "kg\n");
    }
}
