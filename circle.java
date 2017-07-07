public class circle
{
double pi,area;
circle()
{
pi=3.14;
}
void cir_area(double rad)
{
area=pi*rad*rad;
System.out.println("area of circle is "+area);
}
}
public class jmain
{
public static void main(String args[])
{
circle ob;
ob=new circle();
ob.cir_area(4.5);
}
}
