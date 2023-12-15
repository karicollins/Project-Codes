package homework;

public class Cylinder {

		private double radius;
		private double length;
		private static int numberOfObjects = 0;
		
		//no-arg constructor
		public Cylinder()	{
			radius = 1.0;
			length = 1.0;
			numberOfObjects++;
		}
		
		public Cylinder (double r, double len)	{
			radius = r;
			length = len;
			numberOfObjects++;
		}
		
		public double getRadius()	{
			return radius;
		}
		
		public double getLength()	{
			return length;
		}
		public void setRadius (double r)	{
			radius = r;
		}
		
		public void setLength(double len)	{
			length = len;
		}
		
		public double getArea()	{
			return Math.PI * radius * radius;
		}
		
		public double getVolume()	{
			return getArea() * length;
		}
		
		public static int getNumberOfObjects()	{
			return numberOfObjects;
		
		

	}

}
