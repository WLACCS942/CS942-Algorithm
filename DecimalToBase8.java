import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBase8 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the decimal Value:");
			int value=sc.nextInt();
			changeBase(value);
		}
		catch(InputMismatchException e)
		{
			System.out.println("ERROR! Invalid Value");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public static void changeBase(int n) {
	      
	      if (n != 0) {
	    	  changeBase(n/8);
	         System.out.print(n%8);
	      }
	      
	   }
		
}
