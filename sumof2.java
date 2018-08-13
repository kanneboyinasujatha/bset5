/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int firstnumber=0;
		int secondnumber=0;
		int sum;
		System.out.println("enter first number");
	            firstnumber=sc.nextInt();
		System.out.println("enter second number");
		secondnumber=sc.nextInt();
		sum=firstnumber+secondnumber;
		System.out.println("sum of two numbers is:"+sum);
	}
}
