package demo2;

 class Sampleprgm {
	 
	 public static void main(String[] args)
	   {
	

	
	String s1="abcdabcd";
	String rev="";
	//String = s1.length();
	for(int i=s1.length()-1;i>=0;i--)
	{
		
		rev=rev+s1.charAt(i);
	}
   System.out.println("the reverse string is "+ rev);

	   }
 }

