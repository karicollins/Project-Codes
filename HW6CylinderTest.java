package homework;

public class HW6CylinderTest {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		
		Cylinder c2 = new Cylinder(2.5,12.3);
		
		Cylinder c3 = new Cylinder();
		
		c3.setRadius(5.0);
		c3.setLength(6.5);
		
		System.out.print("The radius of the first cylinder is: " + c1.getRadius());
		System.out.println(" and the length is: " + c1.getLength());
		
		System.out.println("The base area of the second cylinder is: " + c2.getArea());
		
		System.out.println("The volume of the third cylinder is: " + c3.getVolume());
		
		System.out.println("The amount of objects created is: " + Cylinder.getNumberOfObjects());

	}

}
