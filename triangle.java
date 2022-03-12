//Area of triangle.

class triangle
{
	public static void main(String args[])
	{
		double b = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		final double PI = (double)3.14;
		double area = (b*h)/2;
		System.out.println("Area of triangle: " + area);
	}
}