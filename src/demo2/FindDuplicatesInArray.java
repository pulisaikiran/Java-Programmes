package demo2;

public class FindDuplicatesInArray {
	
	public static void main(String[] args)
	{
		String arr[]= {"java","c","Python","flask","java"};
		boolean flag=false;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				
				if(arr[i]==arr[j]) {
					System.out.println("duplication found at "+arr[i]);
					flag=true;
				}
				
				
			}
		}
		if(flag==false)
		{
			System.out.println("duplication  notfound  ");
		}
	}

}
