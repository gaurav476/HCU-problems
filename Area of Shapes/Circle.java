import java.util.*;
public class Circle extends TwoDShape
{
    public double radius;

    public Circle(double radius)
    {
	this.radius = radius;
    }
    public double getArea()
    {
	return (3.142857)*this.radius*this.radius;
    }
    public double getPerimeter()
    {
	return 2*(3.142857)*this.radius;
    }

}
