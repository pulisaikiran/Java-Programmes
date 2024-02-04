package demo2;

import java.util.Scanner;
// take input as 6 . factors of 6 is 1,2,3 so 1+2+3=6
public class NumberPerfectOrNot {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int sum=0;
        
        for(int i=1;i<n;i++)
        {
        	if(n%i==0)
        	sum= sum+i;
        }
        if(sum==n)
        {
        	System.out.println("Given number is perfect"+n);
        }
        else
        {
        	System.out.println("Given number is not perfect"+n);
        }
        
	}
}