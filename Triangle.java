package learning;

class Triangle extends Shape{
	int height, base;
    
	public Triangle (String color, int height, int base){
		super(color);	
		this.height=height;
		this.base = base;
	}
	
	@Override
	public double calculateArea(){
		return (base*height)/2;
	}
	
	@Override
	public double calculatePerimeter() {
		return this.height+this.base;
	}
	
	@Override
	public void display() {
		System.out.println("This is a " + super.color + " triangle");
	}
}
