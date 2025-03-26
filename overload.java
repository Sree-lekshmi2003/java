import java.util.Scanner;
class shape
{
void area(int l,int b)
{
System.out.println("area of the rectangle"+l*b);

}
void area(float r)
{
System.out.println("area of the circle:"+3.14*r*r);
}
void area(double s)
{
System.out.println("area of the square:"+s*s);
}
}



class overload
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
shape a = new shape();
System.out.println("enter the breadth and length of the reactangle:");
int l=sc.nextInt();
int b=sc.nextInt();
a.area(l,b);


System.out.println("enter the radious of the circle:");
float r=sc.nextFloat();
a.area(r);

System.out.println("enter the side length of the square:");
double s=sc.nextDouble();
a.area(s);
}
}
