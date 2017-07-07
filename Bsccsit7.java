import java.util.Scanner;
public class Bsccsit7 {
public static void main(String[] args) {
int i,num[],large=0;
num=new int[10];
for(i=0;i<10;i++)
{
Scanner input=new Scanner(System.in);
System.out.println("enter a number");
num[i]=input.nextInt();
if(num[i]>large)
{
large=num[i];
}
}
System.out.println("\n the largest number is "+large);
}
}
