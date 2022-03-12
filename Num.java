//Program to take numbers using Scanner class.

import java.util.Scanner;
class Num
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("2 entered numebrs: " + a + " " + b);
	}
}