import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);     
      double lumCost = 8;
      double winCost = 11;
      double taxRate, total, grandTotal;
      int numBoard, numWin;

      System.out.println("Enter the sales tax rate: ");
      taxRate = in.nextDouble();
      System.out.println("How many boards do you need?");
      numBoard = in.nextInt();
      System.out.println("How many windows do you need?");
      numWin = in.nextInt();
      Construction test =  new Construction(lumCost, winCost, taxRate);
      total = test.lumberCost(numBoard) + test.windowCost(numWin);
      System.out.println("Total: " + total);
      grandTotal = test.grandTotal(total);
      System.out.println("Grand Total: " + grandTotal);
    }//end main method
}//end class
