package demo2;

import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num = sc.nextInt();
		int count = 0;
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println("number of digits "+count);
}
}
