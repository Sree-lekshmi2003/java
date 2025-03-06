import java.util.*;
class maipu
{
public static void main(String args[])

{
Scanner sc= new Scanner(System.in);
System.out.println("enter a string:");
 String s1=sc.nextLine();
 System.out.println("enter a string  to concate:");
 String s2=sc.nextLine();
 
 System.out.println("to convert uppercase:"+s1.toUpperCase());
 System.out.println("to convert lowercase:"+s1.toLowerCase());
 System.out.println("string length:"+s1.length());
 System.out.println("concatinate two words:"+s1.concat(s2));
 System.out.println("empty or not:"+s1.isEmpty());

}
}
