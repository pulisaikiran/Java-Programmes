package demo2;

import java.util.Scanner;

public class countEvenOddInNumber {
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = sc.nextInt();
		
		int count1 = 0;
			
		if(num%2==0)
		{
			
			count1++;
			System.out.println("number of digits "+count1);
		}
		}
		
}

