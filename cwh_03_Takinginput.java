//Taking input from the user.

import java.util.Scanner;
public class cwh_03_Takinginput
{
    public static void main(String[]args)
    {
        System.out.println("taking input from the user");
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter the number 1");
        int a = Sc.nextInt();
        System.out.println("Enter the number 2");
        int b = Sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    }
}
