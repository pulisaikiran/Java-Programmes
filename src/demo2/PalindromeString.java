package demo2;

import java.util.Scanner;

//public class PalindromeString {
//
//
//public static void main(String[] args) 
//{
//
//Scanner sc = new Scanner(System.in);
//System.out.println("ENTER A String");
//String str = sc.next();
//String org_string=str;
//String rev="";
//int len=str.length();
//for(int i=len-1;i>=0;i--)
//{
//	rev = rev+str.charAt(i);
//}
//if(org_string.equals(rev))
//{
//System.out.println(org_string + " string is palindrome ");
//
//}
//else
//{
//	System.out.println(org_string+" string is not palindrome ");
//
//}
//}
//}

//using only one string
public class PalindromeString {
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("ENTER A String");
	String str = sc.next();
	int i=0,j=str.length()-1;
	while(i<j)
	{
		if(str.charAt(i)!=str.charAt(j))
		{
			System.out.println("given string is not palindrome");
			System.exit(0);
		}
		i++;
		j--;
	}
		System.out.println("given string is  palindrome");
	}



}

