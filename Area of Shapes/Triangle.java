import java.util.*;
public class Triangle extends TwoDShape
{
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double a,double b,double c)
    {
	this.sideA = a;
	this.sideB = b;
	this.sideC = c;
    }
    public double getArea()
    {
	double s;
	s=(this.sideA+this.sideB+this.sideC)/2;
        return Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
    }
    public double getPerimeter()
    {
	return this.sideA+this.sideB+this.sideC;
    }

}
