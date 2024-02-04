package demo2;

import java.util.Arrays;

public class RemoveJunk {
	
	public static void main(String[] args)
	{
	String s = "@#$%*& string 12345";
	s=s.replaceAll("[^a-zA-Z0-9]","");
	
	System.out.println(s);
	
	}

}
