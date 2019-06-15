import java.util.Scanner;
class AdditionFunction{
Scanner sc=new Scanner(System.in);
int readData(){
System.out.println("enter a num");
int a=sc.nextInt();
return a;
}
void openTotal(int a,int b){
System.out.println("sum is:"+(a+b));
}
}
class Arithematics{
public static void main(String a[]){
AdditionFunction af=new AdditionFunction();
int x=af.readData();
int y=af.readData();
object.openTotal(x,y);
}
}