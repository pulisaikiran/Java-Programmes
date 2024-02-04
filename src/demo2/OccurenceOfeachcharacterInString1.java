package demo2;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class OccurenceOfeachcharacterInString1 {
	
	public static void main(String[] args)
	{
	 
	 
	 String s1="hello";
	 Map<Character,Integer> map=new HashMap();
	 char[] chars=s1.toCharArray();
	 
	 for(char ch:chars)
	 {
		 if(!map.containsKey(ch))
		 {
			 map.put(ch, 1);
		 }
		 else
		 {
			 int value =map.get(ch);
			 map.put(ch, value+1);
		 }
	 }
	 System.out.println(map);

}
}