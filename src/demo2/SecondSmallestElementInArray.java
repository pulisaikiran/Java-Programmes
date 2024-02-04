package demo2;

public class SecondSmallestElementInArray {
	
	public static void main(String[] args) {
        int a1[] = {5,-10,-30,40,80};
        
        int smal=Integer.MAX_VALUE;
        int secondsmal=Integer.MAX_VALUE;
        for(int i=0;i<a1.length;i++)
        {
        	if(a1[i]>smal)
        	{
        		secondsmal=smal;
        		smal=a1[i];
        	
        	}
        	else if(a1[i]>secondsmal && a1[i]!=smal)
        	{
        		secondsmal=a1[i];
        	}
        	
        }
        System.out.println(secondsmal);

			
			
		
    }

}
