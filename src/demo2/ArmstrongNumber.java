package demo2;
// suppose you have taken n is 153 = 1(3)+5(3)+3(3)=153
import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scanner.nextInt();
        int original=n;
        int temp;
       int Armstrong = 0;
        while(n>0)
        {
        	temp = n%10;
        	temp = (int) Math.pow(temp, 3);
        	Armstrong = Armstrong+temp;
        	n=n/10;
        }
        if(Armstrong==original)
        {
        	System.out.println("given number is armstrong");
        }
        else
        {
        	System.out.println("given number is not armstrong");
        }

}
}