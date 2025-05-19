import java.io.*;
class oefile
{
public static void main(String arg[]) throws IOException
{
try
{
FileReader f=new FileReader("num.txt");
FileWriter f1=new FileWriter("even.txt");
FileWriter f2 =new FileWriter("odd.txt");
int i;
while((i=f.read())!=-1)
{
if(i%2==0)
{
f1.write(i);
}
else
{
f2.write(i);
}
}
f.close();
f1.close();
f2.close();
}
catch(IOException e)
{
		System.out.println(e);
}
}
}	
		
		

