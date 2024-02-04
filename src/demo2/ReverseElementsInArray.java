package demo2;

public class ReverseElementsInArray {
	
	static void reverse(int[] ar)
	{
		
		int i=0 , j=ar.length-1;
		while(i<j)
		{
			int t=ar[i];
			ar[i]=ar[j];
			ar[j]=t;
			i++;
			j--;
			
		}
		}
	
	public static void main(String[] args)
	{
		int[] ar= {3,5,10,40,25,15,7};
		reverse(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i] +" ");
		}
	}

}
