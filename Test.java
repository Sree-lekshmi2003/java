package mca;
import  graphics.*;
import  java.util.Scanner;
  class Test
{
public static void main(String args[])
{
Scanner sc=new  Scanner(System.in);
System.out.println("enter the length and breadth of the reactangel:");
double length=sc.nextDouble();
double breadth=sc.nextDouble();
rectangle rect = new  rectangle(length, breadth);
System.out.println("area of a recatangle:" + rect.area() );


System.out.println("enter the base and height of a triangle:");
double base=sc.nextDouble();
double height=sc.nextDouble();
triangle tr=new triangle(base, height);
System.out.println("area of a triangel :" + tr.area() );


System.out.println("enter the side of squre:");
double side=sc.nextDouble();
square sq=new square(side);
System.out.println("area of  square is:" + sq.area() );


System.out.println("enter the radius of the circle :");
double radius=sc.nextDouble();
circle ci=new circle(radius);
System.out.println("area of  circle is:" + ci.area() );
sc.close();
}
}
