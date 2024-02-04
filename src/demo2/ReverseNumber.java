package demo2;
import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER A NUMBER");
			int num = sc.nextInt();
			int rev=0;
			while(num!=0)
			{
				rev=rev*10 + num%10;  
				num = num/10; 
				
			}
			System.out.println("reverse number is "+rev);
			
		}
	}


//0+1234%10 =4  40+123%10 = 40+3 = 43  , 430+2=432 , 4320+1=4321
//1234/10 = 123 , 123/10 = 12 , 12/10 =1 , 1/10 = 0