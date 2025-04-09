
package graphics;
 public class triangle implements figure
{
public double base;
public double height;
public triangle(double base, double height)
{
this.base=base;
this.height=height;
}
public double area()
{
return  0.5*base*height;
}
}

