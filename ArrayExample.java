import java.util.Scanner;
class ArrayExample
{
public static void main(String args[])
{
int marks[]=new int[3];
int sum=0;
String sub[]={"eng","hin","mat"};
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++){

System.out.println("enter a number:\n"+sub[i]+" marks: ");
marks[i]=sc.nextInt();
sum=sum+marks[i];
}

System.out.println("\nelements in marks array are:");

for(int x=0;x<3;x++){
System.out.println(sub[x]+" marks "+marks[x]);
}
System.out.println("total marks   "+sum);
}
}