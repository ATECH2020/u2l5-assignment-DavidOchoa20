import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
      double startLat, startLong, endLat, endLong, distance;

      //User Input
      Scanner in = new Scanner(System.in);  
      System.out.print("Enter the latitude of the starting location: "); 
      startLat = in.nextDouble();
      System.out.print("Enter the longitude of the starting location: ");
      startLong = in.nextDouble();
      System.out.print("Enter the latitude of the ending location: "); 
      endLat = in.nextDouble();
      System.out.print("Enter the longitude of the ending location: ");
      endLong = in.nextDouble();

      //creates start and end GeoLocation
      GeoLocation startLoc = new GeoLocation(startLat, startLong);
      GeoLocation endLoc = new GeoLocation(endLat, endLong);

      //Calculations
      distance = startLoc.distanceFrom(endLoc);
      System.out.print("The distance is " + distance + " miles.");
    }//end main method
}//end class