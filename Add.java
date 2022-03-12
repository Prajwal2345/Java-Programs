//Take 2 inputs and add them using cmdline arguments.

class Add
{
	public static void main(String args[])	
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Addition: " + (a+b));
	}
}
