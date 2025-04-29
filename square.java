
package graphics;
public class square implements figure
{
 public double side;
public square(double side)
{
this.side=side;
}
 public double area()
{
return side*side;
}
}
