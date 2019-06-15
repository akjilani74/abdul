import java.util.Scanner;
class Switch
{
public static void main(String args[])
{
int i,n;
System.out.println("enter a number:");
Scanner sc=new Scanner(System.in);
 switch(i%2)
{
case 1:
case 3:
case 5:
System.out.println("even");
break;
case 2:
case 4:
case 6:
System.out.println("odd");
break;
}

}
}