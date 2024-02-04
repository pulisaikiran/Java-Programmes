package demo2;

//public class SumOfElementsInarray {
//	public static void main(String[] args)
//	{
//		int a1[]= {1,3,4,5};
//		int sum1=0;
//		
//		for(int i=0;i<a1.length;i++)
//		{
//			sum1 = sum1 +a1[i];
//		}
//		System.out.println("Sum of elements in array "+sum1);
//		
//	}
//}



import java.util.Scanner;

public class SumOfElementsInarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array (n): ");
        int n = scanner.nextInt();

        int a1[] = new int[n];
        int sum1 = 0;

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            a1[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum1 = sum1 + a1[i];
        }

        System.out.println("Sum of elements in array: " + sum1);

        scanner.close();
    }
}
