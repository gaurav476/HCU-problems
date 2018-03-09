import java.util.*;
public class Test
{
    public static void main(String []args)
    {
	Shape[] s = new Shape[10];
	int obj;
	Random choice = new Random();
	for(int i=0; i<10; i++)
	    {
		obj = choice.nextInt(4);
		if(obj == 0)
		    s[i] = new Circle(10);
		else if(obj == 1)
		    s[i] = new Triangle(2,4,5);
		else if(obj == 2)
		    s[i] = new Sphere(8);
		else
		    s[i] = new Cube(12);
	    }
	for(int i=0; i<10; i++)
	    {
		if(s[i] instanceof TwoDShape)
		    {
			TwoDShape twodim  = (TwoDShape) s[i];
			System.out.println("Area of 2DShape " +twodim.getArea());
			System.out.println("Perimeter of 2DShape " +twodim.getPerimeter());

		    }
		else if(s[i] instanceof ThreeDShape)
		    {
			ThreeDShape threedim = (ThreeDShape) s[i];
			System.out.println("Area of 3DShape " +threedim.getArea());
			System.out.println("Volume of 3DShape " +threedim.getVolume());
		    }

	    }
    }
}
