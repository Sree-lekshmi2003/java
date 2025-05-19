import java .io.*;
class file
{
public static void main(String arg[]) throws IOException
{
FileReader f=new FileReader("f1.txt");
FileWriter f1 =new FileWriter("f2.txt");
int c;
while((c=f.read())!=-1)
{
f1.write(c);
System.out.print((char)c);
}
f.close();
f1.close();
}
}
