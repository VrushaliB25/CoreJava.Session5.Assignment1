

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





public class session5Assign1 {
	public static void main (String s[])
	{
	Circle C1=new Circle();
	C1.findArea();
	C1.findPerimeter();
		
}
	
}



