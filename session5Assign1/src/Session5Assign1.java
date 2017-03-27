
abstract class Figure
	{
		double dim1;
		abstract void findArea();
		abstract void findPerimeter();
		
	}
	class Circle extends Figure
	{
		Circle()
		{
			dim1=5.5;	
		}
		
		void findArea()
		{
			double pi;
			pi=3.14;
			double area;
			area=pi*dim1*dim1;
			System.out.println("The area of a circle with diameter "+dim1+" is "+area);
		}
		void findPerimeter()
		{
			double pi;
			pi=3.14;
			double peri;
			peri=2*pi*dim1;
			System.out.println("The perimeter/circumference of a circle with diameter "+dim1+" is "+peri);
		}
		
	}
	class Rectangle extends Figure
	{
		Rectangle()
		{
				
		}
		int width=5, length=6;
		
		void findArea()
		{
			double area;
			area=(double) width*length; 
			System.out.println("The area of a Rectangle with width "+width+" and length "+length+" is "+area);
		}
		void findPerimeter()
		{
			double peri;
			peri=(double) 2*(width+length); 
			System.out.println("The perimeter of a Rectangle with width "+width+" and length "+length+" is "+peri);
		}
		
	}
	class Triangle extends Figure
	{
		Triangle()
		{
				
		}
		int base=5, height=6;
		int side1=7, side2=8;
		
		void findArea()
		{
			double area;
			area=(double) (base*height)/2; 
			System.out.println("The area of a triangle with base "+base+" and height "+height+" is "+area);
		}
		void findPerimeter()
		{
			double peri;
			peri=(double) (side1+side2+base); 
			System.out.println("The perimeter of a triangle with base "+base+" side1 "+ side1+" and side2 "+side2+" is "+peri);
		}
		
	}

public class Session5Assign1 {
	public static void main(String s[])
	{
	Circle C1=new Circle();
	C1.findArea();
	C1.findPerimeter();
	Rectangle R1=new Rectangle();
	R1.findArea();
	R1.findPerimeter();
	Triangle T1=new Triangle();
	T1.findArea();
	T1.findPerimeter();
		
}
}
