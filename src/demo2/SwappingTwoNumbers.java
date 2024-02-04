package demo2;

import java.util.Scanner;

public class SwappingTwoNumbers {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x, y, temp;
      
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x and y");
        x = in.nextInt();
        y = in.nextInt();
        System.out.println("Before Swapping" + x + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping" + x + y);
         
    }
 
}