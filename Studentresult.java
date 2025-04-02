import java.util.*;
interface sport
{
public void sportsgetdata();
public void sportsdispdata();
}
class student
{
String name;
int rollno;
int s1,s2;
student( String name,  int rollno, int s1, int s2)
{
this.name=name;
this.rollno=rollno;
this.s1=s1;
this.s2=s2;

}
}
class result extends student implements sport
{
int rank;
String item;
Scanner sc=new Scanner(System.in);
result(String name, int rollno, int s1, int s2)
{
super(name , rollno , s1 , s2);
}
void acadamic() 
    { 
        int percentage = (s1+s2)*100/200; 
        System.out.print("Percentage = " + percentage); 
    } 
 
    public void sportsgetdata() 
    { 
        System.out.print("Enter the item name "); 
        item = sc.nextLine(); 
        System.out.print("Enter the rank "); 
        rank = sc.nextInt(); 
    } 
 
    public void sportsdispdata() 
    { 
        System.out.println("Sports item :" + item); 
        System.out.print("Rank : "+ rank); 
    } 
 
} 
 
class Studentresult
 
{ 
    public static void main(String args[]) 
    { 
        Scanner in = new Scanner(System.in); 
 
        System.out.print("Enter tha name "); 
        String name = in.nextLine(); 
        System.out.print("Enter Roll no "); 
        int rollno= in.nextInt(); 
        System.out.print("Enter mark in first subject "); 
        int s1 = in.nextInt(); 
        System.out.print("Enter mark in second subject "); 
        int s2 = in.nextInt(); 
         
        result r = new result(name, rollno , s1, s2); 
        r.sportsgetdata(); 
         
        r.acadamic(); 
        System.out.println(); 
        r.sportsdispdata(); 
  
 
    } 
} 
