import java.util.*;
import java.lang.*;
class Table
{
public static void main(String[]args)
{
System.out.println("enter the number which you want the table");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=10;i<=18;i++)
{
System.out.println(+n+"*"+i+"="+(n+i));
}
}
}
