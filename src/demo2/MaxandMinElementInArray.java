package demo2;

public class MaxandMinElementInArray{
	
	public static void main(String[] args)
	{
		int a1[]= {50,20,30,40,80};
		
		int max=a1[0];
		
		int min=a1[0];
		
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i]>max)
			{
				max=a1[i];
			}
			if(a1[i]<min)
			{
				min=a1[i];
			}
		}
		System.out.println("max element is "+max);
		
		System.out.println("min element is "+min);
		
		
	}

}
