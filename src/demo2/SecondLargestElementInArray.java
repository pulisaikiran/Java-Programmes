

// prgm second largest element in array 
//package demo2;
//
//import java.util.Arrays;
//
//public class SecondLargestElementInArray {
//	
//
//		
//		public static void main(String[] args)
//		{
//			int a1[]= {50,20,30,40,80};
//			
//			
//			Arrays.sort(a1);
//			System.out.println(a1[a1.length-2]);
//			
//			
//		}
//
//	}


//print index of second largest element in array
//package demo2;
//import java.util.Arrays;
//
//public class SecondLargestElementInArray {
//
//    public static void main(String[] args) {
//        int a1[] = {50, 20, 30, 40, 80};
//
//       
//
//        Arrays.sort(a1);
//
//        // Find the second-largest element
//        int secondLargest = (a1[a1.length - 2]);
//
//        // Find and print the index of the second-largest element in the original array
//        for (int i = 0; i < a1.length; i++) {
//            if (a1[i] == secondLargest) {
//                System.out.println("Index of the second-largest element is " + i);
//                break; // No need to continue once found
//            }
//        }
//    }
//}
//PRINT SECOND LAREGST ELEMENT IN ARRAY
package demo2;
import java.util.Arrays;

public class SecondLargestElementInArray {

    public static void main(String[] args) {
        int a1[] = {5,10,30,40,80};
        
        int lar=O;
        int seclar=0;
        for(int i=0;i<a1.length;i++)
        {
        	if(a1[i]>lar)
        	{
        		seclar=lar;
        		lar=a1[i];
        	
        	}
        	else if(a1[i]>seclar && a1[i]!=lar)
        	{
        		seclar=a1[i];
        	}
        	
        }
        System.out.println(seclar);

			
			
		
    }
}





//PRINT SECOND LAREGST ELEMENT IN ARRAY WHICH CONTAINS NEGATIVE VALUES IN ARRAY

package demo2;
import java.util.Arrays;

public class SecondLargestElementInArrayWithNegative {

    public static void main(String[] args) {
        int a1[] = {5,10,30,40,80};
        
        int lar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;
        for(int i=0;i<a1.length;i++)
        {
        	if(a1[i]>lar)
        	{
        		seclar=lar;
        		lar=a1[i];
        	
        	}
        	else if(a1[i]>seclar && a1[i]!=lar)
        	{
        		seclar=a1[i];
        	}
        	
        }
        System.out.println(seclar);

			
			
		
    }
}



