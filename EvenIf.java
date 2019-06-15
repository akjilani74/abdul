import java.util.Scanner;
classFactors
{
public static void main(String args[])
{
int i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");

n=sc.nextInt();

do{
if(n%i==0)
{
System.out.println("the factors of number is:"+i);
i=i+1;
}while(i<=n);
}
}