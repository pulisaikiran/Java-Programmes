package demo2;

public class FindDuplicatesInString {
	
	public static void main(String[] args)
	{
	 String s="saikiran";
	 for (int i = 0; i < s.length(); i++) 
	 {
         for (int j = i + 1; j < s.length(); j++)
         {
             if (s.charAt(i) == s.charAt(j)) {
                 System.out.println("Duplication found at " + s.charAt(i) + ", Index: " + i);
             }
         }
     }
	 
	}
}
	 
	
	
	
	
	