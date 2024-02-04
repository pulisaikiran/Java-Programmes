package demo2;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfEachCharcterInString {
	
	public static void main(String[] args)
	{
	 
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter input string");
	 String inputString = sc.nextLine();
	char arr[]=inputString.toCharArray();
	 for(int i=0;i<arr.length;i++) {
	 int count=0;
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("enter input character for comparison:" );
		 char comparisonChar = sc1.next().charAt(0);
		// for(int j=0;j<arr.length;j++) {
		 //if(arr[i]==arr[j])
			// count++;
		// }
		 if (arr[i] == comparisonChar) {
             count++;
	 }
		 System.out.println("Occurrences of character '" + comparisonChar + "' in the string: " + count + " times");
		  
	 }
	 
}
}
	
