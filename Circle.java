package learning;

public class Circle extends Shape{
	double radius;

	public Circle(String color,double radius){
		super(color);
		this.radius = radius;
	}
	public double calculateArea(){
		return 3.14* radius * radius;
	}
}