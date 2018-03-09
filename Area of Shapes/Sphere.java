import java.util.*;
    public class Sphere extends ThreeDShape
{
    public double radius;
    public Sphere(double radius)
    {
	this.radius = radius;
    }

    public double getArea()
    {
	return (4*(3.14159)*this.radius*this.radius);
    }
    public double getVolume()
    {
	return ((4/3)*(3.14159)*this.radius*this.radius*this.radius);
    }
}
