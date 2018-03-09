import java.util.*;
public class Cube extends ThreeDShape
{
    public double side;
    public Cube(double side)
    {
	this.side = side;
    }

    public double getArea()
    {
	return (6*this.side*this.side);
    }
    public double getVolume()
    {
	return (this.side*this.side*this.side);
    }
}
