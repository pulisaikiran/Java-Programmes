package demo2;

//public class SumOfAllPositiveNymbersInaArray {
//	
//	public static void main(String[] args)
//	{
//		int a1[]= {10,40,50,70,180};
//		int sum=0;
//		for(int i=0;i<a1.length;i++)
//		{
//			sum=sum+a1[i];
//		}
//		
//		System.out.println("sum of elements "+sum);	
//	}
//	}
//
//
// prgm to print all even numbers in array 
//public class SumOfAllPositiveNymbersInaArray {
//	
//	public static void main(String[] args)
//	{
//		int a1[]= {10,40,50,70,181};
//		int sum=0;
//	for(int i=0;i<a1.length;i++)
//		{
//		   if(a1[i]%2==0)
//			sum=sum+a1[i];
//		}		
//		System.out.println("sum of even elements in array "+sum);	
//	}






// prgm to greatest number in array
//	//public class SumOfAllPositiveNymbersInaArray {
//	
//	public static void main(String[] args)
//	{
//		int a1[]= {10,40,50,70,181};
//		int greatestNumber=0;
//	for(int i=0;i<a1.length;i++)
//		{
//		   if(a1[i]>=greatestNumber)
//			greatestNumber=a1[i];
//		}		
//		System.out.println("greatest number in array "+greatestNumber);	
//	}
//	
//}
//}


//prgm to find first index element in array
import java.io.*;
import java.util.*;

public class SumOfAllPositiveNymbersInaArray  {

    public static void main(String[] args) {

    	int a1[] = {10, 40, 50, 70, 181};
    	 int no=a1.length;

        if (a1.length >= 3) {
            int thirdElement = a1[2];
            System.out.println("Third element in the array: " + thirdElement);
        } else {
            System.out.println("Array does not have enough elements to find the third element.");
        }
}
}