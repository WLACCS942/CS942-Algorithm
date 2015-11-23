import java.math.BigDecimal;
import java.util.Scanner;

/* ALGORITHM 6 Greedy Change-Making Algorithm.
procedure change(c1, c2, . . . , cr : values of denominations of coins, where
c1 > c2 > · · · > cr ; n: a positive integer)
for i := 1 to r
di := 0 {di counts the coins of denomination ci used}
while n ≥ ci
di := di + 1 {add a coin of denomination ci}
n := n − ci
{di is the number of coins of denomination ci in the change for i = 1, 2, . . . , r}*/

public class changeMaking
{

	public static void main(String[] args) 
	{
		int [] array ={100,25,10,5,1};
		String[] changeValue={"Dollar :","Quarter:","Dime   :","Nickel :","Penny  :"};
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the Value:");
		int value =(int) (100* scr.nextDouble());
		//int valueInt = (int) (value*100);
		if(value>0)
		{
			for(int i=0;i<array.length;i++)
			
			{
					int change =  (int) Math.floor(value/array[i]);
					System.out.println(changeValue[i]+"\t"+change);
					value-= (change*array[i]);
			}
			
		}

	}
	
	

}
