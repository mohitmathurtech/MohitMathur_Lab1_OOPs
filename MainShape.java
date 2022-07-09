package learning;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle circle = new Circle("Red" , 14);
        Rectangle rectangle = new Rectangle("Blue",10,4);
        
        System.out.println("Area of cirle " + circle.calculateArea());
        System.out.println("Perimeter of cirle " + circle.calculatePerimeter());
        System.out.println("Area of Rectangle is " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle" + rectangle.calculatePerimeter());
}
