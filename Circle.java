package homework;
import java.lang.*;

public class Circle {
	private double radius, centerX, centerY;
	
	public Circle (double radius, double centerX, double centerY){
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	public Circle(){
		this(1.0, 1.0,1.0);
		
	}
	public double getRadius(){
		return radius;
	}
	public double getCenterX(){
		return centerX;
	}
	public double getCenterY(){
		return centerY;
	}
	public void setRadius(double r){
		radius = r;
	}
	public void setCenterX (double r){
		centerX = r;
	}
	public void setCenterY (double r){
		centerY = r;
	}
	
	public double distance (Circle c){
	double x1 = c.centerX-centerX;
	double y1 = c.centerY-centerY;
	double x = Math.pow(x1, 2);
	double y = Math.pow(y1, 2);
	double d = Math.sqrt(x + y);
	return d;
	}
	

}
