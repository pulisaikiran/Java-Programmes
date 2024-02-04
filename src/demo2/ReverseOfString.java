package demo2;

import java.util.Scanner;

public class ReverseOfString {


public static void main(String[] args) 
{

Scanner sc = new Scanner(System.in);
System.out.println("ENTER A String");
String str = sc.next();
//String org_string=str;
String rev="";
int len=str.length();
for(int i=len-1;i>=0;i--)
{
	rev = rev+str.charAt(i);
}
System.out.println("reversed string is "+rev);

}
}
