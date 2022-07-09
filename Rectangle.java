package learning;

public class Rectangle extends Shape{
	int width, length;

	public Rectangle(String color, int width, int length){
		super(color);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea(){
		return this.length*this.width;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2*(this.length + this.width);
	}
	
	@Override
	public void display() {
		System.out.println("This is a " + super.color + " rectangle");
	}
}
