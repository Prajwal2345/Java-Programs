//Calculate volume and CSA of a cone.

class Volume
{
	public static void main(String args[])
	{
		final double PI = (double)3.14;
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		double l = Double.parseDouble(args[2]);
		double volume = (PI*r*r*h)/3;
		double csa = PI*r*l;
		System.out.println("Volume of cone: " + volume);
		System.out.println("CSA of cone: " + csa);
	}
}