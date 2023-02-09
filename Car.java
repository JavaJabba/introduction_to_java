//Class notes 08/02

public class Car{
    int max_speed; // Creating a class attribute

// Creating a class constructor for the Car class
    public Car(){
    max_speed = 200; // Setting the initial value for the class attribute max_speed
    }
    public static void main(String[] args){
        Car Toyota = new Car(); // Creating an object of class Car (This will call the constructor)
        System.out.println(Toyota.max_speed); // Prints the value of max_speed
    }
}

//class and object with passing parameters
public class Main{
    int x;
    public Main(int y){
        x = y;
    }
    public static void main(String[] args){
        Main myObj = new Main(5);
        System.out.println(myObj.x);
    }
}