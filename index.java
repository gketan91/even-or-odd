//Practical no:1b
import java.io.*;
import java.util.*;
class number1
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is even");
		}
		else
		{
			System.out.println(num+" is odd");
                                     }
	}
}
