package demo2;

public class NumbersOfNumericalsInString {
	public static void main(String[] args) 
	{
  String s1="s1fg378";
  int count=0;
  for(int i=0;i<=s1.length()-1;i++)
  {
	  char ch = s1.charAt(i);
	  if(Character.isDigit(ch))
	  {
		  count++;
	  }
	 
  }
  System.out.println("number of numericals" +count);
}
}