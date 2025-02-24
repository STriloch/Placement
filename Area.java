import java.util.*;
abstract class Circle
{
	protected double area;
	abstract void calc_area();
	abstract void calc_circum();
}
class Area extends Circle
{
	private double r;
	private double circum;
	public Area()
	{
		Scanner in = new Scanner(System.in);
		r=in.nextDouble();
	}
	void calc_area()
	{
		area=3.14*r*r;
		System.out.println("Area= "+area);
	}
	void calc_circum()
	{
		circum=2*3.14*r;
		System.out.println("Circumference= "+circum);
	}

	public static void main(String s[])
	{
	    
		Area obj=new Area();
		obj.calc_area();
		obj.calc_circum();
	}
}