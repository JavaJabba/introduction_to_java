package Labs;

public class Temperature {
   Double tempC;
   Double tempF;

   public Temperature(){
      tempC = 10.2;
      tempF = ((tempC * 9/5) + 32);
   }
   public static void main(String args[]){
      Temperature myTemp = new Temperature();
      System.out.println("Temperature in Celsius is: "+ myTemp.tempC );
      System.out.println("Temperature in Fahrenheit is: "+ myTemp.tempF );
   } 
}
