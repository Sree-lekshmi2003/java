package graphics;
 public class rectangle implements figure
{
public	 double length;
public double breadth;
public  rectangle(double length , double breadth)
{
this.length=length;
this.breadth=breadth;
}
public double area()
{
return length*breadth;
}
}
