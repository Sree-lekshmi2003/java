import java .util.*;
import java.io.*;
class fileread
{
public static void main(String args[])
{
try
{
FileReader f=new FileReader("f1.txt");
FileWriter f1=new FileWriter("f1.txt");
int i;
Scanner sc =new Scanner(System.in);
System.out.println("enter the content:");
String s=sc.nextLine();
f1.write(s);
while((i=f.read())!=-1)
{
System.out.print((char)i);
}
f1.close();
f.close();
}
catch(Exception e)
{
System.out.println("error");
}
}
}
