package Labs;
import java.lang.Math;

public class circle {
    double pi = 3.14;
    double radius = 111.55;
    double area;
    double circumference;

    public circle(){
        area = pi*(Math.pow(radius, 2));
        circumference = 2 * pi * radius;
    }
    
    public static void main(String[] args) {
        circle myCircle = new circle();
        System.out.println("Area of the circle is: " + myCircle.area );
        System.out.println("Circumference of the circle is: " + myCircle.circumference );
    }
}


